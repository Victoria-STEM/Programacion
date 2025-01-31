package Relacion_2;

public class Ejercicio01 {

    public static String unirNombreApellido (String nombre, String apellido, Integer numeroLetras) {
        String nombreUsuario = "";

        for (int i = 0; i < numeroLetras; i++) {
            nombreUsuario += nombre.charAt(i);
        }

        for (int i = 0; i < numeroLetras; i++) {
            nombreUsuario += apellido.charAt(i);
        }

        return nombreUsuario.toLowerCase();
    }

    public static void main(String[] args) {
        
        String nombreUsuario = unirNombreApellido("Alejandro", "Moreno", 3);
        System.out.println(nombreUsuario);

    }
}

