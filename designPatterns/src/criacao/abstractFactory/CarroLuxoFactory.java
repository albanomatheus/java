package criacao.abstractFactory;

import criacao.abstractFactory.Produtos.*;

// Classe que pode ser instaciada e que cumpre os requisitos da classe abstrata. Definindo um tipo de carro
// Cada método retorna o tipo desejado, alocando o mesmo ou um herdeiro
public class CarroLuxoFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Banco montarBanco() {
        return new BancoCouro();
    }

    @Override
    public Freio montarFreio() {
        return new FreioAbs();
    }

    @Override
    public Combustivel tipoCombustivel() {
        return Combustivel.Flex;
    }
}
