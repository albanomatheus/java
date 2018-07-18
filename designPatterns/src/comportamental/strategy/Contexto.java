package comportamental.strategy;

public class Contexto {
    private Calculadora c;

    public Contexto(Calculadora c) {
        this.c = c;
    }

    public double executar(double n1, double n2) {
        return c.calcular(n1, n2);
    }
}
