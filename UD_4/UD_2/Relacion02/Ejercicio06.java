package Relacion02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        ArrayList<Boolean> estados = new ArrayList<>();
        ArrayList<String> tareas = new ArrayList<>();
        int menu = 0;
        String tarea;
        Boolean encontrado = false;

        while (menu != 5) {

            System.out.println("1. Añadir una nueva tarea.\r\n" + //
                    "2. Marcar una tarea como completada.\r\n" + //
                    "3. Ver la lista de tareas pendientes.\r\n" + //
                    "4. Ver la lista de tareas completadas.\r\n" + //
                    "5. Salir del programa.");

            menu = miScanner.nextInt();

            if (menu == 1) {
                System.out.println("Añade una nueva tarea:");
                tarea = miScanner.next();
                tareas.add(tarea);
                estados.add(false);
            }

            else if (menu == 2) {
                System.out.println("Marca una tarea como compleata:");
                tarea = miScanner.next();
                for (int i = 0; i < tareas.size() && !encontrado; i++) {
                    if (tarea.equals(tareas.get(i))) {
                        estados.set(i, true);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Tarea no encontrada.");
                }
            }

            else if (menu == 3) {
                
                System.out.println("Lista de tareas pendientes:");
                for (int i = 0; i < estados.size(); i++) {
                    if (estados.get(i) == false) {
                        System.out.print(tareas.get(i) + " - " + estados.get(i));
                    }
                }
            }

            else if (menu == 4) {

                System.out.println("Lista de tareas completadas:");
                for (int i = 0; i < estados.size(); i++) {
                    if (estados.get(i) == true) {
                        System.out.print(tareas.get(i) + " - " + estados.get(i));
                    }
                }
            }
        }

        miScanner.close();
    }
}
