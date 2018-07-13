import Produtos.Banco;
import Produtos.Combustivel;
import Produtos.Freio;
import Produtos.Roda;

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
