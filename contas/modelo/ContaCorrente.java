package modelo;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= getSaldo()) {
            return super.saque(valor);
        }
        return false; // não tem saldo suficiente na conta
    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "CC: " + super.toString();
    }

}
