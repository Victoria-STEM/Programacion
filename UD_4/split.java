import java.util.ArrayList;

public class split {

    public static char[] creacionAbecesario() {

        // Creacion de abecedario
        char[] abecedario = new char[52];

        int index = 0;

        // Agregar letras mayúsculas (A-Z)
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            abecedario[index++] = letra;
        }

        // Agregar letras minúsculas (a-z)
        for (char letra = 'a'; letra <= 'z'; letra++) {
            abecedario[index++] = letra;
        }

        return abecedario;
    }

    public static boolean comprobarSiEsLetra(char letra, char[] abecedario) {

        boolean esta = false;

        for (int i = 0; i < abecedario.length; i++) {

            if (letra == abecedario[i]) {
                esta = true;
            }
        }

        return esta;
    }

    public static ArrayList<String> convertirEnArrayDePalabras(String mensaje) {

        ArrayList<String> arrayPalabras = new ArrayList<>();
        String cadenaTexto = "";

        char[] abecedario = creacionAbecesario();

        while (mensaje.length() > 0) {

            cadenaTexto = "";

            while (comprobarSiEsLetra(mensaje.charAt(0), abecedario)) {

                cadenaTexto += mensaje.charAt(0); // anado la letra a la cadenaTexto
                mensaje = mensaje.substring(1);
            }

            // Solo introducimos palabras, omitimos espacios ""
            if (cadenaTexto != "") {
                arrayPalabras.add(cadenaTexto);
            }

            // Si no está en el abecedario eliminamos el char
            if (!comprobarSiEsLetra(mensaje.charAt(0), abecedario)) {

                mensaje = mensaje.substring(1);

            }

        }

        return arrayPalabras;

    }

    // SPLIT
    public static boolean comprobarSiEsElemento(char letra, char elemento) {

        boolean esta = false;

        if (letra == elemento) {
            esta = true;
        }

        return esta;
    }

    public static ArrayList<String> splitT(String mensaje, char elemento) {

        ArrayList<String> arrayPalabras = new ArrayList<>();
        String palabra = "";

        while (mensaje.length() > 0) {

            palabra = "";

            while (mensaje.length() > 0 && !comprobarSiEsElemento(mensaje.charAt(0), elemento)) {   
                    palabra += mensaje.charAt(0); // anado la letra a la palabra
                    mensaje = mensaje.substring(1);
            }

            // Solo introducimos palabras, omitimos espacios ""
            if (palabra != "") {
                arrayPalabras.add(palabra);
            }

            // Si no está en el abecedario eliminamos el char
            if (mensaje.length() > 0 && comprobarSiEsElemento(mensaje.charAt(0), elemento)) {
                mensaje = mensaje.substring(1);
            }

        }

        return arrayPalabras;

    }

    public static void main(String[] args) {

        String mensaje = "Hola  que tal    como estas?";
        String mensaje2 = "Hela que!";

        // Texto en array de palabras
        ArrayList arrayPalabras = convertirEnArrayDePalabras(mensaje);

        System.out.println("Despues del for: " + mensaje);
        System.out.println("Despues del for: " + arrayPalabras);

        // Texto dividido según elemento
        ArrayList arrayPalabras2 = splitT(mensaje2, 'e');

        System.out.println("Despues del for: " + mensaje2);
        System.out.println("Despues del for: " + arrayPalabras2);

    }
}
