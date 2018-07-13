public class Mulher extends Pessoa {
    public Mulher(String  nome) {
        this.nome = nome;
        this.sexo = "Feminino";
    }

    @Override
    public String toString() {
        return "Mulher{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
