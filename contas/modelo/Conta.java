package modelo;

public abstract class Conta { // classe abstrata = modelo para outras classes, não pode instanciar objetos
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        // this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor; // saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo -= valor; // saldo = saldo - valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numero + ": " + String.format("R$ %.2f", saldo);
    }
    
}