package UD_1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int numeroElectrodomesticos;
        double precioPorkWh;
        double potenciaTotalContratada;
        int numeroElectrodomestico = 1;
        double horasDiarias;
        double costeTotalMensual;
        double potenciaElectrodomestivo;
        double consumoTotalMensual = 0;

        System.out.println("Introduce el numero de electrodomesticos a registrar: ");
        numeroElectrodomesticos = miScanner.nextInt();

        System.out.println("Introduce el precio por Kilovatio-hora (kWh): ");
        precioPorkWh = miScanner.nextDouble();

        System.out.println("Introduce la potencia total contratada: ");
        potenciaTotalContratada = miScanner.nextDouble();

        while (numeroElectrodomesticos >= numeroElectrodomestico) {

            System.out.println("Introduce la potencia del electrodomestico " + numeroElectrodomestico + " (en vatios):");
            potenciaElectrodomestivo = miScanner.nextDouble();

            if (potenciaElectrodomestivo > potenciaTotalContratada) {
                
                System.out.println("Has superado la potencia de " + potenciaTotalContratada + " W.");
            
            } else {

                System.out.println("Introduce el numero de horas de uso diario:");
                horasDiarias = miScanner.nextDouble();
    
                consumoTotalMensual += (horasDiarias * 30) * (potenciaElectrodomestivo/1000);
                numeroElectrodomestico++;
            }
        }

        costeTotalMensual = consumoTotalMensual * precioPorkWh;
        System.out.println("Consumo total mensual: " + consumoTotalMensual + " kWh.");
        System.out.println("Coste totalmensual: " + costeTotalMensual + " €.");

        miScanner.close();
    }
}
