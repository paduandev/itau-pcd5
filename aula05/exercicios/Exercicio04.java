package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1, soma, cont;

        soma = 0;
        cont = 1;
        while(numero != 0) {
            System.out.println("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();

            soma = soma + numero;
            cont++;
        }

        System.out.println("Soma = " + soma);

        entrada.close();
    }
    

    
}
