public abstract class MaterialBiblioteca {
    
    private String titulo;
    private String codigo;
    private String categoria;

    public MaterialBiblioteca (String titulo, String codigo, String categoria) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.categoria = categoria;
    }
    
    // --------------------- GETTERS & SETTERS --------------------- //

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // --------------------- METODOS --------------------- //

    public abstract String obtenerInformacion();

}
