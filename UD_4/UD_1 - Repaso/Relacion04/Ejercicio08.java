package UD_4.Relacion04;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        String hobbit1, hobbit2, hobbit3;
        int edadHobbit1, edadHobbit2, edadHobbit3;
        boolean puedeRepetir1 = false;
        boolean puedeRepetir2 = false;
        boolean puedeRepetir3 = false;

        System.out.println("Introduce el nombre del primer Hobbit:");
        hobbit1 = miScanner.next();
        System.out.println("Introduce el nombre del segundo Hobbit:");
        hobbit2 = miScanner.next();
        System.out.println("Introduce el nombre del tercer Hobbit:");
        hobbit3 = miScanner.next();

        System.out.println("Introduce la edad del primer Hobbit:");
        edadHobbit1 = miScanner.nextInt();
        System.out.println("Introduce la edad del segundo Hobbit:");
        edadHobbit2 = miScanner.nextInt();
        System.out.println("Introduce la edad del tercer Hobbit:");
        edadHobbit3 = miScanner.nextInt();

        if (edadHobbit1 < 33) {
            puedeRepetir1 = true;
            System.out.println("El primer hobbit es menor de edad así que repite.");
        }
        if (edadHobbit2 < 33) {
            puedeRepetir2 = true;
            System.out.println("El segundo hobbit es menor de edad así que repite.");
        }
        if (edadHobbit3 < 33) {
            puedeRepetir3 = true;
            System.out.println("El tercer hobbit es menor de edad así que repite.");
        }

        if ((edadHobbit1 + edadHobbit2 + edadHobbit3) % 2 == 0 && puedeRepetir1 == false) {
            System.out.println("El primer hobbit " + hobbit1 + " puede comer.");
            puedeRepetir1 = true;
        }
        if ((edadHobbit1 + edadHobbit2 + edadHobbit3) % 3 == 0 && puedeRepetir2 == false) {
            System.out.println("El segundo hobbit " + hobbit2 + " puede comer.");
            puedeRepetir2 = true;
        }
        if ((edadHobbit1 + edadHobbit2 + edadHobbit3) % 5 == 0 && puedeRepetir3 == false) {
            System.out.println("El tercer hobbit " + hobbit3 + " puede comer.");
            puedeRepetir3 = true;
        }
        
        // Extra
        if (puedeRepetir1 == true && puedeRepetir2 == true && puedeRepetir3 == true) {
            System.out.println("Los tres comen, así que toca repartir la comida.");
        } 
        else if (puedeRepetir1 == false && puedeRepetir2 == false && puedeRepetir3 == false) {
            System.out.println("Ninguno come, así que va a sobrar comida.");
        } 
        else {
            System.out.println("A comer!");
        }

        miScanner.close();
    }
}
