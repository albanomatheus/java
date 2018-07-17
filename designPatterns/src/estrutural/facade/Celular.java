package estrutural.facade;

public class Celular implements Telefone {
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero + " por celular");
    }
}
