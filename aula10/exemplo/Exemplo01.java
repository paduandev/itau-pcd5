package exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String entrada;

        try {
            System.out.println("Digite um número:");
            // numero = teclado.nextInt();
            entrada = teclado.nextLine(); 
            numero = Integer.parseInt(entrada); // transforme o texto "entrada" em número inteiro
            System.out.println("Você digitou " + numero);
        } catch (InputMismatchException e) { // capturar o erro (Exception)
            System.out.println("Valor inválido.");
        } catch(NumberFormatException e) {
            System.out.println("Erro de conversão.");
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Erro.");
        } finally {
            System.out.println("Fechando...");
            teclado.close();
        }

        System.out.println("Fim do programa.");

        
    }
    
}