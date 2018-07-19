package comportamental.chainOfResponsibility;

// Classe que implementa a celula
public abstract class Copo {
    protected int volume;
    protected Copo proxCop;

    public void setProxCop(Copo proxCop) {
        this.proxCop = proxCop;
    }

    // Metodo que define se a função será executada na celula atual ou na proxima
    public void escolherCopo(int qtd, String bebida) {
        if (this.volume > qtd) {
            encherCopo(bebida);
        } else if (proxCop != null) {
            proxCop.escolherCopo(qtd, bebida);
        }
    }

    protected abstract void encherCopo(String bebida);
}
