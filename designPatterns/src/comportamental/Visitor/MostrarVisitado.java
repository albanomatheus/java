package comportamental.Visitor;

public class MostrarVisitado implements ComputadorVisitor {
    @Override
    public void visitar(Computador computador) {
        System.out.println("Visitando computador");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Visitando mouse");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Visitando teclado");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Visitando monitor");
    }
}
