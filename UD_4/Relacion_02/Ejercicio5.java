package Relacion_02;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numero;
        boolean estaEntre10y20;

        System.out.println("Introduce un número: ");
        numero = miScanner.nextInt();

        estaEntre10y20 = (numero >= 10 && numero <= 20);

        if (estaEntre10y20) {
            System.out.println("El numero está entre 10 y 20.");
        } else {
            System.out.println("El numero NO está entre 10 y 20.");
        }

        miScanner.close();
    }
}
