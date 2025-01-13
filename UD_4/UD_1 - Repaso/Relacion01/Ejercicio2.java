package Relacion01;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);
    double totalCuenta;
    double porcentajePropina;
    double totalPropina;

    System.out.println("Introduce el total de la cuenta:");
    totalCuenta = miScanner.nextDouble();

    System.out.println("Introduce el porcentaje de propina que deseas aportar:");
    porcentajePropina = miScanner.nextDouble();
    
    totalPropina = totalCuenta * (porcentajePropina/100);
    System.out.println("El total de la propina sería " + totalPropina + " Euros.");

    miScanner.close();

    }
}
