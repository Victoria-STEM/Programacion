package Relacion_02;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String jugadorUno;
        String jugadorDos;

        System.out.println("Jugador 1 - Introduce piedra, papel o tijera: ");
        jugadorUno = miScanner.next();

        System.out.println("Jugador 2 - Introduce piedra, papel o tijera: ");
        jugadorDos = miScanner.next();

        if (jugadorUno.equalsIgnoreCase("piedra") && jugadorDos.equalsIgnoreCase("tijera")) {
            System.out.println("Gana el Jugador 1.");
        } 
        else if (jugadorUno.equalsIgnoreCase("papel") && jugadorDos.equalsIgnoreCase("piedra")) {
            System.out.println("Gana el Jugador 1.");
        }
        else if (jugadorUno.equalsIgnoreCase("tijera") && jugadorDos.equalsIgnoreCase("papel")) {
            System.out.println("Gana el Jugador 1.");
        }
        else if (jugadorUno.equals(jugadorDos)) {
            System.out.println("Hay un empate.");
        } 
        else {
            System.out.println("Gana el jugador 2.");
        } 

        miScanner.close();
    }
}
