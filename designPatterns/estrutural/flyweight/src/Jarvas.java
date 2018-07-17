import java.util.List;

public class Jarvas extends MaquinaDeCafe {

    public Jarvas(List<Bebida> bebidas) {
        super(bebidas);
    }

    @Override
    public String toString() {
        return "Jarvas{" +
                "bebidas=" + BEBIDAS +
                '}';
    }
}
