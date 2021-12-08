package exercicios.exercicio03;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salario;
    }

}
