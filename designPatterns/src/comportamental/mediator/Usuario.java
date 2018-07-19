package comportamental.mediator;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo que faz qualquer objeto desta classe utilizar o metodo mostrarMsg de ChatRoom
    public void enviarMsg(String msg) {
        ChatRoom.mostrarMsg(this, msg);
    }
}
