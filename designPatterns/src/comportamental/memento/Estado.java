package comportamental.memento;

// Classe que tera os objetos registrados
public class Estado {
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Cria um objeto que sera adicionado em uma lista de Registrador
    public Armazenador salvarMomento() {
        return new Armazenador(estado);
    }

    // Atualiza a classe (this) com os dados de armazenador
    public void updateEstadoMemento(Armazenador armazenador) {
        estado = armazenador.getEstato();
    }
}
