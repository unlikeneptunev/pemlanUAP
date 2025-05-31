package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, MassCalculable, PiRequired, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        setName("Donat tanpa lubang");
    }

    @Override
    public double getVolume() {
        // Rumus Volume : (4/3) * pi * r^3
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        // Rumus Luas Permukaan : 4 * pi * r^2
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override
    public double getMass() {
        // Rumus massa : Luas Permukaan * Ketebalan * Massa Jenis
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        // Biaya dihitung dari pembulatan ke atas berat (kg) dikali harga per kg
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        long shippingCost = (long) calculateCost();
        System.out.println("Biaya kirim     : Rp" + shippingCost);
        System.out.println("=============================================");
    }
}