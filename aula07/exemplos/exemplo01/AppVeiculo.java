package exemplos.exemplo01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("VW", "Gol", -15.5);

        veiculo.exibirDados();
        // veiculo.consumo = -10; // erro! não é mais visível
        veiculo.setConsumo(-20);

        System.out.println("Consumo : " + veiculo.getConsumo());
    }
}
