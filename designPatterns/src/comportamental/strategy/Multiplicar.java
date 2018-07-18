package comportamental.strategy;

public class Multiplicar implements Calculadora {

    @Override
    public double calcular(double n1, double n2) {
        return n1 * n2;
    }
}
