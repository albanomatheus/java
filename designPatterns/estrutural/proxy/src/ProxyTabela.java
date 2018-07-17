public class ProxyTabela implements Dado{
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
