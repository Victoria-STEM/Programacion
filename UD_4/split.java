import java.util.ArrayList;

public class split {
    public static void main(String[] args) {

        ArrayList<String> arrayTexto = new ArrayList<>();
        String texto = "Hola  este es un mensaje  para   tontos.";

        for (int i = 0; i < texto.length(); i++) {

            String palabra = "";
            int contador = 0;
            
            while (texto.length() > 0) {
                palabra += texto.charAt(0);
                texto.replaceFirst("^.", "");
            }

            arrayTexto.add(palabra);
        }

        System.out.println(texto.length());
        // System.out.println(texto.charAt(0));
        System.out.println(arrayTexto);

    }
}
