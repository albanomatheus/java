package comportamental.strategy;

// Classe que armazena qualquer Objeto que assina "Calculadora" e possue o metodo executar()
// Esse metodo executa outro metodo de acordo com o objeto armazenado
public class Contexto {
    private Calculadora c;

    public Contexto(Calculadora c) {
        this.c = c;
    }

    public double executar(double n1, double n2) {
        return c.calcular(n1, n2);
    }
}
