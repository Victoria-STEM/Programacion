package Relacion_2;

import java.util.ArrayList;

public class Ejercicio06 {
    
    public static ArrayList<String> emparejarGente (ArrayList<String> gente) {

        ArrayList<String> parejas = new ArrayList<>();
        int indice = 0;

        while (parejas.size() < gente.size()) {

            indice = (int) (Math.random() * (gente.size() - 1)) + 1;

            if (!buscarEnArray(parejas, gente.get(indice))) {
                parejas.add(gente.get(indice));
            }

        }

        return parejas;
    }

    public static Boolean buscarEnArray (ArrayList<String> array, String elemento) {
        boolean esta = false;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(elemento)) {
                esta = true;
            }
        }

        return esta;
    }

    public static void main(String[] args) {
        
        // Crea una función que reciba una lista de nombres y genere emparejamientos aleatorios para un amigo invisible. 
        // Asegúrate de que nadie se asigne a sí mismo. La lista debe tener un número par de amigos. Investiga el uso de splice().

        ArrayList<String> gente = new ArrayList<>();
        gente.add("juan");
        gente.add("marco");
        gente.add("herme");
        gente.add("manue");
        gente.add("santo");
        gente.add("carioca");

        System.out.println(buscarEnArray(gente, "gorge"));
        System.out.println(emparejarGente(gente));


    }
}
