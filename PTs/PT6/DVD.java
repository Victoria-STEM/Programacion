
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
    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public boolean prestable() {
        return (this.isPrestado()? false : true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public boolean reservable() {
        return this.isPrestado() ? false : true;
    }

    @Override
    public String toString() {
        return  "Código: " + getCodigo()
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
