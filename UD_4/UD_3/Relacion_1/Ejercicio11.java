package Relacion_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

    public static String generarPiedraPapelTijera() {

        ArrayList<String> piedraPapelTijera = new ArrayList<>();
        piedraPapelTijera.add("piedra");
        piedraPapelTijera.add("papel");
        piedraPapelTijera.add("tijera");

        String resultado = "";

        resultado = piedraPapelTijera.get((int) (Math.random() * piedraPapelTijera.size()));

        return resultado;
    }

    public static void main(String[] args) {

        // Crea una función juegoPiedraPapelTijeras que genere aleatoriamente 
        // una elección entre "Piedra", "Papel" o "Tijeras" y permite al usuario jugar contra la máquina.
        Scanner miScanner = new Scanner(System.in);

        boolean juego = true;
        String opcionJugador;

        while (juego == true) {

            System.out.println("Introduce tu opcion: piedra, papel o tijera");
            opcionJugador = miScanner.nextLine();

            if (opcionJugador.equals("salir")) {
                juego = false;
            } 
            
            else if (!opcionJugador.equals("piedra") && !opcionJugador.equals("papel") && !opcionJugador.equals("tijera")) {
                System.out.println("Opcion invalida.");
            }

            else {

                String opcionMaquina = generarPiedraPapelTijera();
                System.out.println("Maquina: " + opcionMaquina);

                if (opcionJugador.equals("piedra") && opcionMaquina.equals("tijera")) {
                    System.out.println("Jugador gana.");
                } 
                
                else if (opcionJugador.equals("papel") && opcionMaquina.equals("piedra")) {
                    System.out.println("Jugador gana.");
                } 
                
                else if (opcionJugador.equals("tijera") && opcionMaquina.equals("papel")) {
                    System.out.println("Jugador gana.");
                } 
                
                else if (opcionJugador.equals(opcionMaquina)) {
                    System.out.println("Empate.");
                } 
                
                else {
                    System.out.println("La maquina gana.");
                }
                
            }
        }
    }
}
