package criacao.abstractFactory;

import criacao.abstractFactory.Produtos.Banco;
import criacao.abstractFactory.Produtos.Combustivel;
import criacao.abstractFactory.Produtos.Freio;
import criacao.abstractFactory.Produtos.Roda;


public class Carro { // Classe que será usada como modelo para o AbstractFactory
    Combustivel combustivel;
    Banco banco;
    Freio freio;
    Roda roda;

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Freio getFreio() {
        return freio;
    }

    public void setFreio(Freio freio) {
        this.freio = freio;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "combustivel=" + combustivel +
                ", banco=" + banco +
                ", freio=" + freio +
                ", roda=" + roda +
                '}';
    }
}
