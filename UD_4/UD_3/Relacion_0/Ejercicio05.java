package UD_3.Relacion_0;

public class Ejercicio05 {

    public static int calcularFactorial(int numero) {

        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int resultadoFactorial = calcularFactorial(10);
        System.out.println("El factorial es: " + resultadoFactorial);
    }

}
