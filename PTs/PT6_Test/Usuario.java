public class Usuario {

    private String nombre; 
    private int idUsuario; 
    private int prestamosActivos;

    public Usuario (String nombre, int idUsuario, int prestamosActivos) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.prestamosActivos = 0;
    }

    // --------------------- GETTERS & SETTERS --------------------- //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getPrestamosActivos() {
        return prestamosActivos;
    }

    public void setPrestamosActivos(int prestamosActivos) {
        this.prestamosActivos = prestamosActivos;
    }

    // ---------------- METODOS ---------------- //

    public void incrementarPrestamosActivos() {
        this.prestamosActivos++;
    }

    public void reducirPrestamosActivos() {
        if (this.prestamosActivos > 0) {
            this.prestamosActivos--;
        }
    }

    public boolean puedePedirPrestado() {
        return (getPrestamosActivos() < 3 ? true : false);
    }

    public String toString() {
        return "El usuario: " + getNombre() + " con ID: " + getIdUsuario() + " tiene: " + getPrestamosActivos() + " prestamos activos.";
    }
    
}