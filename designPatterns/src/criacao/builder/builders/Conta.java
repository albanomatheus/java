package criacao.builder.builders;

public class Conta {
    private final int id;
    private final String email;
    private final Nome nome;
    private final Endereco endereco;

    private Conta(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.nome = builder.nome;
        this.endereco = builder.endereco;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Nome getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public static class Builder {
        private int id;
        private String email;
        private Nome nome;

        private Endereco endereco;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder nome(Nome nome) {
            this.nome = nome;
            return this;
        }

        public Builder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nome=" + nome +
                ", endereco=" + endereco +
                '}';
    }
}
