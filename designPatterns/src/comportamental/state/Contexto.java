package comportamental.state;

// Classe que armazena o objeto, esse objeto define a ideia de contexto/estado
public class Contexto {
    private Sinal sinal;

    public Sinal getSinal() {
        return sinal;
    }

    public void setSinal(Sinal sinal) {
        this.sinal = sinal;
    }
}
