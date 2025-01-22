
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
        int turno = 1;
        
        int elfosMuertos = 0;
        int elfosVivos = 3;

        ArrayList<Integer> ruletaRusa = generarRuleta(numeroBalas);
        System.out.println("Camara del revolver: " + ruletaRusa);
        System.out.println(ruletaRusa.get(turno - 1 ) == 0);
        System.out.println(ruletaRusa.get(turno - 1 ) == 1);

        // while (elfosMuertos < elfosVivos) {

        //     if (ruletaRusa.get(turno - 1) == 0) {

        //         System.out.println("El Elfo " + turno + " ha sobrevivido.");
        //     } 
            
        //     else if (ruletaRusa.get(turno - 1) == 1) {

        //         System.out.println("El Elfo " + turno + " cae al suelo mientras su gorro rojo queda empapado en carmesí.");
        //         System.out.println("Cámara reiniciada.");
        //         ruletaRusa = generarRuleta(numeroBalas);
        //         System.out.println("Nueva camara del revolver: " + ruletaRusa);

        //         elfosMuertos++;

        //     }

        //     // Se organizan los turnos de los elfos:
        //     if (elfosMuertos == 0) {

        //         if (turno == 1) {
        //             turno = 2;
        //         } else if (turno == 2) {
        //             turno = 3;
        //         } else {
        //             turno = 1;
        //         }

        //     }

        //     else if (elfosMuertos == 1) {

        //         if (turno == 1) {
        //             turno = 2;
        //         } 
        //         else if (turno == 2) {
        //             turno = 1;
        //         }
        //         else {
        //             turno = 1;
        //         }

        //     }

        //     System.out.println("ELfos vivos: " + (elfosVivos - elfosMuertos));

        // }

        System.out.println("¡Felicidades! Elfo " + (turno + 1) + ". Eres el líder del taller, pero cada risa de Santa te recordará lo que has hecho.");

    }
}
