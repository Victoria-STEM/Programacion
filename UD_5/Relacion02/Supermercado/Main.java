package Relacion02.Supermercado;

import Relacion02.Universidad.Faker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Supermercado mercado = new Supermercado();
        int cantidadProductos = 100;

        for (int i = 0; i < cantidadProductos; i++) {
            Producto nuevoProducto = new Producto((i + 1), Faker.nombre(), Faker.loremCorto(), Faker.precio(0.10, 100.01), Faker.entero(1, 100));
            mercado.agregarProducto(nuevoProducto);
        }

        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        boolean programa = true;

        // while (programa) {

        //     System.out.println("Escoge una opcion:\n"
        //             + "1. Agregar productos\n"
        //             + "2. Vender producto\n"
        //             + "3. Mostrar inventario\n"
        //             + "4. Salir del programa");

        //     int opcion = intScanner.nextInt();

        //     if (opcion == 1) {

        //         System.out.println("Introduce el id: ");
        //         int nuevoId = intScanner.nextInt();

        //         System.out.println("Introduce el nombre del producto: ");
        //         String producto = stringScanner.nextLine();

        //         System.out.println("Introduce la drescripcion del producto: ");
        //         String descripcion = stringScanner.nextLine();

        //         System.out.println("Introduce el precio del producto:");
        //         double precio = intScanner.nextInt();

        //         System.out.println("Introduce la cantidad del producto:");
        //         int cantidad = intScanner.nextInt();

        //         Producto nuevoLibro = new Producto(nuevoId, producto, descripcion, precio, cantidad);
        //         mercado.agregarProducto(nuevoLibro);

        //     }

        //     else if (opcion == 2) {

        //         System.out.println("Introduce el id: ");
        //         int id = intScanner.nextInt();

        //         System.out.println("Introduce la cantidad del producto:");
        //         int cantidad = intScanner.nextInt();

        //         mercado.venderProducto(id, cantidad);
        //         System.out.println(mercado.buscarProducto(id));

        //     }

        //     else if (opcion == 3) {
        //         mercado.toString();

        //     }

        //     else if (opcion == 4) {
        //         programa = false;
        //     }

        //     else {
        //         System.out.println("Opcion incorrecta. Introduce 1, 2, 3 o 4.");
        //     }

        // } 

        mercado.toString();
    }
}
