package Relacion01;

class Circulo {
    
    private double radio;
    
    public Circulo (double radio) {
        this.setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public double calcular_area() {
        double area = (this.radio * this.radio) * 3.14;
        return area;
    }

    public double calcular_perimetro() {
        double perimetro = this.radio * 3.14 * 2;
        return perimetro;
    }

}

public class Ejercicio01 {
    public static void main(String[] args) {
        
        Circulo uno = new Circulo(20);
        System.out.println(uno.calcular_area());
        System.out.println(uno.calcular_perimetro());

    }
}
