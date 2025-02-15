package Relacion02.Universidad;

import java.util.ArrayList;

public class Universidad {

    private ArrayList<Estudiante> estudiantes;

    public Universidad() {
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiantes(Estudiante nuevoEstudiante) {
        estudiantes.add(nuevoEstudiante);
    }

    public void generarEstudiantes (int cantidad) {
        int numeroMatricula = 1;
        
        for (int i = 0; i < cantidad; i++) {
            String nombreNuevo = Faker.nombre();
            int edadNueva = Faker.edad();
            
            Estudiante nuevoEstudiante = new Estudiante(nombreNuevo, edadNueva, numeroMatricula);
            estudiantes.add(nuevoEstudiante);
            numeroMatricula ++;
        }
    }

    public Estudiante buscarEstudiante(int numeroMatricula) {
        Estudiante estudianteBuscado = null;

        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudianteActual = estudiantes.get(i);

            if (estudianteActual.getNumeroMatricula() == numeroMatricula) {
                estudianteBuscado = estudianteActual;
            }
        }

        return estudianteBuscado;
    }

    public String toString() {

        String listadoEstudiantes = "Los estudiantas de la Universidad:\n";

        for (int i = 0; i < estudiantes.size(); i++) {
            listadoEstudiantes += estudiantes.get(i) + "\n";
        }

        return listadoEstudiantes;
    }

}
