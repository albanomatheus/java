package estrutural.facade;

public class Orelhao implements Telefone {
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero + " por orelhao");
    }
}
