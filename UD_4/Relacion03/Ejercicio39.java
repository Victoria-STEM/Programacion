package UD_4.Relacion03;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero;
        int siguienteNumero = 0;

        System.out.println("Introduce un numero entero:");
        primerNumero = scanner.nextInt();

        while (primerNumero != siguienteNumero) {
            System.out.println("Vuelve a introducir el numero:");
            siguienteNumero = scanner.nextInt();

            if (primerNumero < siguienteNumero) {
                System.out.print("El numero debe ser menor. ");
            } else if (primerNumero > siguienteNumero) {
                System.out.print("El numero debe ser mayor. ");
            }
        }

        scanner.close();

    }
}
