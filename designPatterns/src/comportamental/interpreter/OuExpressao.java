package comportamental.interpreter;

// Classe que utiliza ExpressaoFinal para implementar o operador "OU LOGICO"
// Se uma das expressoes passadas no contrutor for verdade, interpretador() retornara true
public class OuExpressao implements Expressao {
    private Expressao expr1;
    private Expressao expr2;

    public OuExpressao(Expressao expr1, Expressao expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpretador(String contexto) {
        return expr1.interpretador(contexto) || expr2.interpretador(contexto);
    }
}
