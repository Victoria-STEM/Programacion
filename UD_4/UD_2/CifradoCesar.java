
import java.util.ArrayList;
import java.util.Scanner;

public class CifradoCesar {

    public static final int DESPLAZAMIENTO = 3; // Número de posiciones de desplazamiento

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in); // Declaracion del scanner.

        ArrayList<Character> alfabeto = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alfabeto.add(c);
        }

        // Aquí deberás llamar a tu función para generar el alfabeto desplazado
        ArrayList<Character> alfabetoDesplazado = generarAlfabetoDesplazado(alfabeto, DESPLAZAMIENTO);

        // Ejemplo de impresión
        System.out.println("Alfabeto original: " + alfabeto);
        System.out.println("Alfabeto desplazado: " + alfabetoDesplazado);

        int menu = 0;
        String mensaje = "";
        String mensajeCifrado = "";
        String mensajeADescifrar = "";
        String mensajeDescifrado = "";

        while (menu != 3) {

            // Menu:
            System.out.println("Menu:\r\n"
                    + //
                    "1. Cifrar mensaje\r\n"
                    + //
                    "2. Descifrar mensaje\r\n"
                    + //
                    "3. Salir");

            menu = miScanner.nextInt();
            miScanner.nextLine();

            if (menu == 1) {

                System.out.println("Ingresa el mensaje a cifrar: ");
                mensaje = miScanner.next().toUpperCase();

                mensajeCifrado = desencriptar(mensaje, alfabeto, alfabetoDesplazado);
                System.out.println("Mensaje cifrado: " + mensajeCifrado);
 
                mensajeCifrado = ""; // limpio mensaje cifrado

            } else if (menu == 2) {

                System.out.println("Ingresa el mensaje a descifrar: ");
                mensajeADescifrar = miScanner.next().toUpperCase();

                mensajeDescifrado = encriptar (mensajeADescifrar, alfabeto, alfabetoDesplazado);
                System.out.println("Mensaje descifrado: " + mensajeDescifrado);

                mensajeDescifrado = ""; // limpio mensaje 
            }
        }

        miScanner.close();

    }

    // Función que debes implementar
    public static ArrayList<Character> generarAlfabetoDesplazado(ArrayList<Character> alfabetoOriginal,
            int desplazamiento) {

        // Esta función debe devolver un nuevo ArrayList con el alfabeto desplazado.
        ArrayList<Character> alfabetoDesplazado = new ArrayList<>();
        
        System.out.println(alfabetoOriginal.size());

        int indice = 0;

        for (int i = 0; i < alfabetoOriginal.size(); i++) {

            if (i < alfabetoOriginal.size() - desplazamiento) {
                alfabetoDesplazado.add(i, alfabetoOriginal.get(desplazamiento + i));
            }

            else {
                alfabetoDesplazado.addLast(alfabetoOriginal.get(indice));
                indice ++;
            }

        }

        return alfabetoDesplazado;

    }

    public static String desencriptar(String mensaje, ArrayList<Character> alfabeto, ArrayList<Character> alfabetoDesplazado) {

        String mensajeCifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            System.out.println(mensaje.charAt(i));
            System.out.println(alfabetoDesplazado.get(i));

            for (int j = 0; j < alfabeto.size(); j++) {

                if (mensaje.charAt(i) == alfabeto.get(j)) {
                    mensajeCifrado += alfabetoDesplazado.get(j);
                }
            }
        }

        return mensajeCifrado;
    }

    public static String encriptar(String mensaje, ArrayList<Character> alfabeto, ArrayList<Character> alfabetoDesplazado) {
        
        String mensajeDescifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            for (int j = 0; j < alfabetoDesplazado.size(); j++) {

                if (mensaje.charAt(i) == alfabetoDesplazado.get(j)) {
                    mensajeDescifrado += alfabeto.get(j);
                }
            }
        }

        return mensajeDescifrado;

    }

}
