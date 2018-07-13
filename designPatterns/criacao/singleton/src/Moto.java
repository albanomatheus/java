// O singleton garante que apenas uma instancia de uma classe é criada, ou seja, não é possivel ter dois objetos diferentes
public class Moto {
    private String nome;
    private String marca;
    private double preco;

    private static Moto M; // Variavel que armazenara a unica instancia da classe

    private Moto() { // construtor bloqueado

    }

    public static Moto getInstance() { // Metodo que o usuario tera acesso para criar a instancia, se nao existir cria uma nova, se não, devolve a existente
        if(M == null) {
            M = new Moto();
        }
        return M;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
