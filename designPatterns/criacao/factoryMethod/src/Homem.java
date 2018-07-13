public class Homem extends Pessoa {
    public Homem(String  nome) {
        this.nome = nome;
        this.sexo = "Masculino";
    }

    @Override
    public String toString() {
        return "Homem{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
