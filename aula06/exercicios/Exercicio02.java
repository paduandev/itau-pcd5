package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, resp;

        System.out.println("Digite 3 número inteiros:");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        resp = menor(num1, num2, num3);
        System.out.println("O menor numero é " + resp);
        
        System.out.println("O menor numero é " + menor2(num1, num2, num3));

        entrada.close();
    }

    public static int menor(int n1, int n2, int n3) {
        int resposta;

        if (n1 <= n2 && n1 <= n3) {
            resposta = n1;
        } else {
            if (n2 <= n1 && n2 <= n3) {
                resposta = n2;
            } else {
                resposta = n3;
            }
        }

        return resposta;
    }

    public static int menor2(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            return n1;
        }
        if (n2 <= n1 && n2 <= n3) {
            return n2;
        }
        return n3;
    }

}
