package Relacion02;

public class Faker {
    // Arrays con datos de ejemplo
    private static final String[] nombres = {
            "Juan", "Pedro", "María", "Ana", "Luis", "Sofía", "Carlos", "Laura", "Fernando", "Elena",
            "Miguel", "Isabel", "Javier", "Beatriz", "Andrés", "Carmen", "Hugo", "Valeria", "Ricardo", "Paula",
            "Gabriel", "Alejandra", "Roberto", "Manuela", "Diego", "Victoria", "Daniel", "Natalia", "Álvaro", "Marta"
    };

    private static final String[] apellidos = {
            "García", "Rodríguez", "Martínez", "López", "González", "Pérez", "Fernández", "Sánchez", "Ramírez",
            "Torres",
            "Díaz", "Jiménez", "Moreno", "Vargas", "Rojas", "Castro", "Mendoza", "Romero", "Herrera", "Ortega",
            "Navarro", "Delgado", "Cabrera", "Reyes", "Acosta", "Campos", "Peña", "Vega", "Guerrero", "Cruz"
    };

    private static final String[] ciudades = {
            "Madrid", "Barcelona", "Buenos Aires", "Ciudad de México", "Lima", "Bogotá", "Santiago", "Caracas",
            "Montevideo", "Quito", "La Paz", "San Salvador", "San José", "Managua", "Asunción", "Brasilia",
            "Lisboa", "Roma", "París", "Berlín", "Londres", "Nueva York", "Los Ángeles", "Chicago", "Toronto",
            "Tokio", "Seúl", "Pekín", "Bangkok", "Sídney", "Ámsterdam", "Dublín", "Moscú", "Atenas", "Dubái"
    };

    // Fragmentos de texto Lorem Ipsum ampliado
    private static final String[] palabrasLorem = {
            "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do",
            "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua", "ut",
            "enim", "ad", "minim", "veniam", "quis", "nostrud", "exercitation", "ullamco", "laboris",
            "nisi", "ut", "aliquip", "ex", "ea", "commodo", "consequat", "duis", "aute", "irure",
            "dolor", "in", "reprehenderit", "voluptate", "velit", "esse", "cillum", "fugiat", "pariatur"
    };

    /**
     * Genera un número entero aleatorio entre min y max (inclusive).
     * 
     * @param min Valor mínimo.
     * @param max Valor máximo.
     * @return Número entero aleatorio.
     */
    public static int entero(int min, int max) {
        int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
        return numeroAleatorio;
    }

    /**
     * Genera un precio aleatorio en un rango dado.
     * 
     * @param min Valor mínimo del precio.
     * @param max Valor máximo del precio.
     * @return Precio aleatorio con dos decimales.
     */
    public static double precio(double min, double max) {
        double precioFinal = (Math.random() * (max - min + 1)) + min; 
        return precioFinal;
    }

    /**
     * Genera un nombre aleatorio.
     * 
     * @return Nombre aleatorio.
     */
    public static String nombre() {
        int indiceAleatorio = (int) (Math.random() * (nombres.length));
        String nombreAleatorio = nombres[indiceAleatorio];
        return nombreAleatorio;
    }

    /**
     * Genera un apellido aleatorio.
     * 
     * @return Apellido aleatorio.
     */
    public static String apellido() {
        int indiceAleatorio = (int) (Math.random() * (apellidos.length));
        String apellidoAleatorio = apellidos[indiceAleatorio];
        return apellidoAleatorio;
    }

    /**
     * Genera un nombre completo aleatorio.
     * 
     * @return Nombre y apellido combinados.
     */
    public static String nombreCompleto() {
        String nombreCompleto = nombre() + " " + apellido(); 
        return nombreCompleto;
    }

    /**
     * Genera una edad aleatoria entre 18 y 60 años.
     * 
     * @return Edad aleatoria.
     */
    public static int edad() {
        int edadAleatoria = (int) (Math.random() * (60 - 18 + 1)) + 18; 
        return edadAleatoria;
    }

    /**
     * Genera una ciudad aleatoria.
     * 
     * @return Ciudad aleatoria.
     */
    public static String ciudad() {
        int indiceAleatorio = (int) (Math.random() * (ciudades.length));
        String ciudadAleatoria = ciudades[indiceAleatorio];
        return ciudadAleatoria;
    }

    /**
     * Genera un número de teléfono aleatorio con formato "+34 XXX XXX XXX".
     * 
     * @return Número de teléfono aleatorio.
     */
    public static String telefono() {

        String telefonoAleatorio = "+34 ";
        int digito;

        for (int i = 0; i < 9; i++) {

            digito = (int) (Math.random() * (9 + 1));
            telefonoAleatorio += "" + digito;

            if (i == 2 || i == 5) {
                telefonoAleatorio += " ";
            }
        }

        return telefonoAleatorio;
    }

    /**
     * Genera un correo electrónico aleatorio basado en un nombre y apellido
     * aleatorio.
     * 
     * @return Correo electrónico aleatorio.
     */
    public static String correo() {
        String mail = nombre() + apellido() + "@gamil.com"; 
        return mail;
    }

    /**
     * Genera un texto Lorem Ipsum con una cantidad específica de palabras.
     * 
     * @param cantidad Cantidad de palabras a generar.
     * @return Texto Lorem Ipsum generado.
     */
    public static String lorem(int cantidad) {
        String texto = "";

        for (int i = 0; i < String.length; i++) {

        }
        
        return null;
    }

    /**
     * Genera un texto Lorem Ipsum corto (5-10 palabras).
     * 
     * @return Texto Lorem Ipsum corto.
     */
    public static String loremCorto() {
        // TO-DO
        return null;
    }

    /**
     * Genera un texto Lorem Ipsum largo (20-50 palabras).
     * 
     * @return Texto Lorem Ipsum largo.
     */
    public static String loremLargo() {
        // TO-DO
        return null;
    }

    /**
     * Clase main para probar Faker
     * 
     */
    public static void main(String[] args) {

        System.out.println(Faker.entero(5, 100));
        System.out.println(Faker.precio(5.30, 100.32));
        System.out.println(Faker.nombre());
        System.out.println(Faker.apellido());
        System.out.println(Faker.nombreCompleto());
        System.out.println(Faker.edad());

        System.out.println(Faker.telefono());
        
    }

}
