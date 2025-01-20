package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio13 {

    public static ArrayList<Integer> rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }

    public static ArrayList<Integer> invertirArray (ArrayList<Integer> array) {
        ArrayList<Integer> arrayInvertido = new ArrayList<>();
        
        for (int i = array.size() - 1; 0 <= i; i--) {
            arrayInvertido.add(array.get(i));
        }

        return arrayInvertido;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayGenerado = rellenarArray(20);
        ArrayList<Integer> arrayInvertido = invertirArray(arrayGenerado);
        
        System.out.println(arrayGenerado);
        System.out.println(arrayInvertido);
    }
}
