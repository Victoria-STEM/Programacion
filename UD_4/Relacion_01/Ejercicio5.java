package Relacion_01;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        double pesoEnlaTierra;
        double pesoEnLaLuna;

        System.out.println("Introduce tu peso: ");
        pesoEnlaTierra = miScanner.nextDouble();

        pesoEnLaLuna = pesoEnlaTierra * 0.165;
        System.out.println("En la luna pesarías: " + pesoEnLaLuna + " kg.");

        miScanner.close();
    }
}
