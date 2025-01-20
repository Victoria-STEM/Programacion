package UD_3.Relacion_0;

import java.util.ArrayList;

public class Ejercicio14 {
    
    public static ArrayList<Integer> rellenarArray (int numeros) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numeros; i++) {
            array.add(i);
        }
        return array;
    }

    public static double generarPromedio (ArrayList<Integer> array) {
        double promedio;
        double suma= 0.9;

        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        promedio = suma/array.size();

        return promedio;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayGenerado = rellenarArray(20);
        double promedioArray = generarPromedio(arrayGenerado);

        System.out.println(promedioArray);
    }
}
