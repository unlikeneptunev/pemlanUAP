package uap.interfaces;

public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000; // Biaya kirim per kg
    
    double calculateCost();
}