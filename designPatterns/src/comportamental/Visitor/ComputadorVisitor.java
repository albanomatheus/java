package comportamental.Visitor;

public interface ComputadorVisitor {
    void visitar(Computador computador);
    void visitar(Mouse mouse);
    void visitar(Teclado teclado);
    void visitar(Monitor monitor);
}
