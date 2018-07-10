public class Mesa extends MovelMoveAbstract implements MovelMove {

    private boolean dePedra;


    public boolean isDePedra() {
        return dePedra;
    }

    public void setDePedra(boolean dePedra) {
        this.dePedra = dePedra;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + getId() +
                "tamanho=" + getTamanho() +
                "preco=" + getPreco() +
                ", dePedra=" + dePedra +
                '}';
    }

    @Override
    public double getPreco() {
        return 200;
    }

    @Override
    public Pessoa getPessoa() {
        Pessoa p = new Pessoa();
        p.setNome("HUCK");
        return p;
    }

    @Override
    public void mover(int direita, int equerda) {
        System.out.println(getPessoa().getNome() +" esta movendo");
        System.out.println("Movendo mesa" + direita +" "+ equerda);
    }
}
