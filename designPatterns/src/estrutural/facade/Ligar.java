package estrutural.facade;

// Classe que fará a interface para o usuario escolher qual objeto usar atraves de metodos
public class Ligar {
    // Objetos que pussem o metodo ligar, agrupados pela interface Telefone
    private Celular celular;
    private Orelhao orelhao;
    private Fixo fixo;

    public Ligar() {
        this.celular = new Celular();
        this.orelhao = new Orelhao();
        this.fixo = new Fixo();
    }


    public void celular(int numero) {
        this.celular.ligar(numero);
    }

    public void orelhao(int numero) {
        this.orelhao.ligar(numero);
    }

    public void fixo(int numero) {
        this.fixo.ligar(numero);
    }
}
