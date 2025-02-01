package Relacion_2;

public class Ejercicio2 {

    public static int max = 6;
    public static int min = 1;

    public static Integer lanzarDosDados () {
        
        int dadoUno = (int) (Math.random() * (max - min + 1)) + min;
        int dadoDos = (int) (Math.random() * (max - min + 1)) + min;

        int sumaDados = dadoUno + dadoDos;

        return sumaDados;
    }

    public static void main(String[] args) {

        // Crea una función llamada lanzarDosDados que lance dos dados, es decir, que genere dos números aleatorios entre 1 y 6 y los sume. 
        // La función debe devolver la suma de estos dos números. Por ejemplo, si los dados muestran 3 y 4, el resultado será 7.
        
        int sumaDados = lanzarDosDados();

        System.out.println("La suma de los 2 dados lanzados es: " + sumaDados);

    }
}