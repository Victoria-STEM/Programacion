public class prueba {
    
    public static void main(String[] args) {
        Electrodomestico nuevElectrodomestico = new Electrodomestico("null", "null");
        System.out.println(nuevElectrodomestico);

        Televisor televisor = new Televisor("null", "null", 20);
        System.out.println(televisor);

        Lavadora lavdora = new Lavadora("null", "null", 20);
        System.out.println(lavdora);
    }
    
}

class Electrodomestico {
    private String marca;
    private String modelo;

    public Electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Marca:" + this.marca + " | " + "Modelo: " + this.modelo;
    }
}

class Lavadora extends Electrodomestico {
    
    private int capacidadCarga;
    
    public Lavadora(String marca, String modelo, int capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Capacidad de carga: " + this.capacidadCarga;
    }
    
}

class Televisor extends Electrodomestico {
    
    private int tamanoPantalla;
    
    public Televisor(String marca, String modelo, int tamanoPantalla) {
        super(marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Tamano de pantalla: " + this.tamanoPantalla;
    }
    
}
