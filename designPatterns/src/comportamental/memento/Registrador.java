package comportamental.memento;

import java.util.ArrayList;
import java.util.List;

// Classe que irá guardar todos os estados que forem passados para add(Armazenador m)
public class Registrador {
    private List<Armazenador> estados = new ArrayList<>();

    public void add(Armazenador m) {
        this.estados.add(m);
    }

    public Armazenador get(int i) {
        return estados.get(i);
    }
}
