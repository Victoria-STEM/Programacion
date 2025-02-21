import java.util.Scanner;

public class Main {

    final static int cantidadProductos = 100;
    final static Scanner miScanner = new Scanner(System.in);

    private static Supermercado mercado;

    public static void main(String[] args) {

        inicializarSupermercado();
        boolean programa = true;

        while (programa) {

            imprimirMenu();
            int opcion = miScanner.nextInt();

            if (opcion == 1) {
                agregarProducto();
            }

            else if (opcion == 2) {
                venderProducto();
            }

            else if (opcion == 3) {
                System.out.println(mercado); 
            }

            else if (opcion == 4) {
                programa = false;
            }

            else {
                System.out.println("Opcion incorrecta. Introduce 1, 2, 3 o 4.");
            }
        }

        // System.out.println(mercado);
        miScanner.close();
    }

    public static void inicializarSupermercado() {
        mercado = new Supermercado();

        for (int i = 0; i < cantidadProductos; i++) {
            Producto nuevoProducto = new Producto(Faker.lorem(4), Faker.loremCorto(), Faker.precio(0.10, 100.01), Faker.entero(1, 100));
            mercado.agregarProducto(nuevoProducto);
        }
    }

    public static void imprimirMenu() {

        System.out.println("Escoge una opcion:\n"
                + "1. Agregar productos\n"
                + "2. Vender producto\n"
                + "3. Mostrar inventario\n"
                + "4. Salir del programa");
    }

    public static void agregarProducto() {

        System.out.println("Introduce el nombre del producto: ");
        String producto = miScanner.nextLine();

        System.out.println("Introduce la drescripcion del producto: ");
        String descripcion = miScanner.nextLine();

        System.out.println("Introduce el precio del producto:");
        double precio = Double.parseDouble(miScanner.nextLine());

        System.out.println("Introduce la cantidad del producto:");
        int cantidad = Integer.parseInt(miScanner.nextLine());

        Producto nuevoLibro = new Producto(producto, descripcion, precio, cantidad);
        mercado.agregarProducto(nuevoLibro);

    }

    public static void venderProducto() {
        miScanner.nextLine();

        System.out.println("Introduce el id: ");
        int id = Integer.parseInt(miScanner.nextLine());

        System.out.println("Introduce la cantidad del producto:");
        int cantidad = Integer.parseInt(miScanner.nextLine());

        boolean vendido = mercado.venderProducto(id, cantidad);
        System.out.println(vendido ? "Vendido" : "No vendido");

    }
}
