package Relacion01;

class Reloj {

    private String hora;
    private String minuto;
    private String segundo;

    public Reloj (String hora, String minuto, String segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String mostrar_hora () {
        String horaActual = "";
        horaActual = this.hora + ":" + this.minuto + ":" + this.segundo;
        return horaActual;
    }
    
}

public class Ejercicio06 {

    public static void main(String[] args) {
        
        Reloj relojUno = new Reloj("10", "20", "10");
        System.out.println(relojUno.mostrar_hora());

    }
}
