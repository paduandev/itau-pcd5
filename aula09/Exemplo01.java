import java.util.HashMap;

public class Exemplo01 {

    public static void main(String[] args) {
        // < CHAVE, VALOR >
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");

        String resposta = mapa.get(2); // busca a informação da chave 2 dentro do Hash

        System.out.println(resposta);

        System.out.println(mapa.get(4));

        if(mapa.get(4) != null) {
            System.err.println("Achou");
        } else {
            System.out.println("Não achou");
        }

    }
    
}