import java.util.ArrayList;

public class Supermercado {

    private ArrayList<Producto> almacen;

    public Supermercado() {
        this.almacen = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto nuevoProducto) {
        int idNuevoProducto = almacen.size() + 1;
        nuevoProducto.setId(idNuevoProducto);
        almacen.add(nuevoProducto);
    }

    private Producto buscarProducto(int id) {

        Producto productoBuscado = null;
        boolean encontrado = false;

        for (int i = 0; i < almacen.size() && !encontrado; i++) {

            if (almacen.get(i).getId() == id) {
                encontrado = true;
                productoBuscado = almacen.get(i);
            }
        }

        return productoBuscado;
    }

    public boolean venderProducto(int id, int cantidad) {
        boolean ventaRealizada = false;
        Producto productoBuscado = this.buscarProducto(id);

        if (productoBuscado != null && productoBuscado.getCantidad() >= cantidad) {
            int nuevaCantidad = productoBuscado.getCantidad() - cantidad;
            productoBuscado.setCantidad(nuevaCantidad);
            ventaRealizada = true;
        }

        return ventaRealizada;
    }

    public String mostrarInvetario() {
        toString();
    }

    public String toString() {

        String listaProductos = "Los productos disponibles: \n";
        for (int i = 0; i < almacen.size(); i++) {
            listaProductos += almacen.get(i) + "\n";
        }

        return listaProductos;
 
    }

}
