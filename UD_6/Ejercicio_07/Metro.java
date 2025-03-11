public class Metro implements Transporte{

    @Override
    public String arrancar() {
        return "El metro arranca con 5 vagones.";
    }

    @Override
    public String detener() {
        return "El metro se detiene.";
    }

    @Override
    public String toString() {
        return arrancar() + "\n" + detener();
    }

}
