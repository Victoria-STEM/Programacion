package UD2;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.aslist(array));

        // push : add
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);

        // pop : remove
        listaNumeros.removeLast();
        listaNumeros.remove(listaNumeros.size() - 1);

        // shift : remove
        listaNumeros.removeFirst();
        listaNumeros.remove(0);

        // unshift : add
        listaNumeros.add(0, 6);
        listaNumeros.addFirst(6);


        System.out.println(listaNumeros);

        for (int numero : listaNumeros) {
            System.out.println(numero);
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            System.out.println(numero);
        }
    }
    
}
