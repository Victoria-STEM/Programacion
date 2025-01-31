package Relacion_2;

import java.util.ArrayList;

public class Ejercicio05 {

    public static Integer contarPalabrasClave (String[] frase, ArrayList palabrasClave) {
        int numeroVeces = 0;

        for (int i = 0; i < palabrasClave.size(); i++) {

            for (int j = 0; j < frase.length; j++) {

                if (palabrasClave.get(i).equals(frase[j])) {
                    numeroVeces++;
                }                
            }
        }

        return numeroVeces;
    }

    public static void main(String[] args) {

        // Escribe una función que reciba un texto y una lista de palabras clave. 
        // Devuelve cuántas palabras clave están presentes en el texto. 
        // Investiga el uso de split() y convierte todo a minúsculas con toLowerCase().

        String texto = "Hola soy la mas mejor del mundo y mola .";
        String[] textoDividido = texto.split(" ");
        
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("mundo");
        palabras.add("mola");

        System.out.println(palabras);
        System.out.println(contarPalabrasClave(textoDividido, palabras));

    }
}
