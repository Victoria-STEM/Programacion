public class Main {
    public static void main(String[] args) {
        Guitarra nuevaGuitarra = new Guitarra("artista", "pelo del culo");
        Piano nuevoPiano = new Piano ("strodorosky", "dientes humanos");

        System.out.println(nuevaGuitarra.afinar());
        System.out.println(nuevoPiano.tocar());
    }
}
