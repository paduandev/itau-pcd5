package exemplos.exemplo01;

public class Veiculo {
    private String marca, modelo;
    private double consumo; // só pode ser usando dentro da classe

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
    }

    // get = obter o valor do atributo
    public double getConsumo() {
        return consumo;
    }

    // set = alterar o valor do atributo
    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
