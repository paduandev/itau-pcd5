package exercicios.exercicio03;

public class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome){
        this.nome = nome;
        this.telefone = "() -  ";
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override // indica que este método é uma sobrescrita
              // de um método da superclasse
    public String toString() {
        return nome + " - " + telefone;
    }
}
