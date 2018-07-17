package criacao.abstractFactory;

import criacao.abstractFactory.Produtos.Banco;
import criacao.abstractFactory.Produtos.Combustivel;
import criacao.abstractFactory.Produtos.Freio;
import criacao.abstractFactory.Produtos.Roda;

public abstract class CarroFactory { // Classe principal do AbstractFactory, responsável por garantir que qualquer tipo de carro possua os seguintes métodos
    public abstract Roda montarRoda();
    public abstract Banco montarBanco();
    public abstract Freio montarFreio();
    public abstract Combustivel tipoCombustivel();
}
