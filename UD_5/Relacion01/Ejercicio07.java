package Relacion01;

class Lampara {

    private boolean estado;

    public Lampara (boolean estado) {
        this.setEstado(estado); 
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void encender () {
        this.estado = true;
    }

    public void apagar () {
        this.estado = false;
    }

    public void interruptor () {
        this.estado = (this.estado = false) ? true : false ;
    }

    public String toString() {
        return "La lampara está: " + ((this.estado == true) ? "encendida" : "apagada" ) + ".";
    }

}

public class Ejercicio07 {
    public static void main(String[] args) {
        
        Lampara lamparaUno = new Lampara (false);
        System.out.println(lamparaUno);

        lamparaUno.encender();
        System.out.println(lamparaUno);

        lamparaUno.apagar();
        System.out.println(lamparaUno);

        System.out.println(lamparaUno);
        
    }
}
