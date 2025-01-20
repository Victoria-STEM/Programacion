package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio16 {
    
    public static ArrayList<Integer> rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }

    public static boolean verificarNumeroEnArray (int numero, ArrayList<Integer> array) {
        boolean esta = false;
        for (int i = 0; i < array.size(); i++) {
            if (numero == array.get(i)) {
                esta = true;
            }
        }
        return esta;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayGenerado = rellenarArray(20);
        boolean verificado = verificarNumeroEnArray(0, arrayGenerado);

        System.out.println(verificado);
    }
}
