
import java.util.Scanner;

public class Bee1003 {  // Main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, soma;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}
