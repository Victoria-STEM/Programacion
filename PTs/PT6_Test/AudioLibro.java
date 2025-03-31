
public class AudioLibro extends MaterialDigital implements Reservable {

    private String autor;
    private int duracionMinutos;
    private boolean reservado;

    public AudioLibro(String titulo, String codigo, String categoria, String url,
            String autor, int duracionMinutos) {
        super(titulo, codigo, categoria, url);
        this.autor = autor;
        this.duracionMinutos = duracionMinutos;
        this.reservado = false;
    }

    // --------------------- GETTERS & SETTERS --------------------- //
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    // ---------------------- METODOS ---------------------- //
    
    public boolean reservar() {
        this.setReservado(true);
        return this.isReservado();
    }

    public boolean cancelarReserva() {
        this.setReservado(false);
        return isReservado();
    }

    public boolean estaReservado() {
        return isReservado();
    }

    @Override
    public String iniciarSesion(String usuario) {
        setUsuario(usuario);
        return "Sesion iniciada con el usuario: " + this.getUsuario();
    }

    @Override
    public String cerrarSesion() {
        setUsuario(null);
        return "Sesion cerrada";
    }

    @Override
    public boolean sesionActiva() { 
        return (this.getUsuario() == null? false : true);
    }   

    @Override
    public String toString() {
        return  getClass() 
                + " | Código: " + getCodigo() 
                + " | Título: " + getTitulo()
                + " | Autor: " + getAutor() 
                + " | Categoría: " + getCategoria()
                + " | URL: " + getUrl() 
                + " | Duración: " + getDuracionMinutos() + " min"
                + " | Usuario: " + getUsuario() 
                + " | Sesión Activa: " + (isSesionActiva() ? "Sí" : "No")
                + " | Reservado: " + (isReservado() ? "Sí" : "No");
    }

    @Override
    public String obtenerInformacion() {
        return this.toString();
    }

}
