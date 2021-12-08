package modelo;

public class ContaPoupanca extends Conta {
    private double taxaOperacao;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public void setTaxaOperacao(double novaTaxa) {
        taxaOperacao = novaTaxa;
    }

    @Override
    public boolean saque(double valor) {
        if (valor + taxaOperacao <= getSaldo()) {
            return super.saque(valor + taxaOperacao);
        }
        return false; // não tem saldo suficiente na conta
    }

    @Override
    public String toString() {
        return "CP: " + super.toString() + " taxa: " + taxaOperacao;
    }

}
