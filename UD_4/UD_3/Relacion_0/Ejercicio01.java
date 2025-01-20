package UD_3.Relacion_0;

public class Ejercicio01 {

    public static String generarSaludo (String nombre) {
        String saludo = "Hola, " + nombre + ".";
        return saludo;
    }

    public static void imprimirSaludo (String nombre) {
        System.out.println("Hola, " + nombre + ".");
    }

    public static void main(String[] args) {
        String saludoPersonalizado = generarSaludo("Manolo");
        System.out.println(saludoPersonalizado);

        imprimirSaludo("Victoria");
    }
}
