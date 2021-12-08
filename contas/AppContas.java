import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca(123);

        conta.setTaxaOperacao(0.1);
        
        System.out.println(conta);

        conta.deposito(200);
        System.out.println(conta);

        if (conta.saque(100)) {
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println(conta);
    }
}
