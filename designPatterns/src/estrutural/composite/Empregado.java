package estrutural.composite;

import java.util.ArrayList;
import java.util.List;

// Classe que será o nó de uma arvóre genérica, contendo os empregados subordinados como filhos
public class Empregado {
    private String nome;
    private String cargo;
    private int salario;

    List<Empregado> subordinados;

    public Empregado(String nome, String cargo, int salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.subordinados = new ArrayList<>();
    }

    public void addSubordinado(Empregado e) {
        this.subordinados.add(e);
    }

    public void removeSubordinado(Empregado e) {
        this.subordinados.remove(e);
    }

    public List<Empregado> getSubordinados() {
        return subordinados;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", subordinados=" + subordinados +
                '}';
    }
}
