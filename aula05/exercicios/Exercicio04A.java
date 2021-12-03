package exercicios;

import java.util.Scanner;

public class Exercicio04A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1, soma;

        soma = 0;
        for (int cont = 1; numero != 0; cont++) {
            System.out.println("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();

            soma = soma + numero;
        }

        System.out.println("Soma = " + soma);

        entrada.close();
    }

}
