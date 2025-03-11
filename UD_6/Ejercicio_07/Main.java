public class Main {

// Define una interfaz Transporte con los métodos arrancar() y detener(). Cada método debe devolver una cadena indicando la acción realizada.
// Luego, crea tres clases concretas: Autobús, Metro y Bicicleta. Cada clase debe implementar la interfaz y 
// proporcionar una implementación específica para cada método según el tipo de transporte. 

// En el caso de Autobús, se debe indicar la hora de salida al arrancar y la hora de parada al detener. 
// En el caso de Metro se debe indicar el número de vagones al arrancar.
// Implementa una clase Main para probar la creación de objetos y la llamada a los métodos de la interfaz.

    public static void main(String[] args) {

        Metro metro = new Metro();
        Bicicleta bicicleta = new Bicicleta();
        Autobus autobus = new Autobus("la Robert", "10:00", "22:00");

        System.out.println(metro);
        System.out.println(bicicleta);
        System.out.println(autobus);

    }

}
