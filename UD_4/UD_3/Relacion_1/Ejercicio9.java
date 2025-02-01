package UD_4.UD_3.Relacion_1;

public class Ejercicio9 {

    public static char[] generarCaracteres () {

        char[] caracteres = new char[36];

        // Agregar números del 0 al 9
        for (int i = 0; i < 10; i++) {
            caracteres[i] = (char) ('0' + i);
        }

        // Agregar letras de la a a la z
        for (int i = 0; i < 26; i++) {
            caracteres[i + 10] = (char) ('a' + i);
        }

        return caracteres;
    }

    public static String generarContrasena (int longitud) {

        char[] caracteres = generarCaracteres();
        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            contrasena += caracteres[(int) (Math.random() * caracteres.length)];
        }

        return contrasena;
    }
    
    public static void main(String[] args) {
        
        // Escribe una función generarContraseña que reciba un número longitud 
        // y devuelva una cadena de caracteres aleatorios (formada por letras y números) de esa longitud. 
        // Por ejemplo, si longitud es 8, podría devolver algo como a7b3f2d8. 
        // Puedes usar un array de letras y números para ir eligiendo de forma aleatoria.

        String contrasena = generarContrasena(8);
        System.out.println("Contrasena: " + contrasena);

    }
}
