package UD3.Relacion00;

public class Ejercicio01 {

    public static String imprimirSaludo(String nombre) {
        String saludo = "Hola, " + nombre + " ¿cómo estás? :)";
        return saludo;
    }

    public static void main(String[] args) {
        String saludoPersonalizado = imprimirSaludo("Jose Luis");
        System.out.println(saludoPersonalizado);
    }
}
