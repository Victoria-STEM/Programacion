public class Libro extends MaterialBibliografico {
    
    private int numePaginas;
    private String genero;

    public Libro(String titulo, String autor, int numePaginas, String genero) {
        super(titulo, autor);
        this.numePaginas = numePaginas;
        this.genero = genero;
    }

    public int getNumePaginas() {
        return numePaginas;
    }

    public void setNumePaginas(int numePaginas) {
        this.numePaginas = numePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Libro: " + super.getTitulo() + " por " + super.getAutor() + " Género: " + this.genero + ", Páginas: " + this.numePaginas + ".";

    }

}
