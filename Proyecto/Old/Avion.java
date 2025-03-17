import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * La clase Avion representa un avión con su modelo, matrícula, compañía, horarios de llegada y salida,
 * asignación de pista, y la distribución de asientos. También gestiona la asignación de pasajeros y profesionales a bordo.
 */
public class Avion {

    private String modelo;
    private String matricula;
    private String compania;
    private LocalDateTime horaFechaLlegada;
    private LocalDateTime horaFechaSalida;
    private Pista asignada;

    private Pasajero[][] asientos;
    private ArrayList<Profesional> profesionalesAbordo;

    /**
     * Constructor que inicializa un nuevo avión con los detalles proporcionados.
     * 
     * @param modelo El modelo del avión.
     * @param matricula La matrícula del avión.
     * @param compania La compañía que opera el avión.
     * @param horaFechaLlegada La hora y fecha de llegada del avión.
     * @param horaFechaSalida La hora y fecha de salida del avión.
     */
    public Avion(String modelo, String matricula, String compania, LocalDateTime horaFechaLlegada, LocalDateTime horaFechaSalida) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.compania = compania;
        this.horaFechaLlegada = horaFechaLlegada;
        this.horaFechaSalida = horaFechaSalida;
        this.asientos = new Pasajero[30][6];
        this.profesionalesAbordo = new ArrayList<Profesional>();
    }

    // ------------------------ GETTERS AND SETTERS ------------------------ //

    /**
     * Obtiene el modelo del avión.
     * 
     * @return El modelo del avión.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del avión.
     * 
     * @param modelo El modelo a establecer.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la matrícula del avión.
     * 
     * @return La matrícula del avión.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del avión.
     * 
     * @param matricula La matrícula a establecer.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene la compañía del avión.
     * 
     * @return La compañía del avión.
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Establece la compañía del avión.
     * 
     * @param compania La compañía a establecer.
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * Obtiene la hora y fecha de llegada del avión.
     * 
     * @return La hora y fecha de llegada.
     */
    public LocalDateTime getHoraFechaLlegada() {
        return horaFechaLlegada;
    }

    /**
     * Establece la hora y fecha de llegada del avión.
     * 
     * @param horaFechaLlegada La hora y fecha a establecer.
     */
    public void setHoraFechaLlegada(LocalDateTime horaFechaLlegada) {
        this.horaFechaLlegada = horaFechaLlegada;
    }

    /**
     * Obtiene la hora y fecha de salida del avión.
     * 
     * @return La hora y fecha de salida.
     */
    public LocalDateTime getHoraFechaSalida() {
        return horaFechaSalida;
    }

    /**
     * Establece la hora y fecha de salida del avión.
     * 
     * @param horaFechaSalida La hora y fecha a establecer.
     */
    public void setHoraFechaSalida(LocalDateTime horaFechaSalida) {
        this.horaFechaSalida = horaFechaSalida;
    }

    /**
     * Obtiene la pista asignada al avión.
     * 
     * @return La pista asignada.
     */
    public Pista getAsignada() {
        return asignada;
    }

    /**
     * Establece la pista asignada al avión.
     * 
     * @param asignada La pista a asignar.
     */
    public void setAsignada(Pista asignada) {
        this.asignada = asignada;
    }

    /**
     * Obtiene la matriz de asientos del avión.
     * 
     * @return La matriz de asientos.
     */
    public Pasajero[][] getAsientos() {
        return asientos;
    }

    /**
     * Establece la matriz de asientos del avión.
     * 
     * @param asientos La matriz de asientos a establecer.
     */
    public void setAsientos(Pasajero[][] asientos) {
        this.asientos = asientos;
    }

    // ------------------------ METODOS ------------------------ //

    /**
     * Convierte una letra de columna (A-F) a un número.
     * 
     * @param letra La letra de la columna (A-F).
     * @return El número correspondiente a la letra.
     */
    private int convertirLetraNumero(String letra) {
        int numero = 0;
        if (letra.equals("A")) {
            numero = 0;
        } else if (letra.equals("B")) {
            numero = 1;
        } else if (letra.equals("C")) {
            numero = 2;
        } else if (letra.equals("D")) {
            numero = 3;
        } else if (letra.equals("E")) {
            numero = 4;
        } else if (letra.equals("F")) {
            numero = 5;
        }
        return numero;
    }

    /**
     * Convierte un número de columna (0-5) a una letra.
     * 
     * @param numero El número de la columna.
     * @return La letra correspondiente al número.
     */
    private String convertirNumeroLetra(int numero) {
        String letra = "A";
        if (numero == 0) {
            letra = "A";
        } else if (numero == 1) {
            letra = "B";
        } else if (numero == 2) {
            letra = "C";
        } else if (numero == 3) {
            letra = "D";
        } else if (numero == 4) {
            letra = "E";
        } else if (numero == 5) {
            letra = "F";
        }
        return letra;
    }

    /**
     * Muestra el mapa de asientos del avión.
     * 
     * @return Una cadena que representa el mapa de asientos.
     */
    public String mostrarAsientos() {
        String asientosMostrados = "   ABCDEF\n";
        for (int i = 0; i < asientos.length; i++) {
            asientosMostrados += String.format("%2d ", (i + 1));
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] == null) {
                    asientosMostrados += "O";
                } else {
                    asientosMostrados += "X";
                }
                if (i == 0 && j == 5) {
                    asientosMostrados += "  -> Primera Clase";
                }
                if (i == 2 && j == 5) {
                    asientosMostrados += "  -> Clase Turista";
                }
            }
            asientosMostrados += "\n";
        }
        return asientosMostrados;
    }

    /**
     * Verifica si un asiento está ocupado.
     * 
     * @param fila La fila del asiento.
     * @param columna La columna del asiento.
     * @return true si el asiento está ocupado, false si está libre.
     */
    public boolean asientoOcupado(int fila, String columna) {
        boolean ocupado = false;
        int columnaNumerica = convertirLetraNumero(columna);
        if (asientos[fila - 1][columnaNumerica] != null) {
            ocupado = true;
        }
        return ocupado;
    }

    /**
     * Verifica si un asiento existe en el avión.
     * 
     * @param fila La fila del asiento.
     * @param columna La columna del asiento.
     * @return true si el asiento existe, false si no.
     */
    public boolean asientoExiste(int fila, String columna) {
        boolean existe = false;
        int columnaNumerica = convertirLetraNumero(columna);
        if (fila >= 0 && fila < asientos.length && columnaNumerica < asientos[0].length) {
            existe = true;
        }
        return existe;
    }

    /**
     * Asigna un pasajero a un asiento específico.
     * 
     * @param pasajero El pasajero a asignar.
     * @param fila La fila del asiento.
     * @param columna La columna del asiento.
     * @return true si el asiento fue asignado, false si el asiento ya está ocupado.
     */
    public boolean asignarAsientos(Pasajero pasajero, int fila, String columna) {
        boolean asignado = false;
        int columnaNumerica = convertirLetraNumero(columna);
        if (asientos[fila - 1][columnaNumerica] == null) {
            asientos[fila - 1][columnaNumerica] = pasajero; // asigno el asiento
            asignado = true;
        }
        return asignado;
    }

    /**
     * Busca un pasajero por su pasaporte.
     * 
     * @param pasaporte El número de pasaporte del pasajero.
     * @return El pasajero encontrado, o null si no se encuentra.
     */
    public Pasajero buscarPasajero(String pasaporte) {
        Pasajero pasajeroActual = null;
        Pasajero pasajeroBuscado = null;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                pasajeroActual = asientos[i][j];
                if(asientos[i][j] != null && pasaporte.equals(pasajeroActual.getPasaporte())) {
                    pasajeroBuscado = asientos[i][j];
                }
            }
        }
        return pasajeroBuscado;
    }

    /**
     * Libera un asiento específico.
     * 
     * @param fila La fila del asiento.
     * @param columna La columna del asiento.
     */
    public void liberarAsiento(int fila, String columna) {
        int columnaNumerica = convertirLetraNumero(columna);
        if (asientos[fila - 1][columnaNumerica] != null) {
            asientos[fila - 1][columnaNumerica] = null;
        }
    }

    /**
     * Muestra una lista de los pasajeros que están a bordo del avión.
     * 
     * @return Una cadena que lista los pasajeros.
     */
    public String mostrarPasajeros() {
        String pasajerosAbordo = "PASAJEROS ABORDO:\n";
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] != null) {
                    pasajerosAbordo += asientos[i][j] + " | " + "Asiento: " + (i + 1) + convertirNumeroLetra(j);
                    if (i <= 2) {
                        pasajerosAbordo += " Primera Clase \n";
                    } else {
                        pasajerosAbordo += " Clase Economica \n";
                    }
                }
            }
        }
        return pasajerosAbordo;
    }

    /**
     * Asigna un profesional al avión.
     * 
     * @param nuevoProfesional El profesional a asignar.
     */
    public void asignarProfesional(Profesional nuevoProfesional) {
        profesionalesAbordo.add(nuevoProfesional);
    }

    /**
     * Muestra la lista de los profesionales a bordo del avión.
     * 
     * @return Una cadena que lista los profesionales.
     */
    public String mostrarProfesionalesAbordo() {
        String listaProfesionales = "LISTA DE PROFESIONALES ABORDO: \n";
        for (int i = 0; i < profesionalesAbordo.size(); i++) {
            listaProfesionales += profesionalesAbordo.get(i) + "\n";
        }
        return listaProfesionales;
    }

    /**
     * Devuelve una representación en cadena del avión.
     * 
     * @return Una cadena con la descripción del avión.
     */
    public String toString() {
        return "-------------------------------\n"
                + this.modelo + " | " + this.matricula + " | " + this.compania + " \n"
                + "-------------------------------\n"
                + "LLEGADA: " + this.horaFechaLlegada + " | " + "SALIDA: " + this.horaFechaSalida + "\n"
                + "-------------------------------\n"
                + "PISTA ASIGNADA: " + this.getAsignada() + "\n"
                + "-------------------------------\n";
    }

    /**
     * Método principal para probar la funcionalidad de la clase Avion.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Avion nuevoAvion = new Avion("null", "null", "null", Faker.generarFechaHoraLlegada(), Faker.generarFechaHoraSalida(Faker.generarFechaHoraLlegada()));

        Pasajero nuevoPasajero = new Pasajero("null", "null", " null", "null", 0, 0, false, 0);
        nuevoAvion.asignarAsientos(nuevoPasajero, 1, "A");

        Pasajero otroPasajero = new Pasajero("null", "null", " null", "null", 0, 0, false, 0);
        nuevoAvion.asignarAsientos(otroPasajero, 30, "F");

        System.out.println(nuevoAvion);
        System.out.println(nuevoAvion.mostrarPasajeros());
    }

}
