// Crea una clase Libro con atributos id, titulo, autor, sinopsis y disponible (booleano). Implementa los métodos get 
// y set para cada atributo, así como el método toString(). Luego, crea una clase Biblioteca con un array de libros 
// y métodos para:

// Agregar libros
// Prestar un libro (cambiar disponible a false)
// Devolver un libro

public class libro {

    private int id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    public libro (String titulo, String autor, String sinopsis, boolean disponible) {
        this.id = -1;
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setSinopsis(sinopsis);
        this.setDisponible(disponible);
    }

    // =========================== GETTERS AND SETTERS =========================== //

    public void setId (int id) {
        this.id = id;
    }

    public int getId () {
        return this.id;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo () {
        return this.titulo;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public String getAutor () {
        return this.autor;
    }

    public void setSinopsis (String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsis () {
        return this.sinopsis;
    }

    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getDisponible () {
        return this.disponible;
    }

    public String toString () {
        return this.id + " - " + this.titulo + " - " + this.autor + "\n" + "SINOPSIS: " + this.sinopsis + "\n" + (this.disponible == true ? "DISPONIBLE" : "NO DISPONIBLE");
    }

}