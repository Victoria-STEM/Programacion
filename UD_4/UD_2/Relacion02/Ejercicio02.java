package Relacion02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);
        ArrayList<Integer> puntuaciones = new ArrayList<>();
        ArrayList<String> nombreJugadores = new ArrayList<>();
        String nombre;
        int menu = 1;
        int puntuacion;

        while (menu != 3) {

            System.out.println("1. Añadir un nuevo jugador y su puntuación. %n2. Mostrar los jugadores y sus puntuaciones actuales. %n3. Salir del programa.");
            menu = miScanner.nextInt();

            if (menu == 1) {
                System.out.println("Introduce el nombre:");
                nombre = miScanner.next();
                
                System.out.println("Introduce su puntuacion:");
                puntuacion = miScanner.nextInt();

                nombreJugadores.add(0, nombre);
                puntuaciones.add(0, puntuacion);
            }

            else if (menu == 2) {
                for (String nombreJugador : nombreJugadores) {
                    System.out.print(nombreJugador);
                }
                for (int puntuacionJugador : puntuaciones) {
                    System.out.print(puntuacionJugador);
                }
            }
        }
    }
}
