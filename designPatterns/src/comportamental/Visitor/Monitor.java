package comportamental.Visitor;

public class Monitor implements Periferico {
    @Override
    public void accept(ComputadorVisitor computadorVisitor) {
        computadorVisitor.visitar(this);
    }
}
