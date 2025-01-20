package UD_3.Relacion_0;

public class Ejercicio08 {

    public static int elMayor (int numero1, int numero2) {
        int mayor = numero2;

        if (numero1 > numero2) {
            mayor = numero1;
        } 

        return mayor;
    }

    public static void main(String[] args) {
        System.out.println("El mayor es: " + elMayor(6, 4));
    }
}
