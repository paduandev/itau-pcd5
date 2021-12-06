package exemplos.exemeplo03;

public class Pessoa {
    // atributos = características
    String nome;
    double altura;

    // método construtor
    // Nome = Nome classe, não pode ter retorno
    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    // métodos = ações
    void apresentar() {
        System.out.println("Olá! eu sou " + nome);
        System.out.println("Tenho altura " + altura);
    }

}
