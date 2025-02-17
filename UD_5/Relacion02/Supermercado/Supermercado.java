package Relacion02.Supermercado;

import java.util.ArrayList;

public class Supermercado {

    private ArrayList<Producto> almacen;

    public Supermercado(){
        this.almacen = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto nuevoProducto) {
        almacen.add(nuevoProducto);
    }

    public Producto buscarProducto (int id) {

        Producto productoBuscado = null;

        for (int i = 0; i < almacen.size(); i++) {
            Producto productoActual = almacen.get(i);

            if (productoActual.getId() == id) {
                productoBuscado = productoActual;
            }
        }

        return productoBuscado;
    }

    public void venderProducto (int id, int cantidad) {

        Producto productoBuscado = buscarProducto(id);
        int nuevaCantidad = productoBuscado.getCantidad() - cantidad;
        
        productoBuscado.setCantidad(nuevaCantidad);
    }

    public String toString() {
        
        String listaProductos = "Los productos disponibles: \n";
        for (int i = 0; i < almacen.size(); i++) {
            listaProductos += almacen.get(i) + "\n";
        }

        return listaProductos;

    }

}
