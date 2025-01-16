package UD_2.Relacion02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        String producto = "";
        int cantidad;
        double coste = 0.0;
        double costeTotal = 0.0;
        boolean encontrado = false;
        int indice = 0;

        String[] productos = {"Manzanas", "Plátanos", "Leche", "Pan", "Huevos", "Azúcar", "Harina", "Arroz", "Pasta", "Café"};
        Double[] precios = {1.20, 0.80, 1.50, 1.00, 2.00, 1.10, 0.90, 0.70, 1.30, 3.00};

        ArrayList<Integer> cantidadesAdquiridas = new ArrayList<>();
        ArrayList<String> productosAdquiridos = new ArrayList<>();

        while (!producto.equals("Salir")) {

            System.out.println("Introduce el producto que desee comprar:");
            producto = miScanner.next();

            encontrado = false;
            
            for (int i = 0; i < productos.length && !encontrado; i++) {
                if (producto.equals(productos[i])) {
                    indice = i;
                    encontrado = true;
                }
            }

            if (!encontrado && !producto.equals("Salir")) {
                System.out.println("Producto no encontrado.");

            } else if (encontrado) {
                System.out.println("Introduce la cantidad:");
                cantidad = miScanner.nextInt();
                cantidadesAdquiridas.add(cantidad);
                productosAdquiridos.add(producto);
                coste = precios[indice] * cantidad;
                costeTotal += coste;
            }
        }

        System.out.println(cantidadesAdquiridas);
        System.out.println(productosAdquiridos);
        System.out.println(costeTotal);

        miScanner.close();

    }
}
