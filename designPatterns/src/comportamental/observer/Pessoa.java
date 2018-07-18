package comportamental.observer;

public class Pessoa {
    private String nome;
    private Alarme a;

    public Pessoa(String nome, Alarme a) {
        this.nome = nome;
        this.a = a;
        this.a.addObs(this);
    }

    public void alertar() {
        System.out.println("DISPERTANDO PARA O " + this.nome);
    }
}
