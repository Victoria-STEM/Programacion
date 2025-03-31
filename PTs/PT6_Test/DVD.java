
public class DVD extends MaterialBiblioteca implements Prestamo {

    private int duracionMinutos;
    private boolean prestado;

    public DVD(String titulo, String codigo, String categoria, int duracionMinutos) {
        super(titulo, codigo, categoria);
        this.duracionMinutos = duracionMinutos;
        this.prestado = false;
    }

    // -------------- GETTERS & SETTERS -------------- //
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // ---------------- METODOS ---------------- //
    public boolean prestar() {
        this.setPrestado(true);
        return this.isPrestado();
    }

    public boolean devolver() {
        this.setPrestado(false);
        return this.isPrestado();
    }

    public boolean reservable() {
        return this.isPrestado() ? false : true;
    }

    @Override
    public String toString() {
        return  getClass() 
                + " | Código: " + getCodigo()
                + " | Título: " + getTitulo()
                + " | Categoría: " + getCategoria()
                + " | Duración: " + getDuracionMinutos() + " min"
                + " | Prestado: " + (isPrestado() ? "Sí" : "No");
    }

    @Override
    public String obtenerInformacion() {
        return this.toString();
    }

}
