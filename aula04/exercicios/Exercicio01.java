package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        if(numero > 20) {
            // metade = numero / 2.0; // transforma o 2 em double 2.0
            metade = (double) numero / 2; // casting = conversão de tipo, não muda o tipo que foi criado
            System.out.println("Metade = " + metade);
            // System.out.println("Metade = " + ((double) numero / 2));
        }

        entrada.close();
    }
}
