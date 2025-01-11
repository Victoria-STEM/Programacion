package UD_4.Relacion03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;

        System.out.println("Introduce un numero entero:");
        primerNumero = miScanner.nextInt();

        System.out.println("Introduce el segundo numero entero:");
        segundoNumero = miScanner.nextInt();

        if (primerNumero >= segundoNumero) {
            System.out.println("Error: el primer numero debe ser menor que el segundo.");
        }

        while (primerNumero <= segundoNumero) {
            System.out.println(primerNumero);
            primerNumero++;
        }

        miScanner.close();

    }
}