package criacao.builder;

import criacao.builder.builders.Conta;
import criacao.builder.builders.Endereco;
import criacao.builder.builders.Nome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Nome nome = new Nome.Builder()
                .nome("Matheus")
                .sobrenomes(Arrays.asList("Lucas", "Albano", "Santos"))
                .build();
        System.out.println(nome.toString());

        Endereco endereco = new Endereco.Builder()
                .numeroCasa(87)
                .cidade("Uberlandia")
                .rua("Vasco Mascia")
                .build();
        System.out.println(endereco.toString());

        Conta conta = new Conta.Builder()
                .email("matheus@email.com")
                .endereco(endereco)
                .nome(nome)
                .id(3)
                .build();
        System.out.println(conta.toString());

    }
}
