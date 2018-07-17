package estrutural.facade;

public class Fixo implements Telefone {
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero + " por fixo");
    }
}