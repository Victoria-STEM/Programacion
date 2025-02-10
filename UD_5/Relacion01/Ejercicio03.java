package Relacion01;

class Alumno {

    String nombre;
    String materia;
    double calificacion;

    public Alumno (String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public boolean aprobar() {
        return this.calificacion < 6 ? false : true;
    }

}

public class Ejercicio03 {

    public static void main(String[] args) {

        Alumno maria = new Alumno("Maria", "Matematicas", 6);
        System.out.println(maria.aprobar());

    }
}
