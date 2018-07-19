package comportamental.Visitor;

public class Teclado implements Periferico {
    @Override
    public void accept(ComputadorVisitor computadorVisitor) {
        computadorVisitor.visitar(this);
    }
}
