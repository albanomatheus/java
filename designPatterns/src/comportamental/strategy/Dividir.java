package comportamental.strategy;

public class Dividir implements Calculadora {

    @Override
    public double calcular(double n1, double n2) {
        return n1 / n2;
    }
}
