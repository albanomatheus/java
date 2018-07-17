package estrutural.adapter;

// A classe ...Adapter recebe o objeto a ser adaptado que não possue o metodo necessario para cumprir as regras de determinado contrato
// e implementa o metodo chamando um metodo semelhante da classe a ser adaptada
public class BicicletaAdapter implements Veiculo {
    private Bicicleta b;

    public BicicletaAdapter(Bicicleta b) {
        this.b = b;
    }

    @Override
    public void acelerar() {
        this.b.pedalar();
    }
}
