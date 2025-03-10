import java.util.Scanner;

public class Main {

    final static int cantidadProductos = 1000;
    final static Scanner miScanner = new Scanner(System.in);

    private static Almacen listaProductos;

    public static void main(String[] args) {

        inicializarSupermercado();
        boolean programa = true;

        while (programa) {

            System.out.println(imprimirMenu());
            int opcion = miScanner.nextInt();

            if (opcion == 1) {
                System.out.println(listaProductos);
            }

            else if (opcion == 2) {
                int codigoProducto;
                Producto productoBuscado;

                System.out.println("Introduce el codigo del producto:");
                codigoProducto = miScanner.nextInt();

                productoBuscado = listaProductos.buscarProducto(codigoProducto);

                if (productoBuscado != null) {
                    System.out.println(productoBuscado);
                }
                else {
                    System.out.println("Producto no encontrado.");
                }
            }

            else if (opcion == 3) {
                Producto productoBuscado;
                int codigoProducto, cantidadProductoAnadida;

                System.out.println("Introduce el codigo del producto:");
                codigoProducto = miScanner.nextInt();
                
                System.out.println("Introduce la cantidad del producto a anadir:");
                cantidadProductoAnadida = miScanner.nextInt();

                productoBuscado = listaProductos.buscarProducto(codigoProducto);

                if (productoBuscado != null) {
                    productoBuscado.setCantidad(productoBuscado.getCantidad() + cantidadProductoAnadida);
                    System.out.println("El producto " + productoBuscado.getCodigo() + " cuanta con " + productoBuscado.getCantidad() + " unidades.");
                }
                else {
                    System.out.println("Producto no encontrado.");
                }
            }

            else if (opcion == 4) {
                Producto productoBuscado;
                int codigoProducto, cantidadProductoActual, cantidadProductoSustraer;

                System.out.println("Introduce el codigo del producto:");
                codigoProducto = miScanner.nextInt();
                
                System.out.println("Introduce la cantidad del producto a retirar:");
                cantidadProductoSustraer = miScanner.nextInt();

                productoBuscado = listaProductos.buscarProducto(codigoProducto);

                if (productoBuscado != null) {
                    cantidadProductoActual = productoBuscado.getCantidad();
                    if (cantidadProductoActual >= cantidadProductoSustraer) {
                        productoBuscado.setCantidad(cantidadProductoActual - cantidadProductoSustraer);
                        System.out.println("El producto " + productoBuscado.getCodigo() + " cuanta con " + productoBuscado.getCantidad() + " unidades.");
                    }
                    else {
                        System.out.println("No se puede retirar más stock del disponible.");
                    }
                }
                else {
                    System.out.println("Producto no encontrado.");
                }
            }

            else if (opcion == 5) {
                Producto productoBuscado;
                int codigoProducto;

                System.out.println("Introduce el codigo del producto a eliminar:");
                codigoProducto = miScanner.nextInt();

                productoBuscado = listaProductos.buscarProducto(codigoProducto);

                if(productoBuscado != null) {

                    if(productoBuscado.getCantidad() == 0) {
                        listaProductos.eliminarProducto(codigoProducto);
                        System.out.println("El producto con codigo " + codigoProducto + " ha sido eliminado del almacen.");
                    }
                    else {
                        System.out.println("No se puede eliminar un producto con stock disponible.");
                    }
                }
                else {
                    System.out.println("Producto no encontrado.");
                }
            }

            else if (opcion == 6) {
                programa = false;
            }

            else {
                System.out.println("Opcion incorrecta. Introduce: 1, 2, 3, 4, 5 o 6.");
            }
        }

        System.out.println(listaProductos);
        miScanner.close();
    }

    public static void inicializarSupermercado() {
        listaProductos = new Almacen();

        for (int i = 0; i < cantidadProductos; i++) {
            Producto nuevoProducto = new Producto(Faker.nombre(), Faker.precio(0.5, 10), Faker.entero(2, 10));
            listaProductos.agregarProducto(nuevoProducto);
        }
    }

    public static String imprimirMenu() {

        return ("===== GESTIÓN DE ALMACÉN =====\n"
                + "1. Mostrar todos los productos \n"
                + "2. Buscar un producto por código \n"
                + "3. Agregar stock a un producto \n"
                + "4. Retirar stock de un producto \n"
                + "5. Eliminar un producto \n"
                + "6. Salir \n"
                + "Seleccione una opción: ");
    }

    // public static void agregarProductoUsuario() {
    //     Producto nuevoProducto;
    //     String producto;
    //     double precio;
    //     int cantidad;

    //     System.out.println("Introduce el nombre del producto: ");
    //     producto = miScanner.nextLine();

    //     System.out.println("Introduce el precio del producto:");
    //     precio = Double.parseDouble(miScanner.nextLine());

    //     System.out.println("Introduce la cantidad del producto:");
    //     cantidad = Integer.parseInt(miScanner.nextLine());

    //     nuevoProducto = new Producto(producto, precio, cantidad);
    //     listaProductos.agregarProducto(nuevoProducto);

    // }

    // public static void venderProductoUsuario() {
    //     miScanner.nextLine();

    //     System.out.println("Introduce el id: ");
    //     int id = Integer.parseInt(miScanner.nextLine());

    //     System.out.println("Introduce la cantidad del producto:");
    //     int cantidad = Integer.parseInt(miScanner.nextLine());

    //     boolean vendido = listaProductos.venderProducto(id, cantidad);
    //     System.out.println(vendido ? "Vendido" : "No vendido");

    // }
    
}
