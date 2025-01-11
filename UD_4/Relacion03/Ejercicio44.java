package UD_4.Relacion03;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;
        int digito;
        int resultado = 1;

        System.out.println("Introduce un numero entero:");
        numeroUsuario = scanner.nextInt();

        while (numeroUsuario != 0) {
            digito = numeroUsuario % 10;
            resultado *= digito;

            numeroUsuario = numeroUsuario / 10;
        }

        System.out.println("El producto de los digitos del numero es " + resultado);
    }
}
