
import java.util.ArrayList;
import java.util.Scanner;

public class PT2_1 {

    public static int numeroDientes = 10;
    public static int dientesEnfermos = 5;

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        ArrayList<Integer> invisible = new ArrayList();
        for (int i = 0; i < numeroDientes; i++) {
            invisible.add(0);
        }

        int dientesColocados = 0;
        int dienteAleatorio;
        int indiceAleatorio;

        // Creacion de dientes danados aleatorios
        while (dientesColocados < dientesEnfermos) {

            dienteAleatorio = (int) (Math.random() * 2);
            indiceAleatorio = (int) (Math.random() * numeroDientes);

            if (invisible.get(indiceAleatorio) == 0) {
                dientesColocados++;
                invisible.set(indiceAleatorio, dienteAleatorio);
            }

        }

        System.out.println(invisible);

        ArrayList<Character> visible = new ArrayList();
        for (int i = 0; i < numeroDientes; i++) {
            visible.add('W');
        }
        System.out.println(visible);

        boolean juego = true;
        int turno = 1;
        int seleccion;

        while (juego == true) {

            System.out.println("Jugador " + turno + " escoge un diente:");
            seleccion = miScanner.nextInt();

            if (visible.get(seleccion).equals('W')) {

                if (invisible.get(seleccion) == 0) {
                    System.out.println("Diente sano!");
                    visible.set(seleccion, 'U');
                    System.out.println(visible);

                } else if (invisible.get(seleccion) == 1) {
                    System.out.println("Diente podrido! Jugador " + turno + " pierde!");
                    visible.set(seleccion, 'X');
                    System.out.println(visible);
                    juego = false;
                }

                if (turno == 1) {
                    turno = 2;
                    
                } else {
                    turno = 1;
                }
            }

            else {
                System.out.println("Ya has seleccionado esta opcion.");
            }
        }
    }
}
