public class Guitarra implements Instrumento {
    
    private String marca;
    private String tipoCuerdas;

    public Guitarra (String marca, String tipoCuerdas) {
        this.marca = marca;
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String tocar() {
        return this.marca + "las pelotas de tipo " + this.tipoCuerdas + " es lo que toca";
    }

    @Override
    public String afinar() {
        return this.marca + "los cojones de tipo " + this.tipoCuerdas + " es lo que afina";
    }

}
