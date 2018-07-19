package comportamental.memento;

// Classe que tem os mesmos Atributos da classe que será registrada, pois sua funcao é apenas guardar os dados da classe Estado no momento em que for criada
public class Armazenador {
    private String estato;

    public Armazenador(String estato) {
        this.estato = estato;
    }

    public String getEstato() {
        return estato;
    }
}
