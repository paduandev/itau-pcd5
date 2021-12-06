package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Programa v0.1");
        linha2(10, '-');

        int n = 25;
        linha2(n, '*');
    }

    static void linha() {
        System.out.println("---------------");
    }
    
    static void linha2(int tamanho, char simbolo) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }
    
    
}