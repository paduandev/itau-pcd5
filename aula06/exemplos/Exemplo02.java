package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int resposta;

        resposta = soma(10, 5);
        
        System.out.println(resposta);
    }

    // void = nada = não retorna nenhuma informação
    // int = retorna um valor inteiro
    public static int soma(int n1, int n2) {
        int resultado;

        resultado = n1 + n2;

        return resultado; // devolve o valor desta variável
    }

}
