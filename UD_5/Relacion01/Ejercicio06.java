package Relacion01;

class Reloj {

    public int hora;
    public int minuto;
    public int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String toString() {

        // empezamos con los segundos:
        int minutos = this.segundo / 60;
        int segundosRestantes = this.segundo % 60;
        this.segundo = segundosRestantes; // actualizo los segundos.

        // seguimos con los minutos:
        this.minuto += minutos;
        int horas = this.minuto / 60;
        int minutosRestantes = this.minuto % 60;
        this.minuto = minutosRestantes;

        // seguimos con las horas:
        this.hora += horas;
        if (this.hora > 24) {
            int horasRestantes = this.hora / 24;
            this.hora = horasRestantes;
        }

        this.hora %= 24;

        return "El Reloj indica: " + this.hora + ":" + this.minuto + ":" + this.segundo + ((this.hora > 13) ? " PM" : " AM");

    }

}

public class Ejercicio06 {

    public static void main(String[] args) {

        Reloj relojUno = new Reloj(100, 100, 100);
        System.out.println(relojUno);

        Reloj relojDos = new Reloj(20, 10, 9);
        System.out.println(relojDos);

        Reloj relojTres = new Reloj(12, 10, 9);
        System.out.println(relojTres);

        Reloj relojCuatro = new Reloj(01, 10, 9);
        System.out.println(relojCuatro);

        Reloj relojCinco = new Reloj(13, 10, 9);
        System.out.println(relojCinco);

    }

}
