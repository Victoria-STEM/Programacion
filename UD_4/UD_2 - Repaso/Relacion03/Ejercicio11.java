package Ejercicio11;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] arrayNumeros = {1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> arrayNumerosSinRepetir = new ArrayList<>();
        boolean anadido = false;
        boolean encontrado = false;

        // System.out.println(arrayNumeros);

        for (int i = 0; i < arrayNumeros.length; i++) {
            encontrado = false;
            
            for (int j = 1; j < arrayNumeros.length && !encontrado; j++) {
                
                if (arrayNumeros[i] != arrayNumeros[j]) {
                    encontrado = true;
                    arrayNumerosSinRepetir.add(arrayNumeros[i]);
                }
            }
        }

        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println(arrayNumerosSinRepetir);
    
    }
}
