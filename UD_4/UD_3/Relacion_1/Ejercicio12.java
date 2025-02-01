package Relacion_1;

import java.util.ArrayList;

public class Ejercicio12 {

    public static ArrayList simularLanzamientoHastaTresCaras() {

        ArrayList<String> moneda = new ArrayList();
        moneda.add("cara");
        moneda.add("cruz");

        int contador = 0;

        ArrayList<String> lanzamientosMoneda = new ArrayList();

        while (contador < 3) {

            int indice = (int) (Math.random() * 2);
            lanzamientosMoneda.add(moneda.get(indice));

            if (indice == 0) {
                contador ++;
            }

        }

        return lanzamientosMoneda;
    }

    public static void main(String[] args) {

        // Escribe una función simularLanzamientoHastaTresCaras que simule el lanzamiento de una moneda (cara o cruz) 
        // hasta que obtenga 3 veces "Cara" de forma seguida. 
        // Devuelve cuántos lanzamientos se necesitaron para llegar a tener 3 "Caras" y el array con todos los lanzamientos.
        
        ArrayList resultado = simularLanzamientoHastaTresCaras();
        System.out.println(resultado);
        System.out.println("La moneda se ha lanzado: " + resultado.size() + " veces.");
    }
}
