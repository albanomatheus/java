package comportamental.state;

public class Amarelo implements Sinal {
    @Override
    public void acao(Contexto contexto) {
        System.out.println("Ir");
        contexto.setSinal(this);
    }
}
