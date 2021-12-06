package exemplos.exemeplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 1.72);
        Pessoa p2 = new Pessoa("Ana Paula", 1.83);

        // p1.nome = "Carlos";
        // p1.altura = 1.72;
        p1.apresentar();

        // p2.nome = "Ana Paula";
        // p2.altura = 1.83;
        p2.apresentar();

    }
}
