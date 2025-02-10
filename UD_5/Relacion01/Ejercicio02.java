package Relacion01;

class CuentaBancaria {

    private String titular;
    private int saldo;

    public CuentaBancaria (String titular, int saldo) {
        this.setTitular(titular);
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    // public void setSaldo(int saldo) {
    //     this.saldo = saldo;
    // }

    public int getSaldo() {
        return this.saldo;
    }

    public void depositar (int cantidad) {

        if (cantidad < 0) {
            cantidad *= -1;
        }

        this.saldo += cantidad;
        // setSaldo(saldoActualizado);
    }

    public void retirar (int cantidad) {

        if (cantidad < this.saldo) {
            this.saldo += cantidad;
        }
        
        if (cantidad > 0) {
            cantidad *= -1;
        }

    }

}

public class Ejercicio02 {
    public static void main(String[] args) {
        
        CuentaBancaria carlos = new CuentaBancaria("Carlos", 346);
        System.out.println(carlos.getTitular());
        System.out.println(carlos.getSaldo());

        carlos.depositar(-245);
        System.out.println(carlos.getSaldo());

        carlos.retirar(3607);
        System.out.println(carlos.getSaldo());

    }
}
