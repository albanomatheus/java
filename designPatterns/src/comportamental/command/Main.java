package comportamental.command;

public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        ComprarDoStock c = new ComprarDoStock(abcStock);
        VenderDoStock v = new VenderDoStock(abcStock);

        Funcionario f = new Funcionario();

        f.receberOrdem(c);
        f.receberOrdem(v);

        f.trabalhar();
    }
}
