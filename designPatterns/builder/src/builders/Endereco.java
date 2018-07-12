package builders;

// A classe possue um contrutor que recebe um objeto e atribiu os valores presentes nele à seus atributos
public class Endereco {
    private final String rua;
    private final int numeroCasa;
    private final String cidade;

    public Endereco(Builder builder) {
        this.rua = builder.rua;
        this.numeroCasa = builder.numeroCasa;
        this.cidade = builder.cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    // Esse objeto possue os mesmo campos da classe principal e metodos com o mesmo nome
    // Cada metodo retorna o objeto de acordo com o estado atual, com os atributos atualizados
    // O objeto possue tambem um metodo que retorna uma instancia da classe principal, responsavel para instacia a classe na main
    public static class Builder {
        private String rua;
        private int numeroCasa;
        private String cidade;

        public Builder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public Builder numeroCasa(int numeroCasa) {
            this.numeroCasa = numeroCasa;
            return this;
        }

        public Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numeroCasa=" + numeroCasa +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
