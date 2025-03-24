
public class LibroFisico extends MaterialBiblioteca implements Prestamo, Reservable {

    private String autor;
    private int anioPublicacion;
    private boolean prestado;
    private boolean reservado;

    public LibroFisico(String titulo, String codigo, String categoria, String autor, int anioPublicacion) {
        super(titulo, codigo, categoria);
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
        this.reservado = false;
    }

    // ------------------- GETTERS & SETTERS ------------------- //
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    // ------------------- METODOS ------------------- //
    
    public boolean prestar() {
        if (!isReservado()) {
            setPrestado(true);
        }
        return isPrestado();
    }

    public boolean devolver() {
        this.setPrestado(false);
        return isPrestado();
    }

    public boolean reservable() {
        return this.isReservado() ? false : true;
    }

    public boolean reservar() {
        this.setReservado(true);
        return this.isReservado();
    }

    public boolean cancelarReserva() {
        this.setReservado(false);
        return this.isReservado();
    }

    public boolean estaReservado() {
        return this.isPrestado();
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo()
                + " | Título: " + getTitulo()
                + " | Categoría: " + getCategoria()
                + " | Autor: " + getAutor()
                + " | Año de Publicación: " + getAnioPublicacion()
                + "\nPrestado: " + (isPrestado() ? "Sí" : "No")
                + " | Reservado: " + (isReservado() ? "Sí" : "No");
    }

    @Override
    public String obtenerInformacion() {
        return this.toString();
    }

}
