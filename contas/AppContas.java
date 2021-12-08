import modelo.ContaEspecial;

public class AppContas {
    public static void main(String[] args) {
        ContaEspecial conta = new ContaEspecial(123, 100);

        System.out.println(conta);

        conta.deposito(200);
        System.out.println(conta);

        if (conta.saque(300)) {
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println(conta);
    }
}
