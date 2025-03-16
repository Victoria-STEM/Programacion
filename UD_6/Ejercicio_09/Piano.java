public class Piano implements Instrumento{

    private String marca;
    private String tipoTeclas;

    public Piano (String marca, String tipoTeclas) {
        this.marca = marca;
        this.tipoTeclas = tipoTeclas;
    }

    @Override
    public String tocar() {
        return this.marca + "las pelotillas de tipo " + this.tipoTeclas + " es lo que toca";
    }

    @Override
    public String afinar() {
        return this.marca + "los cojoncilloss de tipo " + this.tipoTeclas + " es lo que afina";
    }

}
