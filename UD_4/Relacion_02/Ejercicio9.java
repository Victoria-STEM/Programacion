package Relacion_02;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroUsuario;
        int primerNumero;
        int segundoNumero;
        int sumatorio;

        System.out.println("Introduce un número de 2 cifras: ");
        numeroUsuario = miScanner.nextInt();

        if (numeroUsuario >= 10 && numeroUsuario <= 99) {
            primerNumero = numeroUsuario / 10;
            segundoNumero = numeroUsuario % 10;
            sumatorio = primerNumero + segundoNumero;
            System.out.println("La suma de los dos digitos da: " + sumatorio);
        } else {
            System.out.println("El numero introducido no es correcto.");
        }

        miScanner.close();
    }
}
