package comportamental.state;

public class Verde implements Sinal {
    @Override
    public void acao(Contexto contexto) {
        System.out.println("Ir");
        contexto.setSinal(this);
    }
}
