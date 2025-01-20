package UD_3.Relacion_0;

public class Ejercicio20 {
    
    public static String[] convertirStringEnPalabras (String frase) {
        String[] fraseArray = frase.split(" ");
        return fraseArray;
    }

    public static Integer contarPalabrasEnFrase (String[] arrayFrase) {
        return arrayFrase.length; 
    }

    public static void main(String[] args) {

        String frase = "Menudo toston, quiero acabar ya.";
        String[] fraseArray = convertirStringEnPalabras(frase);
        int cantidadPalabras = contarPalabrasEnFrase(fraseArray);
        
        System.out.println(cantidadPalabras);

    }
}
