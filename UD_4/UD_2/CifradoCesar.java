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
            System.out.println("Menu:\r\n" + //
                    "1. Cifrar mensaje\r\n" + //
                    "2. Descifrar mensaje\r\n" + //
                    "3. Salir");

            menu = miScanner.nextInt();
            miScanner.nextLine();

            if (menu == 1) {
                System.out.println("Ingresa el mensaje a cifrar: ");
                mensaje = miScanner.next().toUpperCase();
                // System.out.println(mensaje)

                for (int i = 0; i < mensaje.length(); i++) {
                    System.out.println(mensaje.charAt(i));
                    System.out.println(alfabetoDesplazado.get(i));
                    
                    for (int j = 0; j < alfabeto.size(); j++) {

                        if (mensaje.charAt(i) == alfabeto.get(j)) {
                            mensajeCifrado += alfabetoDesplazado.get(j);
                        }
                    }       
                }

                System.out.println("Mensaje cifrado: " + mensajeCifrado);
                mensaje = ""; // limpio mensaje 
                mensajeCifrado = ""; // limpio mensaje cifrado
            }

            else if (menu == 2) {
                System.out.println("Ingresa el mensaje a descifrar: ");
                mensajeADescifrar = miScanner.next().toUpperCase();

                for (int i = 0; i < mensajeADescifrar.length(); i++) {
                    for (int j = 0; j < alfabetoDesplazado.size(); j++) {

                        if (mensajeADescifrar.charAt(i) == alfabetoDesplazado.get(j)) {
                            mensajeDescifrado += alfabeto.get(i);
                        }
                    }       
                }

                System.out.println("Mensaje descifrado: " + mensajeDescifrado);

                mensajeADescifrar = ""; // limpio mensaje cifrado
                mensajeDescifrado = ""; // limpio mensaje 
            }
        }

        miScanner.close();

    }

    // // Función que debes implementar
    public static ArrayList<Character> generarAlfabetoDesplazado(ArrayList<Character> alfabetoOriginal,
            int desplazamiento) {

        // Esta función debe devolver un nuevo ArrayList con el alfabeto desplazado.

        ArrayList<Character> alfabetoDesplazado = new ArrayList<>();

        // Relleno el array con el abecedario original
        for (char c = 'A'; c <= 'Z'; c++) {
            alfabetoDesplazado.add(c);
        }

        // Desplazo desde la tercera posicion
        for (int i = 0; i < alfabetoOriginal.size() - desplazamiento; i++) {
            int indice = i + desplazamiento;
            alfabetoDesplazado.remove(indice);
            alfabetoDesplazado.add(indice, alfabetoOriginal.get(i));

        }

        // Relleno los 3 primeros numero con los 3 ultimos (X, Y, Z):
        for (int i = 0; i < 3; i++) {
            int indice = alfabetoOriginal.size() - desplazamiento;
            alfabetoDesplazado.set(i, alfabetoOriginal.get(indice));
            desplazamiento--;
        }

        return alfabetoDesplazado;
    }
}