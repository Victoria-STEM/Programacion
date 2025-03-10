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
        double precioFinal = entero((int) min * 100, (int)max * 100) / 100;
        return precioFinal;
    }

    /**
     * Genera un nombre aleatorio.
     *
     * @return Nombre aleatorio.
     */
    public static String nombre() {
        int indiceAleatorio = (int) (Math.random() * (nombres.length - 1));
        String nombreAleatorio = nombres[indiceAleatorio];
        return nombreAleatorio;
    }

    /**
     * Genera un apellido aleatorio.
     *
     * @return Apellido aleatorio.
     */
    public static String apellido() {
        int indiceAleatorio = (int) (Math.random() * (apellidos.length - 1));
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
        telefonoAleatorio += entero(6, 9);

        for (int i = 0; i < 9; i++) {

            telefonoAleatorio += (int) (Math.random() * (9 + 1));
        
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
        String mail = nombre().toLowerCase() + apellido().toLowerCase() + "@gamil.com";
        return mail;
    }

    public static String toTildesCase (String textoConTilde) {

        char[] conTilde = {'á', 'é', 'í', 'ó', 'ú'};
        char[] sinTilde = {'a', 'e', 'i', 'o', 'u'};

        String textoSinTilde = "";

        for (int i = 0; i < textoConTilde.length(); i++) {

            char letraActual = textoConTilde.charAt(i);
            boolean encontrado = false;

            for (int j = 0; j < conTilde.length && !encontrado; j ++) {

                if (letraActual == conTilde[j]) {
                    textoSinTilde += sinTilde[j];
                    encontrado = true;
                }
            }

            if (!encontrado) {
                textoSinTilde += letraActual;

            }
        }
        
        return textoSinTilde;
    }

    /**
     * Genera un texto Lorem Ipsum con una cantidad específica de palabras.
     *
     * @param cantidad Cantidad de palabras a generar.
     * @return Texto Lorem Ipsum generado.
     */
    public static String lorem(int cantidad) {
        String texto = "";

        for (int i = 0; i < cantidad; i++) {
            if (i < (cantidad - 1)) {
                texto += palabrasLorem[i] + " ";
            }
            else {
                texto += palabrasLorem[i] + ".";
            }
        }

        return texto;
    }

    /**
     * Genera un texto Lorem Ipsum corto (5-10 palabras).
     *
     * @return Texto Lorem Ipsum corto.
     */
    public static String loremCorto() {
        String textoCorto = "";
        int cantidadPalabras = (int) (Math.random() * (10 - 5 + 1)) + 5;

        for (int i = 0; i < cantidadPalabras; i++) {
            if (i < (cantidadPalabras - 1)) {
                textoCorto += palabrasLorem[i] + " ";
            }
            else {
                textoCorto += palabrasLorem[i] + ".";
            }
        }

        return textoCorto;
    }

    /**
     * Genera un texto Lorem Ipsum largo (20-50 palabras).
     *
     * @return Texto Lorem Ipsum largo.
     */
    public static String loremLargo() {

        String textoLargo = "";
        int cantidadPalabras = (int) (Math.random() * (50 - 20 + 1)) + 20;

        for (int i = 0; i < cantidadPalabras; i++) {
            if (i < (cantidadPalabras - 1)) {
                textoLargo += palabrasLorem[i] + " ";
            }
            else {
                textoLargo += palabrasLorem[i] + ".";
            }
        }

        return textoLargo;
    }

    /**
     * Clase main para probar Faker
     *
     */
    public static void main(String[] args) {

        System.out.println(entero(0, 100));
        System.out.println(precio(5.30, 100.32));
        System.out.println(nombre());
        System.out.println(apellido());
        System.out.println(nombreCompleto());
        System.out.println(edad());

        System.out.println(telefono());
        System.out.println(correo());
        System.out.println(lorem(10));
        System.out.println(loremCorto());
        System.out.println(loremLargo());
        System.out.println(toTildesCase("María"));
        //System.out.println(apellido().charAt(0));
    }

}
