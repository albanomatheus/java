package estrutural.proxy;

// Classe que realiza a "consulta" no banco e carrega a tabela
public class Tabela implements Dado {
    private String nome;

    public Tabela(String nome) {
        this.nome = nome;
        carregaTabela(nome);
    }

    public void carregaTabela(String nome) {
        System.out.println("Carregando tabela: " + nome);
    }

    @Override
    public String mostrar() {
        return "Tabela{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
