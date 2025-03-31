
public class TesisDigital extends MaterialDigital implements AccesoDigital {

    private String autor;
    private String universidad;
    private int anioPublicacion;

    public TesisDigital(String titulo, String codigo, String categoria, String url, String autor, String universidad,
            int anioPublicacion) {
        super(titulo, codigo, categoria, url);
        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }

    // --------------- GETTERS & SETTERS ------------------------ //

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // ------------------ METODOS ------------------------- //

    @Override
    public String iniciarSesion(String usuario) {
        setUsuario(usuario);
        return "Sesion iniciada con el usuatio: " + this.getUsuario();
    }

    @Override
    public String cerrarSesion() {
        setUsuario(null);
        return "Sesion cerrada";
    }

    @Override
    public boolean sesionActiva() {
        return this.getUsuario() != null;
    }

    @Override
    public String obtenerInformacion() {
        return toString();
    }

    @Override
    public String toString() {
        return getClass()
                + " | Código: " + getCodigo()
                + " | Título: " + getTitulo()
                + " | Autor: " + getAutor()
                + " | Universidad: " + getUniversidad()
                + " | Categoría: " + getCategoria()
                + " | Ano publicacion: " + getAnioPublicacion()
                + " | URL: " + getUrl()
                + " | Sesion: " + (this.sesionActiva() ? "Activa" : "Cerrada")
                + " | Usuario: " + getUsuario();
    }
}
