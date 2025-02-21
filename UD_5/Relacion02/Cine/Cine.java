import java.util.ArrayList;

public class Cine {

    private ArrayList<Pelicula> listaPeliculas;

    public Cine() {
        this.listaPeliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula nuevaPelicua) {
        listaPeliculas.add(nuevaPelicua);
    }

    public String mostrarListaPeliculas() {
        return toString();
    }

    public Pelicula buscarPelicula (String titulo) {
        Pelicula peliculaBuscada = null;
        boolean encontrada = false;

        for (int i = 0; i < listaPeliculas.size() && !encontrada; i++) {
            if (listaPeliculas.get(i).getTitulo() == titulo) {
                peliculaBuscada = listaPeliculas.get(i);
                encontrada = true;
            }
        }
        return peliculaBuscada;
    }

    public double calcularDuracionMedia () {
        int sumatorioDuracion = 0;
        for (int i = 0; i < listaPeliculas.size(); i++) {
            sumatorioDuracion += listaPeliculas.get(i).getDuracion();
        }
        double duracionMedia = (double) sumatorioDuracion / listaPeliculas.size();
        return duracionMedia; 
    }

    public String toString() {
        String listaDePeliculas = "Listas pelicuas: \n";
        for (int i = 0; i < listaPeliculas.size(); i++) {
            listaDePeliculas += listaPeliculas.get(i).toString() + "\n";
        }
        return listaDePeliculas;
    }
}
