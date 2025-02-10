package Relacion01;

class Termometro {

    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura () {
        return this.temperatura;
    }

    public double convertir_a_farenheit () {
        double farenheit = (this.temperatura * 1.8) + 32;
        return farenheit;
    }
    
}

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Termometro termometroUno = new Termometro(30);
        System.out.println(termometroUno.getTemperatura() + "°C, son " + termometroUno.convertir_a_farenheit() + "F.");

    }
}
