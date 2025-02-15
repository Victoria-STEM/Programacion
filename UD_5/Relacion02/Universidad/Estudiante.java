package Relacion02.Universidad;

public class Estudiante {

    private String nombre;
    private int edad;
    private int numeroMatricula;

    public Estudiante(String nombre, int edad, int numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public String toString() {
        return this.nombre + " - " + this.edad + " - " + this.numeroMatricula;
    }

}
