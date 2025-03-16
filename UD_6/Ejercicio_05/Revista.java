public class Revista extends MaterialBibliografico {

    private String edicion;
    private String periodicidad;
    
    public Revista(String titulo, String autor, String edicion, String periodicidad) {
        super(titulo, autor);
        this.edicion = edicion;
        this.periodicidad = periodicidad;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String toString() {
        return "Revista: " + this.getTitulo() + " por " + this.getAutor() + ", Edición: " + this.edicion + ", Periodicidad: " + this.periodicidad + ".";
    }
    
}
