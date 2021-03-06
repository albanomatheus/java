package comportamental.interpreter;

// Classe que utiliza ExpressaoFinal para implementar o "E LOGICO"
// Se as duas expressoes passadas no contrutor forem verdades, interpretador() retornara true
public class EExpressao implements Expressao {
    private Expressao expr1;
    private Expressao expr2;

    public EExpressao(Expressao expr1, Expressao expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpretador(String contexto) {
        return expr1.interpretador(contexto) && expr2.interpretador(contexto);
    }
}
