package UD_5.Relacion03;

public class Cancion {
    
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion (String titulo, String artista, int duracion) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setDuracion(duracion);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String toString() {
        return this.artista + " | " + this.titulo + " | " + this.duracion;
    }
}
