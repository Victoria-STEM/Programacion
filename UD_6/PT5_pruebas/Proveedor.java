import java.util.ArrayList;

public class Proveedor {

    private int idProveedor;
    private String nombreProveedor;
    private ArrayList<Producto> productosSuministrados;

    public Proveedor (int idProveedor, String nombreProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.productosSuministrados = new ArrayList<Producto>();
    }

    // ------------------------ GETTERS & SETTERS ------------------------ //

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public ArrayList<Producto> getProductosSuministrados() {
        return productosSuministrados;
    }

    public void setProductosSuministrados(ArrayList<Producto> productosSuministrados) {
        this.productosSuministrados = productosSuministrados;
    }

    // ------------------------ METODOS ------------------------ //

    public void agregarProducto(Producto productoAgregado) {
        productosSuministrados.add(productoAgregado);
    }

    public String listarProductos() {
        String listaProductos = "";
        for (Producto producto : productosSuministrados) {
            listaProductos += producto.toString() + "/n";
        }
        return listaProductos;

    }
    
    public String toString() {
        return this.idProveedor + this.nombreProveedor + this.listarProductos();
    }

}
