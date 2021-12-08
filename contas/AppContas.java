import modelo.Conta;

public class AppContas {
    public static void main(String[] args) {
        Conta conta = new Conta(123);

        System.out.println(conta);
        
        conta.deposito(200);
        System.out.println(conta);
        
        conta.saque(100);
        System.out.println(conta);
    }
}
