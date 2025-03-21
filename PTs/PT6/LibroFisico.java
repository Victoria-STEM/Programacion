public class LibroFisico extends MaterialBiblioteca implements Prestamo, Reservable {
    
    private String autor;
    private int anioPublicacion;
    private boolean prestado;
    private boolean reservado;

    public LibroFisico(String titulo, String codigo, String categoria, String autor, int anioPublicacion,
            boolean prestado, boolean reservado) {
        super(titulo, codigo, categoria);
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = prestado;
        this.reservado = reservado;
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
    
    public boolean prestar(){
        if (!isReservado()) {
            setPrestado(true);
        }
        return isPrestado();
    }

    public boolean devolver(){
        if (isPrestado()) { // si no está reservado se puede prestar
            setPrestado(false);
        }
        return isPrestado();
    }
    
    public boolean reservable() {
        if (!isReservado()) { // solo si está prestado se puede ser
            setReservado(true);
        }
        return isReservado();
    }

    public String reservar() {

    }

    public String cancelarReserva() {

    }
    
    public boolean estaReservado() {
        
    }
    
    public String toString() {
        return this.getTitulo() + this.getCodigo() + this.getCategoria() + this.getAutor() + this.getAnioPublicacion() + this.isPrestado() + this.isReservado();
    }
    
}
