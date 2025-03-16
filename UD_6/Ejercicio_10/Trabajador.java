public class Trabajador implements Movil, Robot {

    private String modelo;
    private int capacidadBateria;

    public Trabajador (String modelo, int capacidadBateria) {
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
    }

    public String moverser() {
        return "El Robot modelo "+ this.modelo +" con batería " + this.capacidadBateria + "% se desplaza hacia el destino programado.";
    }

    public String realizarTarea() {
        return "El Robot modelo "+ this.modelo +" con batería " + this.capacidadBateria + "% realiza la tarea asignada eficientemente.";
    }

}
