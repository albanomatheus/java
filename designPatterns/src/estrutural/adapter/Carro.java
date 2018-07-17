package estrutural.adapter;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }
}
