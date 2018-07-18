package comportamental.command;

public class ComprarDoStock implements Ordem {
    private Stock stock;

    public ComprarDoStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void excutar() {
        this.stock.comprar();
    }
}
