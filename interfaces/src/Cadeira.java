public class Cadeira extends MovelMoveAbstract{

    private int qtdPernas;
    private boolean possuiRodinhas;

    public int getQtdPernas() {
        return qtdPernas;
    }

    public void setQtdPernas(int qtdPernas) {
        this.qtdPernas = qtdPernas;
    }

    public boolean isPossuiRodinhas() {
        return possuiRodinhas;
    }

    public void setPossuiRodinhas(boolean possuiRodinhas) {
        this.possuiRodinhas = possuiRodinhas;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "id=" + getId() +
                "tamanho=" + getTamanho() +
                "preco=" + getPreco() +
                ", qtdPernas=" + qtdPernas +
                ", possuiRodinhas=" + possuiRodinhas +
                '}';
    }

    @Override
    public double getPreco() {
        return 100;
    }

    @Override
    public boolean possuiSelo() {
        return teste();
    }

    private boolean teste() {
        //testa
        return false;
    }

    @Override
    public void mover(int direita, int equerda) {
        System.out.println(getPessoa().getNome() +" esta movendo");
        System.out.println("Movendo cadeira" + direita +" "+ equerda);
    }
}
