package comportamental.Visitor;

public class Mouse implements Periferico {
    @Override
    public void accept(ComputadorVisitor computadorVisitor) {
        computadorVisitor.visitar(this);
    }
}
