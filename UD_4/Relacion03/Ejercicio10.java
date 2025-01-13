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

        if (primerNumero < segundoNumero) {
            for (int i = primerNumero; i <= segundoNumero; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("El primer numero es mayor. Le damos la vuelta a los numeros.");
            for (int i = segundoNumero; i <= primerNumero; i++) {
                System.out.println(i);
            }
        }

        miScanner.close();

    }
}