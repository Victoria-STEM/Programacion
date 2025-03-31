
public class RevistaDigital extends MaterialDigital {

    private String editorial;
    private int edicion;

    public RevistaDigital(String titulo, String codigo, String categoria, String url, String editorial, int edicion) {
        super(titulo, codigo, categoria, url);
        this.editorial = editorial;
        this.edicion = edicion;
    }

    // ---------------- GETTERS & SETTERS ---------------- //
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    // ----------------- METODOS ----------------- //

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
    public String toString() {
        return "Código: " + getCodigo() 
                + " | Título: " + getTitulo() 
                + " | Categoría: " + getCategoria() 
                + " | Publicador: " + getEditorial() 
                + " | Edición: " + getEdicion() 
                + " | URL: " + getUrl()
                + " | Sesion: " + (this.sesionActiva() ? "Activa" : "Cerrada" )
                + " | Usuario: " + (getUsuario() == null ? "Sin usuario" : getUsuario());
    }

    @Override
    public String obtenerInformacion() {
        return this.toString();
    }

}
