// Haz una función que reciba cuatro horarios en formato de 24 horas (como cadenas: "19:45") 
// correspondientes a las horas de inicio y fin de dos citas. Determina si se solapan (true) 
// o si ambas citas son compatibles (no se solapan: false).

package UD_3.Relacion_2;

public class Ejercicio02 {

    public static Boolean comprobarSolapamiento (String hora1, String hora2, String hora3, String hora4) {
        Boolean seSolapan = true;

        if (hora1.isBefore(hora3)) {
            seSolapan = false;
        }

        return seSolapan;
    }

    public static void main(String[] args) {
        
    }
}
