package Relacion_04;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        double productosCuenta = 1.0;
        int totalProductos = 0;
        double totalProductosConPropina;
        int personas;
        double porcentajePropina;

        while (productosCuenta != 0) {
            System.out.println("Introduce los productos de una cuenta:");
            productosCuenta = miScanner.nextDouble();
            totalProductos += (double)productosCuenta;
        }

        System.out.println("Introduce el numero de personas a repartir:");
        personas = miScanner.nextInt();

        System.out.println("Introduce el porcentaje de la propina:");
        porcentajePropina = miScanner.nextDouble();

        totalProductosConPropina = (((double)totalProductos * porcentajePropina) / 100) + (double)totalProductos;
        System.out.println("El total sin propina es: " + totalProductos);
        System.out.println("El total con propina es: " + totalProductosConPropina);
        System.out.println("El precio por cabeza es: " + (double)totalProductosConPropina/personas);

        miScanner.close();
    }
}