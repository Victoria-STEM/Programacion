
import java.util.ArrayList;
import java.util.Scanner;

public class PT2_3 {

    public static final int DESPLAZAMIENTO = 3; // Número de posiciones de desplazamiento

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);

        boolean programa = true;
        String mensajeCifrado = "";
        String mensajeDescifrado = "";
        String mensaje = "";

        ArrayList<Character> alfabeto = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alfabeto.add(c);
        }

        // Aquí deberás llamar a tu función para generar el alfabeto desplazado
        ArrayList<Character> alfabetoDesplazado = generarAlfabetoDesplazado(alfabeto, DESPLAZAMIENTO);

        // Ejemplo de impresión
        System.out.println("Alfabeto original: " + alfabeto);
        System.out.println("Alfabeto desplazado: " + alfabetoDesplazado);

        while (programa == true) {

            System.out.println("Menú:\r\n"
                    + //
                    "1. Cifrar mensaje\r\n"
                    + //
                    "2. Descifrar mensaje\r\n"
                    + //
                    "3. Salir");

            int opcionUsuario = miScanner.nextInt();

            if (opcionUsuario == 1) {
                System.out.println("Introduce el mensaje a cifrar: ");
                mensaje = scannerTexto.next().toUpperCase();

                mensajeCifrado = cifrandoMensaje(mensaje, alfabetoDesplazado, alfabeto);
                System.out.println("Mensaje cifrado: " + mensajeCifrado);

            } else if (opcionUsuario == 2) {
                System.out.println("Introduce el mensaje a descifrar: ");
                mensaje = scannerTexto.next().toUpperCase();

                mensajeDescifrado = descifrandoMensaje(mensaje, alfabetoDesplazado, alfabeto);
                System.out.println("Mensaje cifrado: " + mensajeDescifrado);

            } else if (opcionUsuario == 3) {
                System.out.println("Fin del programa.");
                programa = false;
            } else {
                System.out.println("Opcion incorrecta.");
            }

        }
    }

    // Función que debes implementar
    public static ArrayList<Character> generarAlfabetoDesplazado(ArrayList<Character> alfabetoOriginal, int desplazamiento) {
        // Esta función debe devolver un nuevo ArrayList con el alfabeto desplazado.
        ArrayList<Character> alfabetoDesplazado = new ArrayList<>();

        for (int i = 0; i < alfabetoOriginal.size(); i++) {
            alfabetoDesplazado.add(alfabetoOriginal.get((i + desplazamiento) % alfabetoOriginal.size()));
        }

        return alfabetoDesplazado;
    }

    public static String cifrandoMensaje(String mensaje, ArrayList<Character> alfabetoDesplazado, ArrayList<Character> alfabetoOriginal) {
        String mensajeCifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {

            for (int j = 0; j < alfabetoOriginal.size(); j++) {

                if (mensaje.charAt(i) == alfabetoOriginal.get(j)) {
                    mensajeCifrado += alfabetoDesplazado.get(j);
                }
            }

        }

        return mensajeCifrado;
    }

    public static String descifrandoMensaje(String mensaje, ArrayList<Character> alfabetoDesplazado, ArrayList<Character> alfabetoOriginal) {
        String mensajeDescifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {

            for (int j = 0; j < alfabetoDesplazado.size(); j++) {

                if (mensaje.charAt(i) == alfabetoDesplazado.get(j)) {
                    mensajeDescifrado += alfabetoOriginal.get(j);
                }
            }

        }

        return mensajeDescifrado;
    }
}
