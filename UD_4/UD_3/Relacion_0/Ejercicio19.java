package UD_3.Relacion_0;

public class Ejercicio19 {
    
    public static String[] convertirPalabraAStringChar (String palabra) {
        String[] palabraArray = palabra.split("");
        return palabraArray;
    }

    public static String convertirPrimeraLetaMayuscula (String[] palabraArray) {
        String primeraLetra = palabraArray[0].toUpperCase();
        return primeraLetra;
    }

    public static String unificar (String primeraLetra, String[] palabraArray) {
        String resultadoUnificado = primeraLetra;
        for (int i = 1; i < palabraArray.length; i++) {
            resultadoUnificado += palabraArray[i];
        }
        return resultadoUnificado;
    }

    public static void main(String[] args) {
        String palabra = "hola";
        
        String[] palabraArray = convertirPalabraAStringChar(palabra);
        String primeraLetra = convertirPrimeraLetaMayuscula(palabraArray);
        String resultado = unificar(primeraLetra, palabraArray);
        System.out.println(resultado);

    }
}
