package UD1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroElectrodomesticos;
        double precioPorkWh;
        double costeConsumoElectrico;
        double portenciaTotalContratada;
        int numeroElectrodomestico = 1;

        System.out.println("Introduce el numero de electrodomesticos a registrar: ");
        numeroElectrodomesticos = miScanner.nextInt();

        System.out.println("Introduce el prcio por Kilovatio-hora (kWh): ");
        precioPorkWh = miScanner.nextDouble();

        System.out.println("Introduce la potencia total contratada: ");
        portenciaTotalContratada = miScanner.nextDouble();

        System.out.println("Introduce la potencia del electrodomestico " + numeroElectrodomestico);
        numeroElectrodomestico ++;

        

    }
    
}
