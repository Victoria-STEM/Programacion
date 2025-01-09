package Relacion_01;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numeroCaramelos;
        int numeroNinos;
        int numeroCaramelosPorNino;
        int numeroCaramelosSobran;

        System.out.println("¿Cuantos caramelos tienes?");
        numeroCaramelos = miScanner.nextInt();

        System.out.println("¿Cuantos ninos hay?");
        numeroNinos = miScanner.nextInt();

        numeroCaramelosPorNino = numeroCaramelos / numeroNinos;
        numeroCaramelosSobran = numeroCaramelos - (numeroCaramelosPorNino * numeroNinos);
        System.out.println("El numero de caramelos por niño es " + numeroCaramelosPorNino + " y sobra/n " + numeroCaramelosSobran + " caramelo/s.");
        
        miScanner.close();
    }
}
