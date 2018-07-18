package comportamental.interpreter;

public class Main {
    public static OuExpressao saoHomens() {
        Expressao joao = new ExpressaoFinal("Joao");
        Expressao pedro = new ExpressaoFinal("Pedro");

        return new OuExpressao(joao, pedro);
    }

    public static EExpressao casada() {
        Expressao maria = new ExpressaoFinal("Maria");
        Expressao casada = new ExpressaoFinal("casada");

        return new EExpressao(maria, casada);
    }

    public static void main(String[] args) {
        Expressao eHomem = saoHomens();
        Expressao eCasada = casada();

        System.out.println(eHomem.interpretador("Joao"));
        System.out.println(eCasada.interpretador("casada Maria"));
    }
}
