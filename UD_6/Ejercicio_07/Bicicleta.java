public class Bicicleta implements Transporte {

    @Override
    public String arrancar() {
        return "La bicicleta arranca.";
    }

    @Override
    public String detener() {
        return "La bicicleta se detiene.";
    }

    @Override
    public String toString() {
        return arrancar() + "\n" + detener();
    }
}
