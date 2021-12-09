package modelo;

public class ContaPoupanca extends Conta {
    private static double taxaOperacao = 0.2; // static = atributo da classe e não de cada objeto

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxaOperacao(double novaTaxa) { // static método da classe
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
