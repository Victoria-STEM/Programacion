package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int edadUsuario;
        int anoNacimientoUsuario;

        System.out.println("Introduce tu edad:");
        edadUsuario = miScanner.nextInt();

        anoNacimientoUsuario = 2024 - edadUsuario;
        System.out.println("El usuario nacio en el ano " + anoNacimientoUsuario);
        
        miScanner.close();
    }

}


