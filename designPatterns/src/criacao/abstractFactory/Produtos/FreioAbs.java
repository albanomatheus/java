package criacao.abstractFactory.Produtos;

public class FreioAbs extends Freio {
    private double preco = 2000;
    private static final String MATERIAL = "Metal";

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
