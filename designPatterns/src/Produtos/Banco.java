package Produtos;

import Contrato.Produto;

public class Banco implements Produto {
    private double preco = 500;
    private static final String MATERIAL = "Tecido";

    @Override
    public String getMaterial() {
        return MATERIAL;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
