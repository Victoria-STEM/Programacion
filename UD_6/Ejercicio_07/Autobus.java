public class Autobus implements Transporte {
    
    private String marca;
    private String horaSalida;
    private String horaLLegada;

    public Autobus (String marca, String horaSalida, String horaLLegada) {
        this.marca = marca;
        this.horaSalida = horaSalida;
        this.horaLLegada = horaLLegada;
    }
    
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    
    // --------------------------- METODOS --------------------------- //


    @Override
    public String arrancar() {
        return "La autobus " + this.marca + " sale a las " + getHoraSalida() + " de la mañana.";
    }

    @Override
    public String detener() {
        return "La autobus " + this.marca + " se detiene a las " + getHoraLLegada() + " de la noche.";
    }

    @Override
    public String toString() {
        return arrancar() + "\n" + detener();
    }

}
