package criacao.abstractFactory;

import criacao.abstractFactory.Produtos.Banco;
import criacao.abstractFactory.Produtos.Combustivel;
import criacao.abstractFactory.Produtos.Freio;
import criacao.abstractFactory.Produtos.Roda;

// Classe que pode ser instaciada e que cumpre os requisitos da classe abstrata. Definindo um tipo de carro
// Cada método retorna o tipo desejado, alocando o mesmo ou um herdeiro
public class CarroPopularFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new Roda();
    }

    @Override
    public Banco montarBanco() {
        return new Banco();
    }

    @Override
    public Freio montarFreio() {
        return new Freio();
    }

    @Override
    public Combustivel tipoCombustivel() {
        return Combustivel.Alcool;
    }
}
