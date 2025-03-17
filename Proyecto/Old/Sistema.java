
import java.security.DrbgParameters;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * La clase Sistema gestiona la operación de aeropuertos, pistas, aviones, asientos y pasajeros.
 */
public class Sistema {

    public static ArrayList<Aeropuerto> listaAeropuertos = new ArrayList<Aeropuerto>();
    // public static ArrayList<Pista> listaPistas = new ArrayList<Pista>();
    public static ArrayList<Avion> listaAviones = new ArrayList<Avion>();

    private static Aeropuerto aeropuertoA;
    private static Aeropuerto aeropuertoB;
    private static Aeropuerto aeropuertoC;

    final static int CANTIDADAVIONES = 100;
    final static int CANTIDADTRIPULACIONABORDO = 5;

    /**
     * Imprime el menú principal del sistema.
     */
    public static void imprimirMenu() {
        System.out.println(mostrarLineas() + "\n"
                + "Escoge una opcion:\n"
                + "1. Gestionar Aeropuertos\n"
                + "2. Gestionar Pista de Aterrizaje\n" // siempre debe estar asignada a un aeropuerto!!!
                + "3. Gestionar Aviones\n"
                + "4. Gestion de Asientos y pasajeros\n"
                + "5. Salir del programa\n"
                + mostrarLineas());
    }

     /**
     * Muestra las opciones para gestionar aeropuertos.
     */
    private static void mostrarOpcionesGestionerAeropuertos() {
        System.out.println("1. Registrar nuevo Aeropuerto: ");
        System.out.println("2. Ver listado de Aeropuertos: ");
        System.out.println("3. Editar Aeropuerto Existente: ");
        System.out.println("4. Eliminar Aeropuerto del Sistema: ");
        System.out.println(mostrarLineas());
    }

    /**
     * Muestra las opciones para gestionar pistas.
     */
    private static void mostrarOpcionesGestionerPistas() {
        System.out.println("1. Registrar nueva Pista: "); // se asigna siempre a un aeropuerto!!!
        System.out.println("2. Ver listado y estado de las Pistas: ");
        System.out.println("3. Eliminar pista: ");
        System.out.println(mostrarLineas());
    }

    /**
     * Muestra las opciones para gestionar aviones.
     */
    private static void mostrarOpcionesGestionarAviones() {
        System.out.println("1. Registrar nuevo Avion");
        System.out.println("2. Ver listado de Aviones");
        System.out.println("3. Asignar pista a Avion");
        System.out.println("4. Liberar Avion de Pista");
        System.out.println("5. Mostrar Profesionales abordo");
        System.out.println(mostrarLineas());
    }

    /**
     * Muestra las opciones para gestionar asientos y pasajeros.
     */
    private static void mostrarOpcionesGestionarAsientos() {
        System.out.println("1. Reservar asiento");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Ver lista de pasajeros abordo");
        System.out.println("4. Ver detalles de un pasajero");
        System.out.println("5. Ver matriz de asientos del avion");
        System.out.println(mostrarLineas());
    }

    /**
     * Muestra una línea separadora.
     * 
     * @return Una cadena con la línea separadora.
     */
    private static String mostrarLineas() {
        return "--------------------------------------------------------";
    }

    /**
     * Inicializa el sistema con aeropuertos, aviones y pistas.
     */
    public static void inicializarSistema() {
        // Inicilizamos los tres aeropuertos:
        String ciudadA = Faker.ciudad();
        aeropuertoA = new Aeropuerto(Faker.nombresAeropuertos(), ciudadA, Faker.pais(), Faker.generarcodigoIATA(ciudadA));
        String ciudadB = Faker.ciudad();
        aeropuertoB = new Aeropuerto(Faker.nombresAeropuertos(), ciudadB, Faker.pais(), Faker.generarcodigoIATA(ciudadB));
        String ciudadC = Faker.ciudad();
        aeropuertoC = new Aeropuerto(Faker.nombresAeropuertos(), ciudadC, Faker.pais(), Faker.generarcodigoIATA(ciudadC));
        listaAeropuertos.add(aeropuertoA);
        listaAeropuertos.add(aeropuertoB);
        listaAeropuertos.add(aeropuertoC);

        // Inicializamos los 100 VUELOS para cada aeropuerto:
        for (int i = 0; i < CANTIDADAVIONES; i++) {
            LocalDateTime horaLlegadaA = Faker.generarFechaHoraLlegada();
            Avion nuevoAvionA = new Avion(Faker.modeloAvion(), Faker.matriculaAvion(aeropuertoA.getPais()), "Stem Airlines", horaLlegadaA, Faker.generarFechaHoraSalida(horaLlegadaA));
            aeropuertoA.agregarAvion(nuevoAvionA); // Para Aeropuerto A
            LocalDateTime horaLlegadaB = Faker.generarFechaHoraLlegada();
            Avion nuevoAvionB = new Avion(Faker.modeloAvion(), Faker.matriculaAvion(aeropuertoB.getPais()), "Stem Airlines", horaLlegadaB, Faker.generarFechaHoraSalida(horaLlegadaB));
            aeropuertoB.agregarAvion(nuevoAvionB); // Para Aeropuerto B
            LocalDateTime horaLlegadaC = Faker.generarFechaHoraLlegada();
            Avion nuevoAvionC = new Avion(Faker.modeloAvion(), Faker.matriculaAvion(aeropuertoC.getPais()), "Stem Airlines", horaLlegadaC, Faker.generarFechaHoraSalida(horaLlegadaC));
            aeropuertoC.agregarAvion(nuevoAvionC); // Para Aeropuerto C

            listaAviones.add(nuevoAvionA);
            listaAviones.add(nuevoAvionB);
            listaAviones.add(nuevoAvionC);

            // Inicializamos los profesionales de cada avion:
            generalProfesionales(CANTIDADTRIPULACIONABORDO, nuevoAvionA);
            generalProfesionales(CANTIDADTRIPULACIONABORDO, nuevoAvionB);
            generalProfesionales(CANTIDADTRIPULACIONABORDO, nuevoAvionC);

        }

        // Inicializamos las PISTAS para cada aeropuerto:
        int cantidadMaximaPistas = 5;
        int cantidadMinimaPistas = 10;
        int cantidadTotalPistas = Faker.entero(cantidadMinimaPistas, cantidadMaximaPistas);
        for (int i = 0; i < cantidadTotalPistas; i++) {
            Pista nuevPistaA = new Pista((i + 1), Faker.longitudDePista());
            aeropuertoA.agregarPista(nuevPistaA);
            Pista nuevPistaB = new Pista((i + 1), Faker.longitudDePista());
            aeropuertoB.agregarPista(nuevPistaB);
            Pista nuevPistaC = new Pista((i + 1), Faker.longitudDePista());
            aeropuertoC.agregarPista(nuevPistaC);
        }

    }

    /**
     * Genera profesionales y los asigna a un avión.
     * 
     * @param cantidadTripulacion La cantidad de tripulantes a generar.
     * @param avionAsignado El avión al que se asignarán los profesionales.
     */
    private static void generalProfesionales(int cantidadTripulacion, Avion avionAsignado) {

        for (int j = 0; j < cantidadTripulacion; j++) {
            Profesional nuevoProfesional;
            if (j < 2) {
                nuevoProfesional = new Profesional(Faker.nombres(), Faker.apellidos(), "piloto");
            } else {
                nuevoProfesional = new Profesional(Faker.nombres(), Faker.apellidos(), "azafata");
            }
            avionAsignado.asignarProfesional(nuevoProfesional);
        }

    }

    /**
     * Agrega un aeropuerto a la lista de aeropuertos.
     * 
     * @param nuevoAeropuerto El aeropuerto a agregar.
     */
    public static void agregarAeropuerto(Aeropuerto nuevoAeropuerto) {
        listaAeropuertos.add(nuevoAeropuerto);
    }

    /**
     * Agrega un avión a un aeropuerto.
     * 
     * @param nuevoAvion El avión a agregar.
     * @param aeropuerto El aeropuerto al que se agregará el avión.
     */
    public static void agregarAvionAeropuerto(Avion nuevoAvion, Aeropuerto aeropuerto) {

    }

     /**
     * Busca un aeropuerto por su código IATA.
     * 
     * @param codigoIATA El código IATA del aeropuerto.
     * @return El aeropuerto encontrado, o null si no se encuentra.
     */
    private static Aeropuerto buscarAeropuerto(String codigoIATA) {
        Aeropuerto aeropuertoBuscado = null;
        for (int i = 0; i < listaAeropuertos.size(); i++) {
            if (codigoIATA.equals(listaAeropuertos.get(i).getCodigoIATA())) {
                aeropuertoBuscado = listaAeropuertos.get(i);
            }
        }

        return aeropuertoBuscado;
    }

    /**
     * Muestra los aeropuertos registrados en el sistema.
     * 
     * @return Una cadena con la lista de aeropuertos registrados.
     */
    public static String mostrarAeropuertosRegistrados() {

        String mostrarAeropuertos = "AEROPUERTOS REGISTRADOS EN SISTEMA:\n";
        String aeropuertosMostrado = "";
        for (int i = 0; i < listaAeropuertos.size(); i++) {
            aeropuertosMostrado += listaAeropuertos.get(i) + "\n";
        }
        mostrarAeropuertos += aeropuertosMostrado;
        return mostrarAeropuertos;

    }

    /**
     * Muestra los aviones registrados en el sistema.
     * 
     * @return Una cadena con la lista de aviones registrados.
     */
    public static String mostrarAvionesRegistrados() {

        String mostrarListaAviones = "AVIONES REGISTRADOS EN EL SISTEMA.\n";
        String avionesMostrados = "";
        for (int i = 0; i < listaAviones.size(); i++) {
            avionesMostrados += listaAviones.get(i) + "\n";
        }
        mostrarListaAviones += avionesMostrados;
        return mostrarListaAviones;

    }

    /**
     * Busca una pista por su código y el código IATA del aeropuerto.
     * 
     * @param codigoPista El código de la pista.
     * @param codigoIATA El código IATA del aeropuerto.
     * @return La pista encontrada, o null si no se encuentra.
     */
    private static Pista buscarPista (int codigoPista, String codigoIATA) {

        Pista pistaBuscada = null;
        Aeropuerto aeropuertoBuscado = buscarAeropuerto(codigoIATA);

        for (int i = 0; i < aeropuertoBuscado.getListaPistas().size(); i++) {
            if (codigoPista == aeropuertoBuscado.getListaPistas().get(i).getCodigo()) {
                pistaBuscada = aeropuertoBuscado.getListaPistas().get(i);
            }
        }

        return pistaBuscada;
    }

    /**
     * Busca un avión por su matrícula.
     * 
     * @param matricula La matrícula del avión.
     * @return El avión encontrado, o null si no se encuentra.
     */
    private static Avion buscarAvion (String matricula) {
        
        Avion avionBuscado = null;

        for (int i = 0; i < listaAviones.size(); i++) {
            if (matricula.equals(listaAviones.get(i).getMatricula())) {
                avionBuscado = listaAviones.get(i);
            }
        }

        return avionBuscado;
    }

    /**
     * Muestra los aviones no asignados a una pista en un aeropuerto.
     * 
     * @param aeropuerto El aeropuerto en el que buscar aviones no asignados.
     * @return Una cadena con la lista de aviones no asignados.
     */
    private static String mostrarAvionesNoAsignados(Aeropuerto aeropuerto) {

        String listaAvionesNoAsignado = "AVIONES NO ASIGNADOS: \n";
        String avionNoAsignado = "";

        for (int i = 0; i < aeropuerto.getListaAvionesAeropuerto().size(); i++) {
            if(aeropuerto.getListaAvionesAeropuerto().get(i).getAsignada() == null) {
                avionNoAsignado += aeropuerto.getListaAvionesAeropuerto().get(i);
            }
        }
        return listaAvionesNoAsignado + avionNoAsignado;
    }

    /**
     * Muestra un mensaje de error basado en un código de error.
     * 
     * @param codigoError El código de error.
     * @return Una cadena con el mensaje de error.
     */
    private static String mensajeError (int codigoError) {
        String mensajeError = "";

        if (codigoError == 0) {
            mensajeError = "El asiento no existe.";
        }

        else if (codigoError == 1) {
            mensajeError = "El asiento ya está ocupado.";
        }

        return mensajeError;
    }

    /**
     * Método principal para ejecutar el sistema.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        boolean programa = true;
        Scanner miScanner = new Scanner(System.in);

        inicializarSistema();

        while (programa) {

            imprimirMenu();
            int opcion = miScanner.nextInt();

            // Gestionar aeropuertos
            if (opcion == 1) {

                int opcionGestionAeropuerto;
                mostrarOpcionesGestionerAeropuertos();
                opcionGestionAeropuerto = miScanner.nextInt();
                miScanner.nextLine();

                if (opcionGestionAeropuerto == 1) {

                    // Registramos nuevo Aeropuerto:
                    String codigoIATA = "";
                    String nombre, ciudad, pais;
                    boolean codigoIATAvalido = false;

                    // Muestro previamente los aeropuertos:
                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println(mostrarLineas());

                    // Validamos si el codigo IATA ya existe:
                    while (!codigoIATAvalido) {
                        System.out.println("Introduce el codigo IATA del aeropuerto: ");
                        codigoIATA = miScanner.nextLine().toUpperCase();

                        codigoIATAvalido = true;
                        for (Aeropuerto aeropuerto : listaAeropuertos) {
                            if (codigoIATA.equals(aeropuerto.getCodigoIATA())) {
                                codigoIATAvalido = false;
                            }
                        }
                        if (!codigoIATAvalido) {
                            System.out.println("Error: El código IATA ya existe. Intenta con otro.");
                        }
                    }

                    System.out.println("Introduce nombre del aeropuerto: ");
                    nombre = miScanner.nextLine();

                    System.out.println("Introduce la ciudad del aeropuerto: ");
                    ciudad = miScanner.nextLine();

                    System.out.println("Introduce el pais del aeropuerto: ");
                    pais = miScanner.nextLine();

                    Aeropuerto nuevoAeropuerto = new Aeropuerto(nombre, ciudad, pais, codigoIATA);
                    listaAeropuertos.add(nuevoAeropuerto);

                    // Se muestra el nuevo aeropuerto creado:
                    System.out.println(mostrarLineas());
                    System.out.println("NUEVO AEROPUERTO CREADO\n" + nuevoAeropuerto);
                    System.out.println(mostrarLineas());

                } 
                
                else if (opcionGestionAeropuerto == 2) {
                    System.out.println(mostrarAeropuertosRegistrados());

                } 
                
                else if (opcionGestionAeropuerto == 3) {

                    String codigoIATABuscado = "";
                    String ciudadCorregida, nombreCorregido, paisCorregido;
                    Aeropuerto aeropuertoBuscado;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codido IATA del Aeropuerto:");
                    codigoIATABuscado = miScanner.nextLine().toUpperCase();
                    aeropuertoBuscado = buscarAeropuerto(codigoIATABuscado);

                    if (aeropuertoBuscado != null) {
                        System.out.println("Corrige el nombre del aeropuerto:");
                        nombreCorregido = miScanner.nextLine();
                        System.out.println("Corrige el nombre de la ciudad:");
                        ciudadCorregida = miScanner.nextLine();
                        System.out.println("Corrige el nombre del Pais:");
                        paisCorregido = miScanner.nextLine();

                        aeropuertoBuscado.setCiudad(ciudadCorregida);
                        aeropuertoBuscado.setPais(paisCorregido);
                        aeropuertoBuscado.setNombre(nombreCorregido);

                        System.out.println("AEROPUERTO CORREGIDO:");
                        System.out.println(aeropuertoBuscado);
                    } else {
                        System.out.println("Aeropuerto no encontrado.");
                    }

                } 
                
                else if (opcionGestionAeropuerto == 4) {
                    String codigoIATABuscado = "";
                    Aeropuerto aeropuertoBuscado = null;
                    int posicionAvionArray = 0;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codido IATA del Aeropuerto:");
                    codigoIATABuscado = miScanner.nextLine().toUpperCase();

                    aeropuertoBuscado = buscarAeropuerto(codigoIATABuscado);

                    if (aeropuertoBuscado != null) {
                        String confirmacion;
                        System.out.println("Estas seguro de que seas borrar el aeropuerto " + aeropuertoBuscado.getNombre() + " del sistema: (Y/N)");
                        confirmacion = miScanner.nextLine().toUpperCase();

                        if (confirmacion.equals("Y")) {
                            listaAeropuertos.remove(posicionAvionArray);
                            System.out.println("Aeropuerto " + aeropuertoBuscado.getNombre() + " ha sido eliminado del sistema.");
                        }
                    } else {
                        System.out.println("Aeropuerto no encontrado.");
                    }
                }
            } 
            
            // Gestionar pistas
            else if (opcion == 2) {

                mostrarOpcionesGestionerPistas();
                int opcionGestionerPista = miScanner.nextInt();

                // Crear Pista nueva
                if (opcionGestionerPista == 1) {

                    miScanner.nextLine();
                    String codigoIATA;
                    Aeropuerto aeropuertoBuscado;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codigo IATA del Aeropuerto al que deseas asignar la pista: ");
                    codigoIATA = miScanner.nextLine().toUpperCase();

                    aeropuertoBuscado = buscarAeropuerto(codigoIATA);
                    System.out.println(aeropuertoBuscado.mostrarInfoAeropuerto());

                    if (aeropuertoBuscado != null) {
                        int nuevoCodigoPista, nuevaLongitudPista;
                        boolean existe = false;

                        System.out.println("Introduce el codigo de la nueva pista: ");
                        nuevoCodigoPista = miScanner.nextInt();

                        // Se busca el codigo de la pista para ver que no coincida con una existente:
                        for (int i = 0; i < aeropuertoBuscado.getListaPistas().size(); i++) {
                            if (nuevoCodigoPista == aeropuertoBuscado.getListaPistas().get(i).getCodigo()) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            System.out.println("Introduce la longitud de la nueva pista: ");
                            nuevaLongitudPista = miScanner.nextInt();

                            Pista nuevaPista = new Pista(nuevoCodigoPista, nuevaLongitudPista);
                            System.out.println("NUEVA PISTA CREADA:\n" + nuevaPista);
                            aeropuertoBuscado.getListaPistas().addLast(nuevaPista);
                        }

                        else {
                            System.out.println("Esa Pista ya existe.");
                        }

                    } else {
                        System.out.println("El aeropuerto seleccionado no está en el sistema.");
                    }
                } 
                
                // Ver listado de Pistas
                else if (opcionGestionerPista == 2) {

                    miScanner.nextLine();
                    String codigoIATA;
                    Aeropuerto aeropuertoBuscado;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codigo IATA del Aeropuerto del que deseas ver las pistas: ");
                    codigoIATA = miScanner.nextLine().toUpperCase();
                    
                    aeropuertoBuscado = buscarAeropuerto(codigoIATA);

                    if (aeropuertoBuscado != null) {
                        System.out.println(aeropuertoBuscado.mostrarInfoAeropuerto());
                    }
                    else {
                        System.out.println("El aeropuerto no está registrado en el sistema.");
                    }
                } 
                
                // Eliminar Pista
                else if (opcionGestionerPista == 3) {
                    miScanner.nextLine();
                    String codigoIATA;
                    int codigoPistaEliminar;
                    Aeropuerto aeropuertoBuscado;
                    int posicionPistaArray = 0;
                    Pista pistaEliminar = null;
                    String confirmacion;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codigo IATA del Aeropuerto del que deseas ver las pistas: ");
                    codigoIATA = miScanner.nextLine().toUpperCase();
                    
                    aeropuertoBuscado = buscarAeropuerto(codigoIATA);

                    if (aeropuertoBuscado != null) {

                        System.out.println(aeropuertoBuscado.mostrarInfoAeropuerto());
                        System.out.println("Introduce el codigo de la Pista que deseas eliminar:");
                        codigoPistaEliminar = miScanner.nextInt();
                        miScanner.nextLine();

                        for(int i = 0; i < aeropuertoBuscado.getListaPistas().size(); i++) {
                            if (codigoPistaEliminar == aeropuertoBuscado.getListaPistas().get(i).getCodigo()) {
                                posicionPistaArray = i;
                                pistaEliminar = aeropuertoBuscado.getListaPistas().get(i);
                            }
                        }

                        if (pistaEliminar != null) {

                            System.out.println("Estás seguro de que deseas eliminar la pista:(Y/N)");
                            confirmacion = miScanner.nextLine().toUpperCase();
                            
                            if (confirmacion.equals("Y")) {
                                aeropuertoBuscado.getListaPistas().remove(posicionPistaArray);
                                System.out.println("La pista " + pistaEliminar.getCodigo() + " del aeropuerto " + aeropuertoBuscado.getNombre() + " ha sido eliminada.");
                            }
                        } 
                    
                        System.out.println("Pista no está registrada en el sistema.");
                    }

                    else {
                        System.out.println("El aeropuerto no está registrado en el sistema.");
                    }
                }    
            }
            
            // Gestionar Aviones
            else if (opcion == 3) {

                int opcionGestionarAvion;
                Avion nuevoAvion = null;
                String numeroNuevaMatricula, modeloAvion, compania;
                LocalDateTime horaLlegada = LocalDateTime.now();
                LocalDateTime horaSalida = LocalDateTime.now();
                boolean horaCorrecta = false;
                mostrarOpcionesGestionarAviones();
                opcionGestionarAvion = miScanner.nextInt();
                miScanner.nextLine();

                // Avion nuevo
                if (opcionGestionarAvion == 1) {
                    
                    System.out.println(listaAviones.get(0));
                    System.out.println("Introduce el numero de matricula del nuevo avion:");
                    numeroNuevaMatricula = miScanner.nextLine().toUpperCase();

                    if (!Faker.buscarMartriculaAvion(numeroNuevaMatricula)) {

                        System.out.println("Introduce el modelo del avion: ");
                        modeloAvion = miScanner.nextLine();
        
                        System.out.println("Introduce la compania del avion: ");
                        compania = miScanner.nextLine();
                        
                        while(!horaCorrecta) {

                            System.out.println("Introduce la llegada: yyyy-MM-dd HH:mm:ss");
                            String horaLlegadaAvion = miScanner.nextLine();
                            
                            
                            System.out.println("Introduce la salida: yyyy-MM-dd HH:mm:ss");
                            String horaSalidaAvion = miScanner.nextLine();
                            
                            if (horaLlegadaAvion.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}") && horaSalidaAvion.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
                                horaLlegada = LocalDateTime.parse(horaLlegadaAvion, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                                horaSalida = LocalDateTime.parse(horaSalidaAvion, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                                
                                if (horaSalida.isBefore(horaLlegada)) {
                                    System.out.println("Error: La hora de salida no puede ser anterior a la llegada.");
                                } else {
                                    horaCorrecta = true; // Salir del bucle si todo es correcto
                                }
                            }

                            else {
                                System.out.println("Los horarios introducidos son incorrectos. Por favor, usa el formato yyyy-MM-dd HH:mm:ss.");
                            }
                        }

                        nuevoAvion = new Avion(modeloAvion, numeroNuevaMatricula, compania, horaLlegada, horaSalida);
                        listaAviones.add(nuevoAvion);
                        System.out.println("El avion " + nuevoAvion.getMatricula() + " ha sido registrado en el sistema.");
                    }

                    else {
                        System.out.println("La matricula " + numeroNuevaMatricula + " ya está registrada en el sistema.");
                    }

                }

                // Ver aviones
                else if (opcionGestionarAvion == 2) {
                    System.out.println(mostrarAvionesRegistrados());
                }

                // Asignar avion a pista
                else if (opcionGestionarAvion == 3) {

                    String codigoIATA, matriculaAvion;
                    Aeropuerto aeropuertoBuscado = null;
                    int codigoPistaBuscada;
                    Avion avionBuscado;
                    Pista pistaBuscada;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codigo IATA del aeropuerto:");
                    codigoIATA = miScanner.nextLine().toUpperCase();

                    aeropuertoBuscado = buscarAeropuerto(codigoIATA);

                    if (aeropuertoBuscado != null) {

                        System.out.println(aeropuertoBuscado.mostrarInfoAeropuerto());
                        System.out.println("Introduce el codigo de la pista del aeropuerto:");
                        codigoPistaBuscada = miScanner.nextInt();
                        miScanner.nextLine();
                        pistaBuscada = buscarPista(codigoPistaBuscada, codigoIATA);

                        if (pistaBuscada != null) {

                            System.out.println(mostrarAvionesNoAsignados(aeropuertoBuscado));
                            System.out.println("Introduce la matricula del avion a asignar:");
                            matriculaAvion = miScanner.nextLine().toUpperCase();
                            avionBuscado = buscarAvion(matriculaAvion);

                            if (avionBuscado != null) {
                                boolean puedeAsignar = true;
                                // Como exista pista y avion, lo asigno a la pista SIEMPRE QUE NO HAYA OTRO AVION ASIGNADO
                                for (int i = 0; i < pistaBuscada.getListaAviones().size(); i++) {
                                    LocalDateTime horaLLegadaAvionPista = pistaBuscada.getListaAviones().get(i).getHoraFechaLlegada();
                                    LocalDateTime horaSalidaAvionPista = pistaBuscada.getListaAviones().get(i).getHoraFechaSalida();
                  
                                    if (avionBuscado.getHoraFechaLlegada().isBefore(horaSalidaAvionPista) &&
                                        avionBuscado.getHoraFechaSalida().isAfter(horaLLegadaAvionPista))  {
                                        System.out.println("Error: La pista ya tiene asignado un avión en ese horario.");
                                        puedeAsignar = false;
                                    }
                                }

                                if (puedeAsignar) {
                                    pistaBuscada.agregarAvion(avionBuscado);
                                    avionBuscado.setAsignada(pistaBuscada);
                                    System.out.println(avionBuscado);
                                }
                            }

                            else {
                                System.out.println("El avion no está registrado.");
                            }
                        }

                        else {
                            System.out.println("La pista no existe.");
                        }
                    }

                    else {
                        System.out.println("El aeropuerto con codigo " + codigoIATA + " no está registrado.");
                    }
                }

                // Liberar avion de pista
                else if (opcionGestionarAvion == 4) {
                    String codigoIATA, matriculaAvion;
                    Aeropuerto aeropuertoBuscado = null;
                    int codigoPistaBuscada;
                    Avion avionBuscado;
                    Pista pistaBuscada;

                    System.out.println(mostrarAeropuertosRegistrados());
                    System.out.println("Introduce el codigo IATA del aeropuerto:");
                    codigoIATA = miScanner.nextLine().toUpperCase();

                    aeropuertoBuscado = buscarAeropuerto(codigoIATA);

                    if (aeropuertoBuscado != null) {

                        System.out.println(aeropuertoBuscado.mostrarInfoAeropuerto());
                        System.out.println("Introduce el codigo de la pista del aeropuerto:");
                        codigoPistaBuscada = miScanner.nextInt();
                        miScanner.nextLine();
                        pistaBuscada = buscarPista(codigoPistaBuscada, codigoIATA);

                        if (pistaBuscada != null) {

                            System.out.println(mostrarAvionesNoAsignados(aeropuertoBuscado));
                            System.out.println("Introduce la matricula del avion a asignar:");
                            matriculaAvion = miScanner.nextLine().toUpperCase();
                            avionBuscado = buscarAvion(matriculaAvion);

                            if (avionBuscado != null) {
                        
                                System.out.println("Seguro deseas retirar el avion de la pista:(Y/N)");
                                String confirmacion = miScanner.nextLine().toUpperCase();

                                if (confirmacion.equals("Y")) {
                                    pistaBuscada.retirarAvion(avionBuscado.getMatricula());
                                    System.out.println("El avion con matricula " + avionBuscado.getMatricula() + " ha sido retirado de la pista " + pistaBuscada.getCodigo() + ".");
                                }
                            }

                            else {
                                System.out.println("El avion no está registrado.");
                            }
                        }
                        else {
                            System.out.println("La pista no existe.");
                        }
                    }
                    else {
                        System.out.println("El aeropuerto con codigo " + codigoIATA + " no está registrado.");
                    }
                }
                
                // Ver tripulacion en avion
                else if (opcionGestionarAvion == 5) {
                    Avion avionBuscado;
                    String matricula;

                    System.out.println("Introduce la matricula del avion a buscar:");
                    matricula = miScanner.nextLine().toUpperCase();

                    avionBuscado = buscarAvion(matricula);

                    if (avionBuscado != null) {
                        System.out.println(avionBuscado.mostrarProfesionalesAbordo());
                    }
                    else {
                        System.out.println("El avion no esta registrado en el sistema.");
                    }

                }
            } 

            // Gestionar Asientos y pasajeros
            else if (opcion == 4) {
                
                int opcionAsientos;
                String matriculaVuelo;
                Avion avionBuscado = null;
                mostrarOpcionesGestionarAsientos();
                opcionAsientos = miScanner.nextInt();
                miScanner.nextLine();
                Pasajero nuevoPasajero;

                if (opcionAsientos == 1) {
                    System.out.println("Introduce la matricula del avion al que deseas asignar el pasajero:");
                    matriculaVuelo = miScanner.nextLine().toUpperCase();
                    avionBuscado = buscarAvion(matriculaVuelo);

                    if (avionBuscado != null) {

                        // meter en un metodo realizarReserva()
                        String nombre, apellidos, nacionalidad, asientoColumna, pasaporte, confirmarEquipajeMano;
                        int edad, numeroPasaje, numeroMaletas, asientoFila;
                        boolean equipajeMano;

                        System.out.println("Introduce el nombre del pasajero:");
                        nombre = miScanner.nextLine();

                        System.out.println("Introduce los apellidos del pasajero:");
                        apellidos = miScanner.nextLine();

                        System.out.println("Introduce el pasaporte del pasajero:");
                        pasaporte = miScanner.nextLine().toUpperCase();

                        System.out.println("Introduce la nacionalidad del pasajero:");
                        nacionalidad = miScanner.nextLine();

                        System.out.println("Lleva equipaje de mano:(Y/N)");
                        confirmarEquipajeMano = miScanner.nextLine().toUpperCase();

                        System.out.println("Columna a reservar (A-F):"); 
                        asientoColumna = miScanner.nextLine().toUpperCase();

                        System.out.println("Fila a reservar (1-30):");
                        asientoFila = miScanner.nextInt();

                        System.out.println("Numero de maletas de mano:");
                        numeroMaletas = miScanner.nextInt();

                        System.out.println("Introduce la edad del pasajero:");
                        edad = miScanner.nextInt();

                        System.out.println("Introduce el numero de pasaje del pasajero:");
                        numeroPasaje = miScanner.nextInt();
                        miScanner.nextLine(); 

                        if (confirmarEquipajeMano.equals("Y")) {
                            equipajeMano = true;
                        }
                        else {
                            equipajeMano = false;
                        }

                        nuevoPasajero = new Pasajero(nombre, apellidos, pasaporte, nacionalidad, edad, numeroPasaje, equipajeMano, numeroMaletas);
                        // Validamos que el asiento existe
                        if (avionBuscado.asientoExiste(asientoFila, asientoColumna)) {
                            // Se valida que el asiento no esté ya ocupado
                            if (!avionBuscado.asientoOcupado(asientoFila, asientoColumna)) {
                                avionBuscado.asignarAsientos(nuevoPasajero, asientoFila, asientoColumna);
                                System.out.println("El pasajero " + nuevoPasajero.getApellidos() + " ha sido asignado al asiento " + asientoColumna + asientoFila + " del avion " + avionBuscado.getMatricula() + " con exito.");
                            }

                            else {
                                System.out.println("El asiento ya está ocupado.");
                            }
                        }

                        else {
                            System.out.println("El asiento no existe.");
                        }
                    }

                    else {
                        System.out.println("El avion no está registrado.");
                    }
                }
                
                else if (opcionAsientos == 2) {
                    
                    System.out.println("Introduce la matricula del avion:");
                    matriculaVuelo = miScanner.nextLine().toUpperCase();
                    avionBuscado = buscarAvion(matriculaVuelo);

                    if (avionBuscado != null) {
                        String asientoColumna;
                        int asientoFila;

                        System.out.println("Columna a reservar (A-F):"); 
                        asientoColumna = miScanner.nextLine().toUpperCase();

                        System.out.println("Fila a reservar (1-30):");
                        asientoFila = miScanner.nextInt();

                        if(avionBuscado.asientoExiste(asientoFila, asientoColumna)) {
                            avionBuscado.liberarAsiento(asientoFila, asientoColumna);
                            System.out.println("El asiento " + asientoFila + asientoColumna + " ha sido liberado.");
                        }

                        else {
                            System.out.println("El asiento no existe.");
                        }
                    }

                    else {
                        System.out.println("El avion no está registrado.");
                    }
                }

                else if (opcionAsientos == 3) {
                    System.out.println("Introduce la matricula del avion:");
                    matriculaVuelo = miScanner.nextLine().toUpperCase();
                    avionBuscado = buscarAvion(matriculaVuelo);

                    if (avionBuscado != null) {
                        System.out.println(avionBuscado.mostrarPasajeros());
                    }

                    else {
                        System.out.println("El avion no está registrado.");
                    }

                }

                else if (opcionAsientos == 4) {
                    System.out.println("Introduce la matricula del avion del pasajero:");
                    matriculaVuelo = miScanner.nextLine().toUpperCase();
                    avionBuscado = buscarAvion(matriculaVuelo);
                    String pasaporte;

                    if (avionBuscado != null) {

                        System.out.println("Introduce el pasaporte del pasajero:");
                        pasaporte = miScanner.nextLine().toUpperCase();
                        Pasajero pasajeroBuscado = null;

                        avionBuscado.buscarPasajero(pasaporte);
                        if (pasajeroBuscado != null) {
                            System.out.println(pasajeroBuscado);
                        }
                        else {
                            System.out.println("El pasajero no está registrado en el sistema.");
                        }
                    }

                    else {
                        System.out.println("El avion no está registrado.");
                    }
                }

                else if (opcionAsientos == 5) {
                    System.out.println("Introduce la matricula del avion del pasajero:");
                    matriculaVuelo = miScanner.nextLine().toUpperCase();
                    avionBuscado = buscarAvion(matriculaVuelo);

                    if (avionBuscado != null ) {
                        System.out.println(avionBuscado.mostrarAsientos());
                    }
                    else {
                        System.out.println("El avion no está registrado.");
                    }
                }
                
            } 
            
            // Salir del programa
            else if (opcion == 5) {
                programa = false;
            }

            else {
                System.out.println("Opcion incorrecta. Introduce 1, 2, 3, 4, 5 o 6.");
            }
        }
    }
}
