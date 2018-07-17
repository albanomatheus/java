package estrutural.flyweight;

import java.util.HashMap;

// Interface que disponibiliza a função getInstance, que recebe o nome(chave) e preço da bebida, verifica se ja existe na Hash BEBIDAS
// Se não, cria um novo objeto com o nome e o preço recebidos e insere na hash e depois retorna-o
// Se sim, apenas retorna o existente sem alterar valores
public abstract class MaquinaDeCafe {
    protected static final HashMap BEBIDAS = new HashMap();

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
