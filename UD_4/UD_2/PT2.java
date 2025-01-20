package UD_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PT2 {

    static final int cantidadDientesDanados = 5;

    static final int sano = 0;
    static final int danado = 1;

    static final int turno1 = sano;
    static final int turno2 = sano;

    public static void main(String[] args) {

        // Declaracion de variables:
        Scanner miScanner = new Scanner(System.in);

        String[] visible = { "W", "W", "W", "W", "W", "W", "W", "W", "W", "W" };
        ArrayList<String> tableroVisible = new ArrayList<String>(Arrays.asList(visible));

        Integer[] invisible = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        ArrayList<Integer> tableroInvisible = new ArrayList<Integer>(Arrays.asList(invisible));

        int cantidadDientesDanados = 5;
        int sano = 0;
        int danado = 1;

        int turno1 = sano;
        int turno2 = sano;

        // Creacion del tablero aleatorio:
        for (int i = 0; i < cantidadDientesDanados; i++) {
            int dienteAleatorio = (int) (Math.random() * 2);
            int indiceAleatorio = (int) (Math.random() * 10);

            // System.out.println("Diente: " + dienteAleatorio);
            // System.out.println("Indice aleatorio: " + indiceAleatorio);
            if (tableroInvisible.get(indiceAleatorio) != danado) {
                tableroInvisible.remove(indiceAleatorio);
                tableroInvisible.add(indiceAleatorio, dienteAleatorio);
            }
        }

        System.out.println(tableroVisible);
        System.out.println(tableroInvisible);

        while (tableroInvisible.get(turno1) == sano && tableroInvisible.get(turno2) == sano) {

            
            // Jugador 1 introduce un indice:
            System.out.println("Jugador 1 - Introduce un indice (1-10):");
            turno1 = miScanner.nextInt() - 1;

            // Introduccion del diente danado o sano en el tablero visible:
            if (tableroInvisible.get(turno1) == danado) {
                tableroVisible.set(turno1, "X");
            } else if (tableroInvisible.get(turno1) == sano) {
                tableroVisible.set(turno1, "O");
            }

            // Reconocmiento del diente como sano o danado e impresion del mensaje:
            if (tableroInvisible.get(turno1) == sano) {
                System.out.println("Diente sano.");
            } else {
                System.out.println("Diente danado.");
                System.out.println("¡El cocodrilo mordió! Jugador 1 pierde.");
            }

            System.out.println(tableroVisible);

            // Jugador 2:
            if (tableroInvisible.get(turno1) == sano) {

                // Jugador 2 introduce un indice:
                System.out.println("Jugador 2 - Introduce un indice:");
                turno2 = miScanner.nextInt() - 1;

                // Introduccion del diente danado o sano en el tablero visible:
                if (tableroInvisible.get(turno2) == danado) {
                    tableroVisible.set(turno2, "X");
                } else if (tableroInvisible.get(turno2) == sano) {
                    tableroVisible.set(turno2, "O");
                }

                // Reconocmiento del diente como sano o danado e impresion del mensaje:
                if (tableroInvisible.get(turno2) == sano) {
                    System.out.println("Diente sano.");
                } else {
                    System.out.println("Diente danado.");
                    System.out.println("¡El cocodrilo mordió! Jugador 2 pierde.");
                }

                System.out.println(tableroVisible);
            }
        }
    }
}
