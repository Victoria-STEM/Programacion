package UD_3.Relacion_0;

public class Ejercicio09 {
    public static int menorDeTres (int numero1, int numero2, int numero3) {
        int menor = numero1;

        if ((numero2 < numero1) && (numero2 < numero3)) {
            menor = numero2;
        } else if ((numero3 < numero1) && (numero3 < numero2)) {
            menor = numero3;
        }

        return menor;
    }

    public static void main(String[] args) {
        System.out.println("El menor es: " + menorDeTres(40, 20, 8));
    }
}
