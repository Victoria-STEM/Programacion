package Relacion_02;

import java.util.Scanner;

public class Ejercicio9_2 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroUsuario = 0;
        int primerNumero;
        int segundoNumero;
        int sumatorio;

        while (numeroUsuario < 10 || numeroUsuario > 99) {
            System.out.println("Introduce un número de 2 cifras: ");
            numeroUsuario = miScanner.nextInt();
        }

        primerNumero = numeroUsuario / 10;
        segundoNumero = numeroUsuario % 10;
        sumatorio = primerNumero + segundoNumero;
        System.out.println("La suma de los dos digitos da: " + sumatorio);

        miScanner.close();
    }
}
