import java.util.Scanner;

public class Main {

    final static int numeroCanciones = 100;

    final static Scanner intScanner = new Scanner(System.in);
    final static Scanner stringScanner = new Scanner(System.in);

    private static Playlist miPlaylist;

    public static void main(String[] args) {

        inicializarPlaylist();
        boolean programa = true;

        while (programa) {

            imprimirMenu();
            int opcion = intScanner.nextInt();

            if (opcion == 1) {
                agregarCanciones();
            }

            else if (opcion == 2) {
                System.out.println(miPlaylist);
            }

            else if (opcion == 3) {
                System.out.println(miPlaylist.contarDuracionTotalCanciones());
            }

            else if (opcion == 4) {
                programa = false;
            }

            else {
                System.out.println("Opcion incorrecta. Introduce 1, 2, 3 o 4.");
            }

        }

        intScanner.close();
        stringScanner.close();
        
    }

    public static void imprimirMenu() {

        System.out.println("Escoge una opcion:\n"
                + "1. Agregar cancion\n"
                + "2. Mostrar playlist\n"
                + "3. Calcular duracion total de la playlist\n"
                + "4. Salir del programa");
    }

    public static void inicializarPlaylist() {

        miPlaylist = new Playlist();

        for (int i = 0; i < numeroCanciones; i++) {
            Cancion nuevaCancion = new Cancion (Faker.lorem(4), Faker.nombreCompleto(), Faker.entero(100, 400));
            miPlaylist.agregarCanciones(nuevaCancion);
        }

    }

    public static void agregarCanciones() {

        System.out.println("Introduce el nombre de la cancion: ");
        String nombre = stringScanner.nextLine();

        System.out.println("Introduce el nombre de la artista: ");
        String artista = stringScanner.nextLine();

        System.out.println("Introduce la duracion de la cancion:");
        int duracion = intScanner.nextInt();

        Cancion nuevaCancion = new Cancion(nombre, artista, duracion);
        miPlaylist.agregarCanciones(nuevaCancion);

    }

}
