package exemplos.exemplo01;

public class Veiculo {
    String marca, modelo;
    private double consumo; // só pode ser usando dentro da classe

    Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
    }

    double obterConsumo() {
        return consumo;
    }

    void alterarConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
