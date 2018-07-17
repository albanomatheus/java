package criacao.abstractFactory.Produtos;

public class BancoCouro extends Banco {
    private double preco = 2000;
    private static final String MATERIAL = "Couro";

    @Override
    public String getMaterial() {
        return MATERIAL;
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
