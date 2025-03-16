public class MaterialBibliografico {
    
    private String titulo;
    private String autor;

    public MaterialBibliografico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return this.titulo + this.autor;
    }

    public static void main(String[] args) {
        
        MaterialBibliografico nuevoMaterial = new MaterialBibliografico(null, null);
        Libro nuevoLibro = new Libro("Los propios dioses", "Isaac Asimov", 330, "Sci fi");
        Revista nuevaRevista = new Revista("National Geographic", "Null", "VII", "Anual");
        

        System.out.println(nuevoLibro);
        System.out.println(nuevaRevista);
        System.out.println(nuevoMaterial);
    }

}