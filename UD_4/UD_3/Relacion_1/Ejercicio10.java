package Relacion_1;

public class Ejercicio10 {

    public static String sacarCartaAleatoria () {
        String carta;

        String [] palos = {"corazones", "diamantes", "tréboles", "picas"};
        String [] numero = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

        carta = palos[(int) (Math.random() * palos.length)] + " " + numero[(int) (Math.random() * numero.length)];

        return carta;
    }

    public static void main(String[] args) {

        // Escribe una función cartaAleatoria que devuelva una carta aleatoria de una baraja 
        // (con un número del 1 al 13, que representaría el valor, 
        // y uno de los cuatro palos: corazones, diamantes, tréboles o picas).

        System.out.println(sacarCartaAleatoria());
    }
}