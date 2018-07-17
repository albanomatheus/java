package estrutural.adapter;

public class Main {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus();
        Veiculo carro = new Carro();
        Veiculo bicicleta = new BicicletaAdapter(new Bicicleta());

        onibus.acelerar();
        carro.acelerar();
        bicicleta.acelerar();
    }
}
