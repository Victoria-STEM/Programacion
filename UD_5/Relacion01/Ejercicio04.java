package Relacion01;

class Auto {

    String marca;
    String modelo;
    int velocidadActual;

    public Auto (String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public int acelerar(int cantidad) {
        int nuevaVelodidad = this.velocidadActual + cantidad;
        return this.velocidadActual = nuevaVelodidad;
    }

    public int frenar(int cantidad) {
        int nuevaVelodidad = this.velocidadActual - cantidad;
        return this.velocidadActual = nuevaVelodidad;
    }

}

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Auto berlingo = new Auto ("Fiat", "A3", 50);
        System.out.println(berlingo.velocidadActual);
        berlingo.acelerar(20);
        System.out.println(berlingo.velocidadActual);
        berlingo.frenar(30);
        System.out.println(berlingo.velocidadActual);
    }
}
