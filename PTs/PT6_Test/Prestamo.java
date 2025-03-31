public interface Prestamo {

    public boolean prestar(Usuario usuario);
    public boolean devolver(Usuario usuario);
    public boolean reservable();

}