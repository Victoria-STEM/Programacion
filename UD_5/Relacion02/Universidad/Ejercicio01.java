package Relacion02.Universidad;

public class Ejercicio01 {

    public static void main(String[] args) {

        Universidad derecho = new Universidad();

        // derecho.generarEstudiantes(100);
        // System.out.println(derecho.toString());

        // derecho.agregarEstudiantes(estudianteDos);
        // System.out.println(estudianteUno);

        int cantidadAlumnos = 100;
        for (int i = 0; i < cantidadAlumnos; i++) {
            Estudiante aleatorio = new Estudiante(Faker.nombre(), Faker.edad(), (i+1));
            derecho.agregarEstudiantes(aleatorio);
        }

        System.out.println(derecho.toString());
        System.out.println(derecho.buscarEstudiante(5));


    }
}
