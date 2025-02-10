package Relacion01;

class Lampara {

    private boolean estado;

    public Lampara (boolean estado) {
        this.estado = estado; 
    }

    public boolean getEstado() {
        return this.estado;
    }

    public boolean encender () {
        this.estado = true;
        return this.estado;
    }

    public boolean apagar () {
        this.estado = false;
        return estado;
    }

}

public class Ejercicio07 {
    public static void main(String[] args) {
        
        Lampara lamparaUno = new Lampara (false);
        System.out.println(lamparaUno.getEstado());

        lamparaUno.encender();
        System.out.println(lamparaUno.getEstado());

        lamparaUno.apagar();
        System.out.println(lamparaUno.getEstado());
        
    }
}
