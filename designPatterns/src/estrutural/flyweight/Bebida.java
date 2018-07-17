package estrutural.flyweight;

public class Bebida {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String des() {
        return "Bebida: " + this.nome + " preço: " + this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
