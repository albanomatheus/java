import Produtos.Banco;
import Produtos.Combustivel;
import Produtos.Freio;
import Produtos.Roda;

public abstract class CarroFactory { // Classe principal do AbstractFactory, responsável por garantir que qualquer tipo de carro possua os seguintes métodos
    public abstract Roda montarRoda();
    public abstract Banco montarBanco();
    public abstract Freio montarFreio();
    public abstract Combustivel tipoCombustivel();
}
