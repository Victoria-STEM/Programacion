package UD_3.Relacion_0;

public class Ejercicio17 {
    
    public static String revertirCadena (String texto) {
        String[] caracteres = texto.split("");
        String textoInvertido = "";
        
        for (int i = caracteres.length - 1; 0 <= i; i--) {
            int indice = 0; 
            textoInvertido += caracteres[i];
            // System.out.println(caracteres[i]);
            indice ++;
        }
        // System.out.println(textoInvertido);
        return textoInvertido;
    }

    public static void main(String[] args) {
        String frase = "Eres un lerdo.";
        String fraseInversa = revertirCadena(frase);

        System.out.print(fraseInversa); 
    }
}
