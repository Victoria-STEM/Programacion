
import java.util.ArrayList;

import Relacion02.Universidad.Estudiante;

// Luego, crea una clase Biblioteca con un array de libros 
// y métodos para:

// Agregar libros
// Prestar un libro (cambiar disponible a false)
// Devolver un libro

public class biblioteca {

    private ArrayList<libro> archivoLibros;

    public biblioteca() {
        this.archivoLibros = new ArrayList<libro>();
    }

    public void agregarLibros(libro nuevoLibro) {
        nuevoLibro.setId(archivoLibros.size() + 1);
        archivoLibros.add(nuevoLibro);
    }

    public void prestarLibro(int id) {

        libro buscado = buscarLibro(id);
        if (buscado != null) {
            buscado.setDisponible(false);
        }

    }

    public void devolverLibro(int id) {

        libro buscado = buscarLibro(id);
        if (buscado != null) {
            buscado.setDisponible(true);
        }

    }

    public libro buscarLibro(int id) {

        libro libroBuscado = null;

        for (int i = 0; i < archivoLibros.size(); i++) {
            libro libroActual = archivoLibros.get(i);

            if (libroActual.getId() == id) {
                libroBuscado = libroActual;
            }
        }

        return libroBuscado;
    }

    public String toString() {

        String listaLibros = "La biblioteca contiene los siguientes titulos:\n";

        for (int i = 0; i < archivoLibros.size(); i++) {
            libro libroActual = archivoLibros.get(i);
            listaLibros += libroActual + "\n";
        }

        return listaLibros;
    }

}
