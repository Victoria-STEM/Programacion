package UD_4.Relacion04;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroUsuario = "";
        String digito = "";
        int originalNumeroUsuario, digitoNumeroUsuario, contador;

        // Solicitar los numero con restricciones
        while (!numeroUsuario.equalsIgnoreCase("salir")) {

            System.out.println("Introduce un numero entero positivo:");
            numeroUsuario = scanner.next();
            int numero = Integer.parseInt(numeroUsuario);
            originalNumeroUsuario = numero;

            if (numero <= 0) {

                System.out.println("Numero incorrecto. Debe ser positivo y mayor que 0.");

            } else {

                System.out.println("Introduce un digito:");
                digito = scanner.next();

                if (!digito.equalsIgnoreCase("salir")) {

                    int digitoUsuario = Integer.parseInt(digito); // transformo el string en int.

                    while (digitoUsuario > 9) { // pido de nuevo del digito si es mayor que 9.

                        System.out.println("El digito debe tener una sola cifra:");
                        digitoUsuario = scanner.nextInt();

                    }

                    contador = 0; // reinicio el contador.
                    // Calcular el numero de ves que aparece el digito en el numero:
                    while (numero != 0) {

                        digitoNumeroUsuario = numero % 10;
                        if (digitoUsuario == digitoNumeroUsuario) {
                            contador++;
                        }
                        numero /= 10;
                    }

                    System.out.println("El digito " + digito + " aparece " + contador + " veces en el numero " + originalNumeroUsuario + ".");

                }
            }
        }
        scanner.close();
    }
}
