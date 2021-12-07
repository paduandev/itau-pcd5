package exercicios.exercicio01;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 2, 34);

        System.out.println(relogio.getHoraAtual());

        relogio.setHora(500);

        System.out.println(relogio.getHoraAtual());
    }
}
