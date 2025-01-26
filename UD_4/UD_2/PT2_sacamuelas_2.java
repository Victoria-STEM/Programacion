package UD_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PT2_sacamuelas_2 {

    static final int cantidadDientesDanados = 5;

    static final int sano = 0;
    static final int danado = 1;

    public static ArrayList<String> crearTableroVisible() {

        ArrayList<String> tableroVisible = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tableroVisible.add("W");
        }
        return tableroVisible;
    }

    public static ArrayList<Integer> crearTableroInvisible() {

        ArrayList<Integer> tableroInvisible = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tableroInvisible.add(0);
        }
        return tableroInvisible;
    }

    public static ArrayList<Integer> anadirDientesDanados(ArrayList<Integer> tableroInvisible, Integer cantidadDientesDanados) {

        for (int i = 0; i < cantidadDientesDanados; i++) {
            int dienteAleatorio = (int) (Math.random() * 2);
            int indiceAleatorio = (int) (Math.random() * 10);

            if (tableroInvisible.get(indiceAleatorio) != danado) {
                tableroInvisible.remove(indiceAleatorio);
                tableroInvisible.add(indiceAleatorio, dienteAleatorio);
            }
        }
        return tableroInvisible;
    }

    public static void main(String[] args) {

        // Declaracion de variables:
        int numeroUsuario = 0;
        int turno = 1;
        Scanner miScanner = new Scanner(System.in);

        ArrayList<String> tableroVisible = crearTableroVisible();
        ArrayList<Integer> tableroInvisible = crearTableroInvisible();
        ArrayList<Integer> tableroInvisibleCompleto = anadirDientesDanados(tableroInvisible, cantidadDientesDanados);

        System.out.println(tableroVisible);
        System.out.println(tableroInvisibleCompleto);

        while (tableroInvisibleCompleto.get(numeroUsuario) == sano) {

            System.out.println("Jugador " + turno + " selecciona un diente del 0 al 9:");
            numeroUsuario = miScanner.nextInt();

            if (numeroUsuario >= 0 && numeroUsuario < 10) {

                if (tableroInvisibleCompleto.get(numeroUsuario) == danado) {
                    System.out.println("El jugador " + turno + " pierde.");
                    tableroVisible.set(numeroUsuario, "X");
                } else {
                    System.out.println("El diente estaba sano. Continuamos jugando.");
                    tableroVisible.set(numeroUsuario, "U");
                    System.out.println(tableroVisible);
                }

                // Asignacion de turno:
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }
            }

            else {
                System.out.println("Numero incorrecto.");
            }

        }
    }
}
