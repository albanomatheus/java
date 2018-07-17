package estrutural.proxy;// Interface que o usuario ira usar para carregar a tabela
// Se t for null, ira fazer a consulta da classe tabela
// Se nao, apenas execurar o metodo mostrar

public class ProxyTabela implements Dado {
    private Tabela t;
    private String nome;

    public ProxyTabela(String nome) {
        this.nome = nome;
    }

    @Override
    public String mostrar() {
        if (t == null) {
            t = new Tabela(nome);
        }

        return t.mostrar();
    }
}
