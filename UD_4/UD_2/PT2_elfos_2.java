
import java.util.ArrayList;

public class PT2_elfos_2 {

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

    public static ArrayList<Boolean> generarElfos (int numeroElfos) {

        ArrayList<Boolean> elfosVivos = new ArrayList<>();

        for (int i = 0; i < numeroElfos; i++) {
            elfosVivos.add(true);
        }

        return elfosVivos;
    }
    public static void main(String[] args) {

        int numeroBalas = 6;
        int turno = 0;
        int numeroElfos = 3;
        int elfosMuertos = 0;
        int disparo = 0;

        ArrayList<Boolean> elfosVivos = generarElfos(numeroElfos);
        System.out.println("Elfos vivos: " + elfosVivos);

        ArrayList<Integer> ruletaRusa = generarRuleta(numeroBalas);
        System.out.println("Camara del revolver: " + ruletaRusa);

        while (elfosMuertos < 2) {

            if (elfosVivos.get(turno) == true) {

                if (ruletaRusa.get(disparo) == 0) {
                    // System.out.println("Turno: " + turno);
                    System.out.println("Elfo " + (turno + 1) + " dispara y sobrevive.");
                    turno++;
                    disparo++;
                }

                else {
                    System.out.println("Elfo " + (turno + 1) + " dispara y MUERE.");
                    elfosVivos.set(turno, false); // un elfo muere
                    elfosMuertos++;
                    disparo ++;

                    turno = 0; // empezamos desde 0

                    if (elfosMuertos < 2) {
                        ruletaRusa = generarRuleta(numeroBalas);
                        System.out.println("¡Revolver recargado! " + ruletaRusa);
                        // System.out.println("Turno: " + turno);
                        disparo = 0;
                    }

                }

                // disparo ++;

            }

            else {
                System.out.println("Elfos muertos no puede jugar con los vivos.");
                turno++;
            }

            if (turno >= numeroElfos) {
                // System.out.println("Turno: " + turno);
                turno = 0;
            }

            if (disparo >= numeroBalas) {
                // System.out.println("Disparo numero: " + disparo);
                disparo = 0;
            }

        }

        for (int i = 0; i < elfosVivos.size(); i++) {
            if (elfosVivos.get(i) == true) {
                System.out.println("¡Felicidades! Elfo " + (i + 1) + " eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");
            }
        }

    }
}
