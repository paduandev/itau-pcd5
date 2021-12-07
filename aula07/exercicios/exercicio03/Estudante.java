package exercicios.exercicio03;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
    }

    public String getDados() {
        return super.getDados() + " - " + curso;
    }

}
