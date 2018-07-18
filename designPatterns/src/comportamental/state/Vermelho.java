package comportamental.state;

public class Vermelho implements Sinal {
    @Override
    public void acao(Contexto contexto) {
        System.out.println("Parar");
        contexto.setSinal(this);
    }
}
