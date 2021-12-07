package exercicios.exercicio03;

public class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getDados() {
        return nome + " - " + telefone;
    }
}
