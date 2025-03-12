import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Proveedor> listaProveedores;

    public Almacen() {
        this.listaProductos = new ArrayList<Producto>();
        this.listaProveedores = new ArrayList<Proveedor>();
    }

    // ------------------------ GETTERS & SETTERS ------------------------ //

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    // ------------------------ METODOS ------------------------ //

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

    public void agregarProveedor(Proveedor nuevoProveedor) {
        int idNuevoProveedor;
        if (listaProveedores.isEmpty()) {
            idNuevoProveedor = 1;
        }
        else {
            idNuevoProveedor = listaProveedores.get(listaProveedores.size() - 1).getIdProveedor() + 1;
        }
        
        nuevoProveedor.setIdProveedor(idNuevoProveedor);
        listaProveedores.add(nuevoProveedor);
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

    public Proveedor buscarProveedor (int idProveedor) {

        Proveedor proveedorBuscado = null;

        for (int i = 0; i < listaProveedores.size(); i++) {
            if (idProveedor == listaProveedores.get(i).getIdProveedor()) {
                proveedorBuscado = listaProveedores.get(i);
            }
        }

        return proveedorBuscado;
    }

    public String listarProductoMenorQueCantidad(int cantidad) {
        String listaProductoMenorQueCantidad = "LISTA DE PRODUCTOS CON STOCK MENOR QUE " + cantidad + " unidad/es :\n";
        Producto productoActual;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (cantidad > listaProductos.get(i).getCantidad()) {
                listaProductoMenorQueCantidad += listaProductos.get(i) + "\n";
            }
        }
        return listaProductoMenorQueCantidad;
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

    public void eliminarProducto (int codigoProducto) {
            listaProductos.remove(codigoProducto - 1);
    }

    public String listarProductos() {
        String listaProductosAlmacen = "Lista de productos disponibles: \n";
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductosAlmacen += listaProductos.get(i) + "\n";
        }
        return listaProductosAlmacen;
    }

    public String listarProveedores() {
        String listaProveedoresAlmacen = "Lista de proveedores disponibles: \n";
        for (int i = 0; i < listaProveedores.size(); i++) {
            listaProveedoresAlmacen += listaProveedores.get(i) + "\n";
        }
        return listaProveedoresAlmacen;
    }

    public String toString() {

        String listaProveedoresAlmacen = "Lista de proveedores disponibles: \n";
        String listaProductosAlmacen = "Lista de productos disponibles: \n";

        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductosAlmacen += listaProductos.get(i) + "\n";
        }

        for (int i = 0; i < listaProductos.size(); i++) {
            listaProveedoresAlmacen += listaProveedores.get(i) + "\n";
        }

        listaProductosAlmacen += listaProveedoresAlmacen;

        return listaProductosAlmacen;
 
    }

}
