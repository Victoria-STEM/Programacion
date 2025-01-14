package Relacion_04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        double cantidadLitrosInicial;
        double combustibleRestante;
        double precioPorLitro;
        double consumoLPor100Km;
        double precioPorViaje;
        double combustibleConsumido = 0.0;
        double kmViajes;
        int contadorViajes = 1;

        System.out.println("Introduce la cantidad de litros inicial: ");
        cantidadLitrosInicial = miScanner.nextDouble();

        combustibleRestante = cantidadLitrosInicial;

        System.out.println("Introduce el precio por litro de combustible:");
        precioPorLitro = miScanner.nextDouble();

        System.out.println("Introduce el consumo en litro por 100 km recorridos: ");
        consumoLPor100Km = miScanner.nextDouble();

        while (combustibleRestante > 0) {

            System.out.println("Introduce los Km del viaje " + contadorViajes + " :");
            kmViajes = miScanner.nextDouble();

            combustibleConsumido = consumoLPor100Km * kmViajes / 100;
            combustibleRestante = cantidadLitrosInicial - combustibleConsumido;

            if (combustibleRestante < combustibleConsumido) {
                System.out.println("Combustible insuficiente.");

            } else {
                precioPorViaje = combustibleConsumido * precioPorLitro;

                System.out.println("Precio del viaje: " + precioPorViaje);
                System.out.println("Combustible restante: " + combustibleRestante);

                contadorViajes++;
            }
        }
        miScanner.close();
    }
}
