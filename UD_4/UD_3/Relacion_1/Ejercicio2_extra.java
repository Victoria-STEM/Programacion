package Relacion_1;

import java.util.ArrayList;

public class Ejercicio2_extra {

    public static int max = 6;
    public static int min = 1;
    public static int posiblesResultado = 12;

    public static ArrayList<Integer> lanzarDosDados (int veces) {

        // Creo un array para guardar las posibles resultados de lanzar los 2 dados
        ArrayList<Integer> resultadosLanzamiento = new ArrayList<>();

        for (int i = 0; i < (posiblesResultado + 1); i++) {
            resultadosLanzamiento.add(0);
        }

        int sumaDados = 0;

        for (int i = 0; i < veces; i++) {

            
            int dadoUno = (int) (Math.random() * (max - min + 1)) + min;
            int dadoDos = (int) (Math.random() * (max - min + 1)) + min;

            sumaDados = dadoUno + dadoDos;

            resultadosLanzamiento.set(sumaDados, resultadosLanzamiento.get(sumaDados) + 1);
            
        }
        
        return resultadosLanzamiento;
    }

    public static Integer buscarNumeroMasGrandeEnArray (ArrayList<Integer> resultados) {
        int numero = 0;
        int indice = 0;

        for (int i = 0; i < resultados.size(); i++) {
            if (numero < resultados.get(i)) {
                numero = resultados.get(i);
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {

        // Crea una función llamada lanzarDosDados que lance dos dados, es decir, que genere dos números aleatorios entre 1 y 6 y los sume. 
        // La función debe devolver la suma de estos dos números. Por ejemplo, si los dados muestran 3 y 4, el resultado será 7.

        ArrayList<Integer> resultados = lanzarDosDados(1000);
        System.out.println("Los resultados de lanzar los dados son: " + resultados);

        int numeroMasRepetido = buscarNumeroMasGrandeEnArray(resultados);
        System.out.println("El numero mas repetido es: " + numeroMasRepetido);

    }
}