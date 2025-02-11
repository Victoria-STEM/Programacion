package Relacion01;

class Auto {

    String marca;
    String modelo;
    int velocidadActual;

    public Auto (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(int cantidad) {
        this.velocidadActual += cantidad;
    }

    public void frenar(int cantidad) {
        this.velocidadActual = this.velocidadActual < cantidad ? 0 : (this.velocidadActual -= cantidad);
    }
    

    public String toString() {
        return "El coche " + this.marca + ", modelo " + this.modelo + " va a " + this.velocidadActual + "km/h.";
    }

}

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Auto berlingo = new Auto ("Fiat", "A3");
        System.out.println(berlingo.velocidadActual);
        berlingo.acelerar(20);
        System.out.println(berlingo.velocidadActual);
        berlingo.frenar(30);
        System.out.println(berlingo.velocidadActual);

        System.out.println(berlingo);

    }
}
