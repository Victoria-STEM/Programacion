public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto (String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // ------------------------ METODOS ------------------------ //

    public double aplicarDescuento(int cantidad) {

        int cantidadDescuento10 = 10;
        double descuento5 = 0.05;
        int cantidadDescuento50 = 50;
        double descuento10 = 0.10;
        double precioFinal = this.precio;

        if (cantidad > cantidadDescuento10) {
            precioFinal -= precio * descuento5;
        }
        if (cantidad > cantidadDescuento50) {
            precioFinal -= precio * descuento10;
        }
        return precioFinal;
    }

    public String toString() {
        return "Codigo: " + this.codigo + " | " + "Nombre: " + this.nombre + " | " + "Cantidad: " + this.cantidad + " | " + "Precio: " + this.precio + " €";
    }

}
