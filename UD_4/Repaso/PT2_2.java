package Repaso;

import java.util.ArrayList;
import java.util.Arrays;

public class PT2_2 {

    public static Integer numeroTiros = 6;
    public static Integer tiro = 0;
    public static Integer bala = 1;

    public static ArrayList<Integer> generarRevolver() {
        ArrayList<Integer> revolver = new ArrayList();

        for (int i = 0; i < numeroTiros; i++) {
            revolver.add(tiro);
        }

        int posicionAleatoria = (int) (Math.random() * 6);
        revolver.set(posicionAleatoria, bala);

        return revolver;
    }

    public static void main(String[] args) {

        ArrayList<Integer> revolver = generarRevolver();
        System.out.println(revolver);

        int turno = 1;
        int elfosTotales = 3;
        int elfosMuertos = 0;
        int disparo = 0;
        int elfo = 0;
        boolean[] elfos = {true, true, true};

        while (elfosMuertos < (elfosTotales - 1)) {

            if (elfos[elfo] == true) {

                if (revolver.get(disparo) == 0) {
                    System.out.println("El elfo " + turno + " sobrevive un dia mas.");
                    disparo++;

                } else {
                    System.out.println("El elfo " + turno + " muere.");
                    elfos[(elfo)] = false;
                    System.out.println("Elfos: " + Arrays.toString(elfos));

                    elfosMuertos++;

                    disparo = 0; // Reseteamos los disparos.

                    if (elfosMuertos < (elfosTotales - 1)) {
                        revolver = generarRevolver();
                        System.out.println("Volvemos a cargar el revolver:");
                        System.out.println(revolver);
                    }
                }
            } 
            // else if (elfos[elfo] == false) {
            //     System.out.println("Los elfos muertos no pueden jugar con los vivos.");
            // }

            turno++;
            elfo++;

            // Reseteamos los disparos
            if (disparo == numeroTiros) {
                disparo = 0;
            }

            // Reseteamos los turnos
            if (turno == (elfosTotales + 1)) {
                turno = 1;
            }

            // Reseteamos los elfos
            if (elfo == elfosTotales) {
                elfo = 0;
            }

        }

        System.out.println("Felicidades elfo " + turno + ", has sobrevivido a tus hermanos. Cada risa de Santa te recordará lo que has hecho.");
    
    }
}
