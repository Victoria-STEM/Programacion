package Repaso;

import java.util.Scanner;

public class PT1_2 {

    public static void main(String[] args) {

        int area = 1;
        double consumoMensualTotal = 0;
        double costoMensualTotal = 0;
        double consumoDiario = 1;
        double sumaConsumosDiarios = 0;
        boolean programa = true;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Número de áreas a regar:");
        double numeroAreas = miScanner.nextDouble();

        System.out.println("Introduce el consumo de agua máximo permitido por día (en litros):");
        double consumoMaximoDiarioLitros = miScanner.nextDouble();

        System.out.println("Introduce el costo del agua por metro cúbico (m³):");
        double costeMetro3 = miScanner.nextDouble();

        while (area <= numeroAreas && programa == true) {

            System.out.println("El tamaño del área en metros cuadrados (m²): ");
            double tamanoArea = miScanner.nextDouble();

            System.out.println("El consumo de agua por metro cuadrado al día (en litros/m²):");
            double consumoM2 = miScanner.nextDouble();

            // Calculos del consumo:
            consumoDiario = tamanoArea * consumoM2;
            sumaConsumosDiarios += consumoDiario;
            System.out.println(sumaConsumosDiarios);

            if (sumaConsumosDiarios > consumoMaximoDiarioLitros) {
                System.out.println("¡Alerta! El consumo diario de agua supera el límite permitido de " + consumoMaximoDiarioLitros + " l/día.");
                programa = false;

            } else {

                System.out.println("El número de días por mes que se realiza el riego:");
                double dias = miScanner.nextDouble();

                double consumoMensualLitros = consumoDiario * dias;
                double consumoMensualM3 = consumoMensualLitros / 1000;

                double costoMensualArea = costeMetro3 * consumoMensualM3;

                costoMensualTotal += costoMensualArea;
                consumoMensualTotal += consumoMensualM3;

                area++;
            }

        }

        if (sumaConsumosDiarios < consumoMaximoDiarioLitros) {
            System.out.println("Consumo mensual total: " + consumoMensualTotal);
            System.out.println("Costo mensual total: " + costoMensualTotal + " €.");
        }
    }
}
