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
        boolean mayorDeEdad = false;

        mayorDeEdad = (edad >= 18) ? true : false;

        // if (edad >= 18) {
        //     mayorDeEdad = true;
        // }
        return mayorDeEdad;
    }
    
    public double calcularIMC() {
        double estaturaMetros = estatura / 100;
        double IMC = tamano / (estaturaMetros * estaturaMetros);
        return IMC;
    }
}

class Perro {

    public String nombre;
    public String raza;
    public int edad;
    public String tamano;
    public double peso;

    public Perro (String nombre, String raza, int edad, String tamano, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.peso = peso;
    }

    public Integer calcularEdadHumana() {
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
        
        Perro patan = new Perro("patan", "perro rata", 5, "pequeño", 5.5);
        Perro rex = new Perro("Rex", "pastor aleman", 10, "grande", 22.2);

        System.out.println(patan.ladrar());
        System.out.println(patan.nombre);
        System.out.println(patan.calcularEdadHumana());

        System.out.println(rex.ladrar());
        System.out.println(rex.nombre);
        System.out.println(rex.calcularEdadHumana());
    }
    
}