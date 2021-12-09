import java.util.ArrayList;
import java.util.Scanner;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroConta;
        double limite;

        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        ArrayList<Conta> contas = new ArrayList<>();

        while (opcao != 7) {

            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Nova Conta Poupança");
            System.out.println("4- Depositar");
            System.out.println("5- Sacar");
            System.out.println("6- Consultar Saldo");
            System.out.println("7- Sair");
            System.out.print("Sua opção => ");

            opcao = teclado.nextInt();

            switch (opcao) { // if / else / if / else ....
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break; // interromper

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    contas.add(ce);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    contas.add(cp);
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    // for (int i = 0; i < contas.size(); i++) {
                    //     if(contas.get(i).getNumero() == numeroConta) {
                    //         System.out.println(contas.get(i));
                    //         break; // interrompe o for
                    //     }
                    // }

                    //foreach = para cada valor da estrutura
                    for (Conta conta : contas) { // Para cada "conta" que está na estrutura "contas"
                        if(conta.getNumero() == numeroConta) {
                            System.out.println(conta);
                            break;
                        }
                    }
                    
                    break;

                case 7:
                    break;

                default: // se não for nenhum dos outros casos
                    System.out.println("Opção inválida!");
                    break;
            }

        }

        teclado.close();
    }
}
