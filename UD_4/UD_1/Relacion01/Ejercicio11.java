package Relacion01;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int cantidadTotalSegundos;
        int horas;
        int minutos;
        int segundosRestantes;

        System.out.println("Introduce una cantidad de segundos:");
        cantidadTotalSegundos = miScanner.nextInt();

        minutos = cantidadTotalSegundos/60;
        horas = minutos/60;
        segundosRestantes = cantidadTotalSegundos - ((horas * 3600) + (minutos * 60));

        System.out.println("Eso son " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");

        miScanner.close();
    }
    
}
