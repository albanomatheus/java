package comportamental.command;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private List<Ordem> ordemList = new ArrayList<>();

    public void receberOrdem(Ordem ordem) {
        this.ordemList.add(ordem);
    }

    public void trabalhar() {
        for (Ordem o: ordemList) {
            o.excutar();
        }
        ordemList.clear();
    }
}
