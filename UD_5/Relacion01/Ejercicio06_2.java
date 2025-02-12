// 1º que en toString() salgan 0s cuando la hora, el minuto o el segundo sea menor que 10
// 2º las horas deben ser 0 - 23 y los minutos y segundos de 0 - 59
// 3º completa el método setReloj()

class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj (String hora) {
        this.setReloj(hora);
    }

    public Reloj (int hora, int minuto, int segundo) {
        this.setHoras(hora);
        this.setMinutos(minuto);
        this.setSegundos(segundo);
    }

    public void setReloj(String hora) { 

        String[] horaDividida = hora.split(":");
        int horaSola = Integer.parseInt(horaDividida[0]);
        int minutoSolo = Integer.parseInt(horaDividida[1]);
        int segundoSolo = Integer.parseInt(horaDividida[2]);

        setHoras(horaSola);
        setMinutos(minutoSolo);
        setSegundos(segundoSolo);
    }

    public void setHoras(int hora) {

        if (hora < 24 && hora >= 0) {
            this.hora = hora;
        }
        else if (hora == 24) {
            this.hora = 0;
        }
        else {
            System.out.println("Erros: los minutos deben estar entre 0 y 59");
            this.hora = 00;
        }
    }

    public void setMinutos(int minuto) {

        if (minuto < 60 && minuto >= 0) {
            this.minuto = minuto;
        }
        else {
            System.out.println("Erros: los minutos deben estar entre 0 y 59");
            this.minuto = 00;
        }
    }

    public void setSegundos(int segundo) {

        if (segundo < 60 && segundo >= 0) {
            this.segundo = segundo;
        }
        else {
            System.out.println("Erros: los segundos deben estar entre 0 y 59");
            this.segundo = 00;
        }
    }

    public String toString() {
        return "Es/son las: " + String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

}

public class Ejercicio06_2 {

    public static void main(String[] args) {

        Reloj reloj1 = new Reloj(4, 5, 320);
        System.out.println(reloj1);

        Reloj reloj2 = new Reloj(24, 95, 320);
        System.out.println(reloj2);

        Reloj reloj3 = new Reloj("03:24:54");
        System.out.println(reloj3);

    }
}
