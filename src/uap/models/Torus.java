package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculable, PiRequired, MassConverter, ShippingCostCalculator {
    private double majorRadius; // Radius dari pusat Torus ke pusat tabung
    private double minorRadius; // Radius tabung 

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Donat dengan lubang");
    }

    @Override
    public double getVolume() {
        // Rumus Volume : 2 * pi^2 * R * r^2
        return 2 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override
    public double getSurfaceArea() {
        // Rumus Luas Permukaan : 4 * pi^2 * R * r
        return 4 * Math.pow(PI, 2) * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        // Rumus Massa : Luas Permukaan * Ketebalan * Massa Jenis
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
    }
}