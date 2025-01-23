
import java.util.ArrayList;

public class PT2_2 {

    public static ArrayList<Integer> generarRuleta(int numeroBalas) {

        ArrayList<Integer> ruletaRusa = new ArrayList<>();
        int vacio = 0;
        int bala = 1;

        // creacion de la pistola:
        for (int i = 0; i < numeroBalas; i++) {
            ruletaRusa.add(vacio);
        }

        // introduccion de la bala en una posicion aleatoria:
        ruletaRusa.set((int) (Math.random() * numeroBalas), bala);

        return ruletaRusa;
    }

    public static void main(String[] args) {

        int numeroBalas = 6;
        int turno = 0;
        int numeroELfos = 3;
        int elfosMuertos = 0;

        ArrayList<Boolean> elfosVivos = new ArrayList<>();
        for (int i = 0; i < numeroELfos; i++) {
            elfosVivos.add(true);
        }
        System.out.println(elfosVivos);

        ArrayList<Integer> ruletaRusa = generarRuleta(numeroBalas);
        System.out.println("Camara del revolver: " + ruletaRusa);

        while (elfosMuertos < 2) {

            if (ruletaRusa.get(turno) == 0) {
                System.out.println("EL elfo " + (turno + 1) + " sigue vivo.");

            } else if (ruletaRusa.get(turno) == 1) {
                System.out.println("El elfo " + (turno + 1) + " ha muerto");
                elfosVivos.set(turno, false);

                elfosMuertos++;
                ruletaRusa = generarRuleta(numeroBalas);
                System.out.println("La pisto se carga: " + ruletaRusa);
            }

            turno ++;

            if (turno > 2) {
                turno = 0;
            }

        }

    }

    // System.out.println("¡Felicidades! Elfo " + (turno + 1) + ". Eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");
}
