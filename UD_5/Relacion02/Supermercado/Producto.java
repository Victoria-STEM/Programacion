package Relacion02.Supermercado;

public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;

    public Producto (int id, String nombre, String descripcion, double precio, int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.setCantidad(cantidadStock);
    }

    public int getId () {
        return this.id;
    }

    public void setCantidad (int cantidad) {
        this.cantidadStock = cantidad;
    }

    public int getCantidad () {
        return this.cantidadStock;
    }

    public String toString () {
        return this.id + " - " + this.nombre + ": "+ this.precio + " €\n" + 
                this.descripcion + "\n" + 
                "Stock: " + this.cantidadStock;
    }

}
