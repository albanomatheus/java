package comportamental.observer;

import java.text.ParseException;

// Design Pattern usado apra executar tarefa em cada objeto presente em uma lista, caso algo aconteça
public class Main {
    public static void main(String[] args) throws ParseException {
        Alarme a = new Alarme("14:55:35");

        new Pessoa("Joao", a);
        new Pessoa("Ana", a);
        new Pessoa("Maria", a);

        while (true) {
            a.dispertar();
        }
    }
}
