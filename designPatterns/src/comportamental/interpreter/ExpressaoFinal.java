package comportamental.interpreter;

// Classe que armazena a regra de negocio que define verdadeiro ou falso
public class ExpressaoFinal implements Expressao {
    private String data;

    public ExpressaoFinal(String data) {
        this.data = data;
    }

    @Override
    public boolean interpretador(String contexto) {
        return contexto.contains(data);
    }
}
