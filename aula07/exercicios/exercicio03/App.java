package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alberto", "11 99999-9999");
        Pessoa pessoa2 = new Pessoa("Antonio");
        Estudante estudante = new Estudante("Julio", "14 98765-1234", "Administração");
        Professor prof = new Professor("Larissa", "13 89876-1234", 3000);

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
        System.out.println(estudante.toString());


        System.out.println(prof); // .toString()


    }
}
