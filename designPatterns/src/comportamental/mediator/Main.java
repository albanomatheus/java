package comportamental.mediator;

// Desing Pattern que faz com que varios objetos modificam/utilizam uma mesma instancia de um metodo de outra classe
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Joao");
        Usuario u2 = new Usuario("Marcos");

        u1.enviarMsg("oi");
        u2.enviarMsg("ola, tudo bem?");
    }
}
