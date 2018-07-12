package Produtos;

import Contrato.Produto;

public class Roda implements Produto {
    private double preco = 400;
    private static final String MATERIAL = "Borracha";

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getMaterial() {
        return MATERIAL;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
