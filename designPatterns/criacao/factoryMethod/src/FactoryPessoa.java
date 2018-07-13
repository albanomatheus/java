public class FactoryPessoa {
    public Pessoa getPessoa(String nome, String sexo) {
        switch (sexo) {
            case "m": return new Homem(nome);
            case "f": return new Mulher(nome);
            default: return null;
        }
    }
}
