package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio15 {

    public static ArrayList<Integer> rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }

    public static ArrayList<Integer> filtrarNumeroMayores (int numero, ArrayList<Integer> array) {
        ArrayList<Integer> arrayDeMayores = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > numero) {
                arrayDeMayores.add(array.get(i));
            }
        }

        return arrayDeMayores;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayGenerado = rellenarArray(20);
        ArrayList<Integer> arrayDeMayores = filtrarNumeroMayores(6, arrayGenerado);

        System.out.println(arrayDeMayores);
    }
}
