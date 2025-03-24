
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner miScanner = new Scanner(System.in);
    public static ArrayList<MaterialBiblioteca> listaBiblioteca = new ArrayList<>();

    public static void main(String[] args) {

        boolean programa = true;
        iniciarBiblioteca();

        while (programa) {

            imprimirMenu();
            int opcion = miScanner.nextInt();
            miScanner.nextLine();

            // 1. Registrar nuevo material
            if (opcion == 1) {
                imprimirMenuTipoMaterial();
                int opcionSubMenu = miScanner.nextInt();
                miScanner.nextLine();

                if (opcionSubMenu == 1) { // libro
                    registrarLibro();

                } else if (opcionSubMenu == 2) { // DVD
                    registrarDVD();

                } else if (opcionSubMenu == 3) { // Revista digital
                    registrarRevistaDigital();

                } else if (opcionSubMenu == 4) { // Audiolibro
                    registrarAudioLibro();

                }

            } // 2. Listar todos los materiales
            else if (opcion == 2) {
                System.out.println(mostrarBiblioteca());
            } // Prestar un material
            else if (opcion == 3) {
                prestarMaterial();
            } // Devolver un material
            else if (opcion == 4) {
                devolverMaterial();
            } // Reservar / Cancelar reserva
            else if (opcion == 5) {
                reservarCancelarReserva();
            } // Iniciar / Cerrar sesión digital
            else if (opcion == 6) {
                iniciarCancelarSesion();
            } else if (opcion == 7) {
                programa = false;
            }
        }
    }

    public static void imprimirMenu() {
        System.out.println("\n===== SISTEMA DE GESTIÓN DE BIBLIOTECA =====\n"
                + "1. Registrar nuevo material\n"
                + "2. Listar todos los materiales\n"
                + "3. Prestar un material\n"
                + "4. Devolver un material\n"
                + "5. Reservar / Cancelar reserva\n"
                + "6. Iniciar / Cerrar sesión digital\n"
                + "7. Salir\n"
                + "Seleccione una opción:  ");
    }

    public static void imprimirMenuTipoMaterial() {
        System.out.println(
                "===== TIPO DE MATERIAL =====\n"
                + "1. Libro\n"
                + "2. DVD\n"
                + "3. Revista Digital\n"
                + "4. Audiolibro\n"
                + "Seleccione una opción:  ");
    }

    // ------------------------ CREAR MATERIAL ------------------------ //

    public static void iniciarBiblioteca() {
        AudioLibro audioLibro = new AudioLibro("Biblia (Audio)", "BI-123", "Fantasia", "www.google.com", "Dios", 950);
        DVD dvd = new DVD("Erase una vez...", "ER-123", "Educacion", 120);
        LibroFisico libroFisico = new LibroFisico("La mano izquierda de la oscuridad", "LA-123", "Sci-fi", "Ursula K. Leguin", 1990);
        RevistaDigital revistaDigital = new RevistaDigital("National Geographic", "NA-123", "Cultura", "www.google.com", "Muchos", 3);

        listaBiblioteca.add(audioLibro);
        listaBiblioteca.add(dvd);
        listaBiblioteca.add(libroFisico);
        listaBiblioteca.add(revistaDigital);
    }

    public static void registrarLibro() {
        String autor, titulo, codigo, categoria;
        int anioPublicacion;

        System.out.println("Introduce el nombre del autor:");
        autor = miScanner.nextLine();

        System.out.println("Introduce el titulo del libro:");
        titulo = miScanner.nextLine();

        System.out.println("Introduce la categoria del libro:");
        categoria = miScanner.nextLine();

        System.out.println("Introduce el codigo del libro:");
        codigo = miScanner.nextLine().toUpperCase();

        System.out.println("Introduce el ano de publicacion:");
        anioPublicacion = miScanner.nextInt();

        LibroFisico nuevoLibro = new LibroFisico(titulo, codigo, categoria, autor, anioPublicacion);
        listaBiblioteca.add(nuevoLibro);

        System.out.println("El libro " + nuevoLibro.getTitulo() + " ha sido registrado en el sistema.");
    }

    public static void registrarDVD() {
        String titulo, codigo, categoria;
        int duracionMinutos;

        System.out.println("Introduce el titulo del DVD:");
        titulo = miScanner.nextLine();

        System.out.println("Introduce el codigo del DVD:");
        codigo = miScanner.nextLine().toUpperCase();

        System.out.println("Introduce la categoria del DVD:");
        categoria = miScanner.nextLine();

        System.out.println("Introduce la duracion en minutos:");
        duracionMinutos = miScanner.nextInt();

        DVD nuevoDVD = new DVD(titulo, codigo, categoria, duracionMinutos);
        listaBiblioteca.add(nuevoDVD);

        System.out.println("El DVD " + nuevoDVD.getTitulo() + " ha sido registrado en el sistema.");
    }

    public static void registrarRevistaDigital() {
        String titulo, codigo, categoria, url, editorial;
        int edicion;

        System.out.println("Introduce el titulo de la revista digital:");
        titulo = miScanner.nextLine();

        System.out.println("Introduce el nombre de la editorial:");
        editorial = miScanner.nextLine();

        System.out.println("Introduce la categoria de la revista digital:");
        categoria = miScanner.nextLine();

        System.out.println("Introduce el codigo de la revista digital:");
        codigo = miScanner.nextLine().toUpperCase();

        System.out.println("Introduce la url de la revista digital:");
        url = miScanner.nextLine();

        System.out.println("Introduce la edición:");
        edicion = miScanner.nextInt();

        RevistaDigital revistaDigital = new RevistaDigital(titulo, codigo, categoria, url, editorial, edicion);
        listaBiblioteca.add(revistaDigital);

        System.out.println("La revista digital " + revistaDigital.getTitulo() + " ha sido registrado en el sistema.");
    }

    public static void registrarAudioLibro() {
        String titulo, codigo, categoria, url, autor;
        int duracionMinutos;

        System.out.println("Introduce el titulo del audiolibro:");
        titulo = miScanner.nextLine();

        System.out.println("Introduce el nombre del autor:");
        autor = miScanner.nextLine();

        System.out.println("Introduce la categoria del audiolibro:");
        categoria = miScanner.nextLine();

        System.out.println("Introduce el codigo del audiolibro:");
        codigo = miScanner.nextLine().toUpperCase();

        System.out.println("Introduce la url del audiolibro:");
        url = miScanner.nextLine();

        System.out.println("Introduce la duracion en minutos:");
        duracionMinutos = miScanner.nextInt();

        AudioLibro nuevoAudioLibro = new AudioLibro(titulo, codigo, categoria, url, autor, duracionMinutos);
        listaBiblioteca.add(nuevoAudioLibro);

        System.out.println("El audiolibro " + nuevoAudioLibro.getTitulo() + " ha sido registrado en el sistema.");
    }

    // ------------------------ MANEJO DEL MATERIAL ------------------------ //

    public static String mostrarBiblioteca() {
        String biblioteca = "Registrado en la Biblioteca:\n";
        for (MaterialBiblioteca materialBiblioteca : listaBiblioteca) {
            biblioteca += materialBiblioteca.obtenerInformacion() + "\n";
        }
        return biblioteca;
    }

    public static void prestarMaterial() {
        System.out.println("Introduce el codigo del material:");
        String codigo = miScanner.nextLine().toUpperCase();

        // System.out.println(codigo);
        MaterialBiblioteca materialBuscado = buscarMaterial(codigo);
        // System.out.println(materialBuscado);

        if (materialBuscado != null) {
            if (materialBuscado instanceof Prestamo) {

                if (((Prestamo) materialBuscado).reservable() && ((Prestamo) materialBuscado).prestar()) {
                    ((Prestamo) materialBuscado).prestar();
                    System.out.println(materialBuscado.getTitulo() + ", con codigo: " + materialBuscado.getCodigo() + ", ha sido prestado.");
                } else {
                    System.out.println("El material no está prestado.");
                }
            } else {
                System.out.println(materialBuscado.getTitulo() + " no es un material prestable.");
            }
        } else {
            System.out.println("Material no encontrado.");
        }

    }

    public static MaterialBiblioteca buscarMaterial(String codigo) {
        MaterialBiblioteca materialBuscado = null;

        for (int i = 0; i < listaBiblioteca.size() && materialBuscado == null; i++) {
            if (codigo.equals(listaBiblioteca.get(i).getCodigo())) {
                materialBuscado = listaBiblioteca.get(i);
            }
        }
        return materialBuscado;
    }

    public static void devolverMaterial() {

        System.out.println("Introduce el codigo del material:");
        String codigo = miScanner.nextLine().toUpperCase();

        MaterialBiblioteca materialBuscado = buscarMaterial(codigo);

        if (materialBuscado != null) {
            if (materialBuscado instanceof Prestamo) {
                if (((Prestamo) materialBuscado).prestar() == true) {
                    ((Prestamo) materialBuscado).devolver();
                    System.out.println(materialBuscado.getTitulo() + " ha sido devuelto.");
                } else {
                    System.out.println("El material no estaba prestado.");
                }
            } else {
                System.out.println(materialBuscado.getTitulo() + " no es un material que se pueda devolver.");
            }
        } else {
            System.out.println("Material no encontrado.");
        }
    }

    public static void reservarCancelarReserva() {
        System.out.println("Introduce el codigo del material:");
        String codigo = miScanner.nextLine().toUpperCase();

        MaterialBiblioteca materialBuscado = buscarMaterial(codigo);
        if (materialBuscado != null) {
            if (!((Reservable) materialBuscado).estaReservado()) {
                ((Reservable) materialBuscado).reservar();
                System.out.println(materialBuscado.getTitulo() + " ha sido reservado.");
            } else if (((Reservable) materialBuscado).estaReservado()) {
                ((Reservable) materialBuscado).cancelarReserva();
                System.out.println("La reserva de: " + materialBuscado.getTitulo() + ", ha sido cancelada.");
            } else {
                System.out.println(materialBuscado.getTitulo() + " no es reservable.");
            }
        } else {
            System.out.println("Material no encontrado.");
        }

    }

    public static void iniciarCancelarSesion() {

        System.out.println("Introduce el codigo del material:");
        String codigo = miScanner.nextLine().toUpperCase();

        MaterialBiblioteca materialBuscado = buscarMaterial(codigo);

        if (materialBuscado != null) {

            if (!((AccesoDigital) materialBuscado).sesionActiva()) {
                System.out.println("Introduce el nombre de usuario:");
                String nombreUsuario = miScanner.nextLine().toUpperCase();
                System.out.println(((AccesoDigital) materialBuscado).iniciarSesion(nombreUsuario));
            }
            else if (((AccesoDigital) materialBuscado).sesionActiva()) {
                System.out.println(((AccesoDigital) materialBuscado).cerrarSesion());
            }
            else {
                System.out.println(materialBuscado.getTitulo() + " no se puede iniciar sesión.");
            }
        } else {
            System.out.println("Material no encontrado.");
        }
    }

}
