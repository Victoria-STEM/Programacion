package Relacion01;

class Televisor {

    private String canal;
    private int volumen;

    public Televisor (String canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public void subirVolumen (int cantidad) {
        this.volumen += cantidad;
    }

    public void bajarVolumen (int cantidad) {
        this.volumen -= cantidad;
    }

    public void cambiar_canal(String nuevoCanal) {
        this.canal = nuevoCanal;
    }

    public String mostrarInfo () {
        return this.canal + " " + this.volumen;
    }

}

public class Ejercicio08 {
    public static void main(String[] args) {
        
        Televisor televisorUno = new Televisor("TeleCinco", 10);
        System.out.println(televisorUno.mostrarInfo());

        televisorUno.cambiar_canal("Antena3");
        televisorUno.bajarVolumen(5);

        System.out.println(televisorUno.mostrarInfo());

    }
}
