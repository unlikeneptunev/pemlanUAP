package uap.mains;

import uap.models.Sphere;
import uap.models.Torus;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("AHMAD THORIQ HAFIDZURROHMAN"); 
        System.out.println("245150701111026");          
        System.out.println("=============================================");

        // Donat dengan lubang (donat aseli)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadius = sc.nextDouble(); // 7
        System.out.print("Isikan radius   : ");
        double minorRadius = sc.nextDouble(); // 3,5

        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();

        // Donat tanpa lubang
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double sphereRadius = sc.nextDouble(); // 21

        Sphere sphere = new Sphere(sphereRadius);
        sphere.printInfo();
        
        sc.close();
    }
}