package uap.interfaces;

public interface MassCalculable {
    int DENSITY = 8;        // Massa jenis bahan (g/cm^3)
    double THICKNESS = 0.5; // Ketebalan bahan (cm)
    
    double getMass();
}