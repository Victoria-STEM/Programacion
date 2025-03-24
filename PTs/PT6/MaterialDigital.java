public abstract class MaterialDigital extends MaterialBiblioteca implements AccesoDigital{

    private String usuario;
    private String url;
    private boolean sesionActiva;

    public MaterialDigital (String titulo, String codigo, String categoria, String url) {
        super(titulo, codigo, categoria);
        this.usuario = null;
        this.url = url;
        this.sesionActiva = false;
    }

    // ------------------ GETTERS & SETTERS ------------------ //

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public void setSesionActiva(boolean sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    // ------------------ METODOS ------------------ //

    @Override
    public String toString() {
        return "Usuario: " + usuario +
           " | URL: " + url +
           " | Sesión Activa: " + (sesionActiva ? "Sí" : "No") +
           " | Título: " + getTitulo() +
           " | Código: " + getCodigo() +
           " | Categoría: " + getCategoria() +
           " | Sesión Activa (método): " + (isSesionActiva() ? "Sí" : "No") +
           " | Información: " + obtenerInformacion() +
           " | Cerrar Sesión (método): " + cerrarSesion() +
           " | Clase: " + getClass() +
           " | HashCode: " + hashCode() +
           " | Super.toString(): " + super.toString() + "\n";
    }

    @Override
    public String obtenerInformacion() {
        return toString();
    }
    
}
