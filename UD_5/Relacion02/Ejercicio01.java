package Relacion02;

import java.util.ArrayList;

class Estudiante {

    private String nombre;
    private int edad;
    private int numeroMatricula;

    public Estudiante (String nombre, int edad, int numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula () {
        return this.numeroMatricula;
    }

    public String toString () {
        return this.nombre + " - " + this.edad + " - " + this.numeroMatricula;
    }

}

class Universidad {

    private ArrayList<Estudiante> Estudiantes;
    
    public Universidad () {
        this.Estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiantes (Estudiante nuevoEstudiante) {
        Estudiantes.add(nuevoEstudiante);
    }

    public void mostrarEstudiantes () {
        for (int i = 0; i < Estudiantes.size(); i++) {
            // System.out.println(Estudiantes.g);
        }
    }

    // public String buscarEstudiante (int numeroMatricula) {
    //     return;
    // }
}

public class Ejercicio01 {

    public static void main(String[] args) {

        Estudiante estudianteUno = new Estudiante("Maria", 18, 123);
        Estudiante estudianteDos = new Estudiante("Manolo", 20, 124);
        
        Universidad derecho = new Universidad();
        derecho.agregarEstudiantes(estudianteDos);

        System.out.println(estudianteUno);
        
    }

}
