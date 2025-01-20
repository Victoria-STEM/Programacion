package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio12 {

    public static ArrayList<Integer> rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }
    
    public static ArrayList obtenerImpares (ArrayList<Integer> numeros) {
        ArrayList<Integer> listaImpares = new ArrayList<>();
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) { // no entiendo qué pasa aqui???
                listaImpares.add(i);
            }
        }
        return listaImpares;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayGenerado = rellenarArray(10);
        ArrayList<Integer> listaImpares = obtenerImpares(arrayGenerado);

        System.out.println(arrayGenerado.get(0));
        System.out.println(arrayGenerado);
        System.out.println(listaImpares);

    }
}
