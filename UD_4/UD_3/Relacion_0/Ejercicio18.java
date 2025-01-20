package UD_3.Relacion_0;

public class Ejercicio18 {

    public static Integer contarVocales(String texto) {
        int numeroVocales = 0;
        String[] caracteres = texto.split("");

        for (int i = 0; i < texto.length(); i++) {
            if (caracteres[i] == "a") {
                numeroVocales++;
            }
            System.out.println(caracteres[i]);
        }

        return numeroVocales;
    }

    public static void main(String[] args) {
        String frase = "Esto esa";
        int numeroVocales = contarVocales(frase);
        System.out.println(numeroVocales);
    }

}
