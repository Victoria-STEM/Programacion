package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio11 {

    public static ArrayList rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }
    
    public static Integer sumarArray (ArrayList<Integer> array) {
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayGenerado = rellenarArray(10);
        int suma = sumarArray(arrayGenerado);

        System.out.println(arrayGenerado);
        System.out.println(suma);
        
    }
}
