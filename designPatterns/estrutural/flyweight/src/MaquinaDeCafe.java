import java.util.HashMap;
import java.util.List;

public abstract class MaquinaDeCafe {
    protected static final HashMap BEBIDAS = new HashMap();

    public MaquinaDeCafe(List<Bebida> listaDeBebidas) {
        for (Bebida x : listaDeBebidas) {
            BEBIDAS.put(x.getNome(), x);
        }
    }

    public static Bebida getInstance(String chave, double preco) {
        Bebida b = (Bebida) BEBIDAS.get(chave);

        if (b == null) {
            b = new Bebida(chave, preco);
            BEBIDAS.put(b.getNome(), b);
            System.out.println("Criando nova instancia");
        } else {
            System.out.println("Objeto ja criado");
        }

        return b;
    }
}
