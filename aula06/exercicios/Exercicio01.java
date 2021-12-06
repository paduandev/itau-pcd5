package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero = 11;

        if(ehPar(numero)){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

    }

    // return devolve um valor E TERMINA a execução do método
    public static boolean ehPar(int numero) {
        if(numero % 2 == 0) {
            return true;
        }
        return false;
    }

}
