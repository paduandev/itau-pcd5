package dados;

import java.util.HashMap;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class GerenciaContasHash {
    private HashMap<Integer, Conta> mapaDeContas;

    public GerenciaContasHash() {
        mapaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        mapaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }


    public String getSaldo(int numeroConta) {
        Conta contaEncontrada = mapaDeContas.get(numeroConta);

        if(contaEncontrada != null) {
            return contaEncontrada.toString();
        }
        return "Conta não encontrada.";


    }

    public boolean deposito(int numeroConta, double valor) {
        Conta contaEncontrada = mapaDeContas.get(numeroConta);

        if(contaEncontrada != null) {
            return contaEncontrada.deposito(valor);
        }
        return false;
    }

    public boolean saque(int numeroConta, double valor) {
        Conta contaEncontrada = mapaDeContas.get(numeroConta);

        if(contaEncontrada != null) {
            return contaEncontrada.saque(valor);
        }

        return false; 
    }

}
