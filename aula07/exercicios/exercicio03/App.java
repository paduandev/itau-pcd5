package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alberto", "11 99999-9999");
        Estudante estudante = new Estudante("Julio", "14 98765-1234", "Administração");
        Professor prof = new Professor("Larissa", "13 89876-1234", 3000);

        System.out.println(pessoa.getDados());
        System.out.println(estudante.getDados());
        System.out.println(prof.getDados());


    }
}
