package UD_4.Relacion03;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String primeraPalabra = "c";
        String siguientePalabra = "x";

        System.out.println("Introduce una palabra:");
        primeraPalabra = miScanner.next();

        while (!primeraPalabra.equals(siguientePalabra)) {
            System.out.println("Repite la palabra:");
            siguientePalabra = miScanner.next();
        }

        miScanner.close();
        
    }    
}
