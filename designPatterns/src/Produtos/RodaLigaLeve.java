package Produtos;

public class RodaLigaLeve extends Roda {
    private double preco = 2000;
    private static final String MATERIAL = "Borracha";

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
