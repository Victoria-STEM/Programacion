package UD_3.Relacion_0;

public class Ejercicio19 {
    
    // public static String[] convertirPalabraAStringChar (String palabra) {
    //     String[] palabraArray = palabra.split("");
    //     return palabraArray;
    // }

    public static char convertirPrimeraLetaMayuscula (String palabraArray) {
        char primeraLetra = palabraArray.toUpperCase().charAt(0);
        return primeraLetra;
    }

    public static String unificar (char primeraLetra, String palabraArray) {
        //String resultadoUnificado = ""+primeraLetra;

        String resultadoUnificado = "";
        resultadoUnificado += primeraLetra;

        for (int i = 1; i < palabraArray.length(); i++) {
            resultadoUnificado += palabraArray.charAt(i);
        }
        return resultadoUnificado;
    }

    public static void main(String[] args) {
        String palabra = "hola caracola";
        
        char primeraLetra = convertirPrimeraLetaMayuscula(palabra);
        String resultado = unificar(primeraLetra, palabra);
        System.out.println(resultado);

    }
}
