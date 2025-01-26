
import java.util.ArrayList;

public class PT2_elfos_3 {

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
        boolean elfo1Vivo = true;
        boolean elfo2Vivo = true;
        boolean elfo3Vivo = true;

        int elfosMuertos = 0;
        int elfosVivos = 3;

        ArrayList<Integer> ruletaRusa = generarRuleta(numeroBalas);
        System.out.println("Camara del revolver: " + ruletaRusa);
        // System.out.println(ruletaRusa.get(turno - 1 ) == 0);

        while (elfosMuertos < 2) {

            if (elfo1Vivo == true && elfosMuertos < 3) {
                if (ruletaRusa.get(turno) == 0) {
                    System.out.println("El Elfo 1 ha sobrevivido.");
                    turno++;
                } else if (ruletaRusa.get(turno - 1) == 0) {
                    System.out.println("El Elfo 1 ha muerto.");
                    elfosMuertos++;
                    ruletaRusa = generarRuleta(numeroBalas);
                    System.out.println("Nueva recamara: " + ruletaRusa);
                    elfo1Vivo = false;
                    turno = 0;
                }
            }

            if (elfo2Vivo == true && elfosMuertos < 3) {
                if (ruletaRusa.get(turno) == 0) {
                    System.out.println("El Elfo 2 ha sobrevivido.");
                    turno++;
                } else if (ruletaRusa.get(turno - 1) == 0) {
                    System.out.println("El Elfo 2 ha muerto.");
                    elfosMuertos++;
                    ruletaRusa = generarRuleta(numeroBalas);
                    System.out.println("Nueva recamara: " + ruletaRusa);
                    elfo2Vivo = false;
                    turno = 0;
                }
            }

            if (elfo3Vivo == true && elfosMuertos < 3) {
                if (ruletaRusa.get(turno) == 0) {
                    System.out.println("El Elfo 3 ha sobrevivido.");
                    turno++;
                } else if (ruletaRusa.get(turno - 1) == 0) {
                    System.out.println("El Elfo 3 ha muerto.");
                    elfosMuertos++;
                    ruletaRusa = generarRuleta(numeroBalas);
                    System.out.println("Nueva recamara: " + ruletaRusa);
                    elfo3Vivo = false;
                    turno = 0;
                }
            }
            
            if (elfosMuertos > 1) {
                // System.out.println("Turno: " + turno);
                System.out.println("Queda: " + (3 - elfosMuertos) + " elfos vivos.");
            }

        }

        if (elfo1Vivo == true) {
            System.out.println("¡Felicidades! Elfo 1. Eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");
        } else if (elfo2Vivo == true) {
            System.out.println("¡Felicidades! Elfo 2. Eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");
        } else {
            System.out.println("¡Felicidades! Elfo 3. Eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");
        }

    }
}
