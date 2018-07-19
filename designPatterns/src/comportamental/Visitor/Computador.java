package comportamental.Visitor;

public class Computador implements Periferico {
    Periferico[] partes;

    public Computador() {
        this.partes = new Periferico[]{new Mouse(), new Teclado(), new Monitor()};
    }

    @Override
    public void accept(ComputadorVisitor computadorVisitor) {
        for (int i = 0; i < partes.length; i++) {
            partes[i].accept(computadorVisitor);
        }

        computadorVisitor.visitar(this);
    }
}
