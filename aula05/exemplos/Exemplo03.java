package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // int cont;

        for (int cont = 1; cont < 10; cont++) { // cont é local ao for (só existe aqui)
            System.out.println(cont);
        }

        // System.out.println("Final " + cont); // aqui o 'cont' não é visivel
    }

}
