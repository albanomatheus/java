package builders;

import java.util.List;

public class Nome {
    private final String nome;
    private final List<String> sobrenomes;

    private Nome(Builder builder) {
        this.nome = builder.nome;
        this.sobrenomes = builder.sobrenomes;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getSobrenomes() {
        return sobrenomes;
    }

    public static class Builder {
        private String nome;
        private List<String> sobrenomes;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder sobrenomes(List<String> sobrenomes) {
            this.sobrenomes = sobrenomes;
            return this;
        }

        public Nome build() {
            return new Nome(this);
        }
    }

    @Override
    public String toString() {
        return "Nome{" +
                "nome='" + nome + '\'' +
                ", sobrenomes=" + sobrenomes +
                '}';
    }
}
