package UD_2.Relacion01;

import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {

        ArrayList<Character> arrayLetras = new ArrayList<>();
        
        arrayLetras.add(0, 'a');
        arrayLetras.add(1, 'b');
        arrayLetras.add(2, 'c');
        arrayLetras.add(3, 'd');

        System.out.println(arrayLetras);

        arrayLetras.set(0, 'd');
        arrayLetras.set(1, 'c');
        arrayLetras.set(2, 'b');
        arrayLetras.set(3, 'a');

        System.out.println(arrayLetras);

        String[] palabras = {"Hola ", "soy ", "Victoria."};
        for (String palabra : palabras) {
            System.out.print(palabra);
        }

        for (char letra : arrayLetras) {
            arrayLetras.addFirst(letra);
        }
        System.out.println(arrayLetras);
        
    }
}