package comportamental.command;

import java.util.ArrayList;
import java.util.List;

// Objeto que ira executar os metodos passados em receberOrdem  quando trabalhar for chamado
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
