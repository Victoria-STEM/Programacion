package UD5.Ejemplos;

class Persona {

    // Atributos de la clase
    public String nombre;
    public int edad;
    public double tamano;
    public double estatura;

    // Constructor de la clase -> instrucciones para crear el objeto
    public Persona(String nombreInicial, int edadInicial, double pesoInicial, double estaturaInicial){
        nombre = nombreInicial;
        edad = edadInicial;
        tamano = pesoInicial;
        estatura = estaturaInicial;
    }

    public String saludar(){
        return "Hola " + nombre;
    }

    // static significa que este método puede ser usado sin instanciar un objeto de la clase
    public static String hola(){
        return "Hola Persona!!!!";
    }

    public Integer calcularAnioNacimiento() {
        int anio;
        return anio = (2025 - edad);
    }

    public boolean esMayorDeEdad() {
        // if (edad >= 18) {
        //     mayorDeEdad = true;
        // }
        return (edad >= 18);
    }
    
    public double calcularIMC() {
        double estaturaMetros = estatura / 100;
        double IMC = tamano / (estaturaMetros * estaturaMetros);
        return IMC;
    }
}

class Perro {

    // Atributos:
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private double peso;

    // Constructor
    public Perro (String nombre, String raza, int edad, double peso) {
        this.setNombre(nombre);
        this.setRaza(raza);
        this.setEdad(edad);
        this.setPeso(peso);
    }

    // Getters & setters:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setRaza(String raza) {
        this.raza = raza.toUpperCase();
    }

    public String getRaza() {
        return this.raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if (edad < 0 || edad > 20) {
            edad = 0;
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTamano() {

        if (this.peso < 5) {
            this.tamano = "pequeño";
        }
        else if (this.peso <= 10) {
            this.tamano = "mediano";
        }
        else if (this.peso > 10) {
            this.tamano = "grande";
        }
    }

    public String getTamano() {
        return this.tamano;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        
        if (this.peso < 0 || this.peso > 60) {
            this.peso = 0;
        } 

        this.setTamano();
    }

    public double getPeso() {
        return this.peso;
    }

    public int calcularEdadHumana() {
        return this.edad * 7;
    }

    public String ladrar() {
        String ladrido;

        if (this.tamano.equals("pequeño")) {
            ladrido = "ù.ú";
        }
        else if (this.tamano.equals("mediano")) {
            ladrido = "ù.ú";
        }
        else {
            ladrido = "Ù.Ú";
        }
        return ladrido;
    }

}

public class MiPrimeritaClase {

    public static String hola(){
        return "Hola!!!!";
    }

    public static void main(String[] args) {

        Persona javi = new Persona("Javi", 22, 70, 175);
        Persona mariFlor = new Persona("MariFlor", 12, 70, 175);
        Persona josemi = new Persona("Josemi", 30, 70, 175);
        Persona eustaquio = new Persona("Eustaquio", 92, 70, 175);

        // System.out.println(Persona.hola());

        // System.out.println("La edad de " + mariFlor.nombre + " es " + mariFlor.edad + " años.");
        // System.out.println(mariFlor.saludar());
        // System.out.println(mariFlor.calcularIMC());
        // System.out.println(mariFlor.calcularAnioNacimiento());
        // System.out.println(mariFlor.esMayorDeEdad());
        
        // Perro patan = new Perro("patan", "perro rata", 5, "pequeño", 5.5);
        // Perro rex = new Perro("Rex", "pastor aleman", 10, "grande", 22.2);

        // System.out.println(patan.ladrar());
        // System.out.println(patan.nombre);
        // System.out.println(patan.calcularEdadHumana());

        // System.out.println(rex.ladrar());
        // System.out.println(rex.nombre);
        // System.out.println(rex.calcularEdadHumana());

        Perro rex = new Perro("Rex", "pastor aleman", 10, 20);

        System.out.println(rex.getNombre() + " es un perro " + rex.getTamano() + " porque pesa " + rex.getPeso() + " kg.");
        System.out.println(rex.getNombre() + " es un pero: " + rex.getTamano());
        System.out.println(rex.getNombre() + " pesa: " + rex.getPeso() + " kg.");
        System.out.println(rex.getNombre() + " es un: " + rex.getRaza());

        rex.setPeso(70);
        System.out.println(rex.getPeso());

    }
}