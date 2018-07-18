package comportamental.command;

public class VenderDoStock implements Ordem {
    private Stock stock;

    public VenderDoStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void excutar() {
        this.stock.vender();
    }
}
