package comportamental.strategy;

// Design Pattern usado para alterar o comportamento de um objeto em tempo de execução
public class Main {
    public static void main(String[] args) {
        Contexto c = new Contexto(new Somar());
        System.out.println("Operacao entre 10 e 3: " + c.executar(10, 3));

        c = new Contexto(new Subtrair());
        System.out.println("Operacao entre 10 e 3: " + c.executar(10, 3));

        c = new Contexto(new Multiplicar());
        System.out.println("Operacao entre 10 e 3: " + c.executar(10, 3));

        c = new Contexto(new Dividir());
        System.out.println("Operacao entre 10 e 3: " + c.executar(10, 3));
    }
}
