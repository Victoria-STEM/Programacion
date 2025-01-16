package Ejercicio01;

public class Ejercicio01 {
    public static void main(String[] args) {
        String[] nombres = {"apple", "banana", "kiwi", "watermelon"};
        String palabraMasLarga = nombres[0];

        for (int i = 1; i < nombres.length; i++) {
            if (palabraMasLarga.length() < nombres[i].length()) {
                palabraMasLarga = nombres[i];
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}
