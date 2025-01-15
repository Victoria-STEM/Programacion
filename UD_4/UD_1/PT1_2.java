package UD_1;

import java.util.Scanner;

public class PT1_2 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroAreas;
        int consumoMaximoAguaAlDia;
        double precioAguaM3;
        int tamanoArea;
        int area = 1;
        double consumo;
        int numeroDias;
        double consumoDiario;
        double consumoMensual;
        double consumoMensualm3;
        double costoMensual;
        double costoMensualTotal = 0;
        double consumoMensualTotalm3 = 0;

        System.out.println("Introduce el numero de areas a regar:");
        numeroAreas = miScanner.nextInt();

        System.out.println("Introduce el consumo de agua maximo permitido al día:");
        consumoMaximoAguaAlDia = miScanner.nextInt();

        System.out.println("Introduce el coste del agua por metro cúbico:");
        precioAguaM3 = miScanner.nextDouble();

        while (numeroAreas >= area) {

            System.out.println("Introduce el tamano del area " + area + " (m2):");
            tamanoArea = miScanner.nextInt();

            System.out.println("Introduce el consumo por m2 para el " + area + " (en l/m2): ");
            consumo = miScanner.nextDouble();

            consumoDiario = tamanoArea * consumo;

            if (consumoDiario > consumoMaximoAguaAlDia) {
                System.out.println("¡Alerta! El consumo diario de agua supera el límite permitido de " + consumoMaximoAguaAlDia + " l/día.");
            } else {
                System.out.println("Introduce el numero de dias de riego al mes para el area " + area + " :");
                numeroDias = miScanner.nextInt();

                consumoMensual = consumoDiario * numeroDias;
                consumoMensualm3 = consumoMensual / 1000;
                area++;

                costoMensual = consumoMensualm3 * precioAguaM3;
                costoMensualTotal += costoMensual;
                consumoMensualTotalm3 += consumoMensualm3;
            }
        }

        System.out.println("Consumo mensual total: " + consumoMensualTotalm3 + " m3");
        System.out.println("Consumo mensual total: " + costoMensualTotal + " €");

        miScanner.close();
    }
}
