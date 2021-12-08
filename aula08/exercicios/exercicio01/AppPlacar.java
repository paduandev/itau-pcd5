package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Santos", "Palmeiras");
        Placar placar3 = new Placar("Santos", "Palmeiras", 2, 1);

        System.out.println(placar1.getPlacar());
        System.out.println(placar2.getPlacar());
        System.out.println(placar3.getPlacar());
    }
}
