
public class LibroFisico extends MaterialBiblioteca implements Prestamo, Reservable, Renovable {

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
    
    public boolean prestar(Usuario usuario) {
        if (usuario.puedePedirPrestado() && !isPrestado()) {
            usuario.incrementarPrestamosActivos();
            setPrestado(true);
        }
        return isPrestado();
    }

    public boolean devolver(Usuario usuario) {
        usuario.reducirPrestamosActivos();
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
        return this.isReservado();
    }

    public String renovar() {
        String mensaje = "";
        if (!estaReservado()) {
            mensaje = this.getTitulo() + " ha sido renovado por 15 días.";
            setPrestado(true);
        } else {
            mensaje = this.getTitulo() + " no puede ser renovado.";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return getClass()
                + " | Código: " + getCodigo()
                + " | Título: " + getTitulo()
                + " | Categoría: " + getCategoria()
                + " | Autor: " + getAutor()
                + " | Año de Publicación: " + getAnioPublicacion()
                + " | Prestado: " + (isPrestado() ? "Sí" : "No")
                + " | Reservado: " + (isReservado() ? "Sí" : "No");
    }

    @Override
    public String obtenerInformacion() {
        return this.toString();
    }

}
