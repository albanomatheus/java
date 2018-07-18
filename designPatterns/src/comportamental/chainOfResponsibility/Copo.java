package comportamental.chainOfResponsibility;

public abstract class Copo {
    protected int volume;
    protected Copo proxCop;

    public void setProxCop(Copo proxCop) {
        this.proxCop = proxCop;
    }

    public void escolherCopo(int qtd, String bebida) {
        if (this.volume > qtd) {
            encherCopo(bebida);
        } else if (proxCop != null) {
            proxCop.escolherCopo(qtd, bebida);
        }
    }

    protected abstract void encherCopo(String bebida);
}
