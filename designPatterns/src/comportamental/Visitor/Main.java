package comportamental.Visitor;

// Design Pattern que executa um metodo de acordo com o parametro passado
public class Main {
    public static void main(String[] args) {

        Computador computer = new Computador();
        computer.accept(new MostrarVisitado());
    }
}
