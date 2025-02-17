
import java.util.Scanner;

// En el main, implementa un menú para probar la funcionalidad. 
// Usa la clase Faker para generar 100 libros.
public class Ejercicio {

    public static void main(String[] args) {

        biblioteca howarts = new biblioteca();

        int cantidad = 100;

        for (int i = 0; i < cantidad; i++) {

            libro nuevoLibro = new libro((i + 1), Faker.loremCorto(), Faker.nombreCompleto(), Faker.loremLargo(), true);
            howarts.agregarLibros(nuevoLibro);

        }

        // System.out.println(howarts);

        Scanner miScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        boolean programa = true;

        while (programa) {

            System.out.println("Escoge una opcion:\n"
                    + "1. Agregar libros\n"
                    + "2. Prestar un libro (cambiar disponible a false)\n"
                    + "3. Devolver un libro\n"
                    + "4. Salir del programa");

            int opcion = miScanner.nextInt();

            if (opcion == 1) {

                System.out.println("Introduce el id: ");
                int nuevoId = miScanner.nextInt();

                System.out.println("Introduce el titulo del libro: ");
                String nuevoTitulo = stringScanner.nextLine();

                System.out.println("Introduce el nombre del autor: ");
                String nuevoAutor = stringScanner.nextLine();

                System.out.println("Introduce la sinopsis:");
                String nuevaSinopsis = stringScanner.nextLine();

                libro nuevoLibro = new libro(nuevoId, nuevoTitulo, nuevoAutor, nuevaSinopsis, true);
                howarts.agregarLibros(nuevoLibro);
                System.out.println(howarts.buscarLibro(nuevoId));

            } else if (opcion == 2) {

                System.out.println("Introduce el id del libro a prestar: ");
                int id = miScanner.nextInt();

                howarts.prestarLibro(id);
                System.out.println(howarts.buscarLibro(id));

            } else if (opcion == 3) {

                System.out.println("Introduce el id del libro a devolver: ");
                int id = miScanner.nextInt();

                howarts.devolverLibro(id);
                System.out.println(howarts.buscarLibro(id));
                
            } else if (opcion == 4) {

                programa = false;

            } else {

                System.out.println("Opcion incorrecta. Introduce 1, 2, 3 o 4.");

            }

        }

        // System.out.println(howarts);

        miScanner.close();
        stringScanner.close();

    }

}
