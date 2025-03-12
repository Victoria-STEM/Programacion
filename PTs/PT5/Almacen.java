import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> listaProductos;

    public Almacen() {
        this.listaProductos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto nuevoProducto) {
        int idNuevoProducto;
        if (listaProductos.isEmpty()) {
            idNuevoProducto = 1;
        }
        else {
            idNuevoProducto = listaProductos.get(listaProductos.size() - 1).getCodigo() + 1;
        }
        nuevoProducto.setCodigo(idNuevoProducto);
        listaProductos.add(nuevoProducto);

    }

    public Producto buscarProducto(int codigo) {
        Producto productoBuscado = null;
        boolean encontrado = false;

        for (int i = 0; i < listaProductos.size() && !encontrado; i++) {

            if (listaProductos.get(i).getCodigo() == codigo) {
                encontrado = true;
                productoBuscado = listaProductos.get(i);
            }
        }

        return productoBuscado;
    }

    // public boolean venderProducto(int codigoProducto, int cantidadProducto) {
    //     boolean ventaRealizada = false;
    //     Producto productoBuscado =  listaProductos.get(codigoProducto);

    //     if (productoBuscado != null && productoBuscado.getCantidad() >= cantidadProducto) {
    //         int nuevaCantidad = productoBuscado.getCantidad() - cantidadProducto;
    //         productoBuscado.setCantidad(nuevaCantidad);
    //         ventaRealizada = true;
    //     }

    //     return ventaRealizada;
    // }

    public void eliminarProducto(int codigoProducto) {
            listaProductos.remove(codigoProducto - 1);
    }

    public String toString() {
        
        String listaProductosAlmacen = "Lista de productos disponibles: \n";

        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductosAlmacen += listaProductos.get(i) + "\n";
        }

        return listaProductosAlmacen;
 
    }

}
