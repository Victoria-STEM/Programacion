package UD_4.Relacion03;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroFilas;
        String estrellas = "*";
        String espacios = "";

        System.out.println("Introduce un numero entero:");
        numeroFilas = miScanner.nextInt();

        for (int i = 0; i < numeroFilas; i++) {
            
            // Dibujo las estrallas 
            for (int j = 0; j < (numeroFilas - i); j++) {
                espacios += " ";
            }

            System.out.println(espacios + estrellas);
            estrellas += "**";
            espacios = "";
        }

        miScanner.close();

    }
}
