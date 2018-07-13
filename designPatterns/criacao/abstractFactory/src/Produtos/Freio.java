package Produtos;

import Contrato.Produto;

public class Freio implements Produto {
    private double preco = 800;
    private static final String MATERIAL = "Metal";

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getMaterial() {
        return MATERIAL;
    }
}
