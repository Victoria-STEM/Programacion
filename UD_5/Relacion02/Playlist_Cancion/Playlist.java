import java.util.ArrayList;

public class Playlist {
    
    public ArrayList<Cancion> listaCanciones;

    public Playlist () {
        this.listaCanciones = new ArrayList<Cancion>();
    }

    public void agregarCanciones(Cancion nuevaCancion) {
        listaCanciones.add(nuevaCancion);
    }

    public int contarDuracionTotalCanciones() {
        int duracionTotal = 0;
        
        for (int i = 0; i < listaCanciones.size(); i++) {
            duracionTotal += listaCanciones.get(i).getDuracion();
        }
        
        return duracionTotal;
    }

    public String toString() {

        String listaCancionesActual = "Lista completa:\n";
        
        for (int i = 0; i < listaCanciones.size(); i++) {
            listaCancionesActual += listaCanciones.get(i) + "\n";
        }

        return listaCancionesActual;
    }
}
