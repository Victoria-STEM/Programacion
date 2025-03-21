public abstract class MaterialDigital extends MaterialBiblioteca implements AccesoDigital{

    private String usuario;
    private String ulr;
    private boolean sesionActiva;

    public MaterialDigital (String titulo, String codigo, String categoria, String usuario, String url, boolean sesionActiva) {
        super(titulo, codigo, categoria);
        this.usuario = usuario;
        this.ulr = url;
        this.sesionActiva = sesionActiva;
    }

    // ------------------ GETTERS & SETTERS ------------------ //

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUlr() {
        return ulr;
    }

    public void setUlr(String ulr) {
        this.ulr = ulr;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public void setSesionActiva(boolean sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    // ------------------ METODOS ------------------ //
    
}
