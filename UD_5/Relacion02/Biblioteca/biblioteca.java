
import java.util.ArrayList;

// Luego, crea una clase Biblioteca con un array de libros 
// y métodos para:

// Agregar libros
// Prestar un libro (cambiar disponible a false)
// Devolver un libro

public class biblioteca {
   
    private ArrayList<libro> archivoLibros;

    public biblioteca () {
        this.archivoLibros = new ArrayList<libro>();
    }

    public void agregarLibros (libro nuevoLibro) {
        archivoLibros.add(nuevoLibro);
    }

    public void generarLibro (int cantidad) {

        int id = 1;

        for (int i = 0; i < cantidad; i++) {
            String titulo = Faker.loremCorto();
            String nombreCompleto = Faker.nombreCompleto();
            String sinopsis = Faker.loremLargo();

            libro nuevoLibro = new libro(id, titulo, nombreCompleto, sinopsis, true);
            archivoLibros.add(nuevoLibro);

            id ++;
        }
    }

    public void prestarLibro (int id) {

        for (int i = 0; i < 10; i++) {
            libro libroActual = archivoLibros.get(i);

            if (libroActual.getId() == id) {
                libroActual.setDisponible(false);
            }

        }
    }

    public void devolverLibro (int id) {

        for (int i = 0; i < 10; i++) {
            libro libroActual = archivoLibros.get(i);

            if (libroActual.getId() == id) {
                libroActual.setDisponible(true);
            }
        }
    }

    public String toString () {

        String listaLibros = "La biblioteca contiene los siguientes titulos:";

        for (int i = 0; i < archivoLibros.size(); i++) {
            libro libroActual = archivoLibros.get(i);
            listaLibros += libroActual + "\n";
        }

        return listaLibros;
    }

}
