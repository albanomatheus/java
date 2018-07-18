package comportamental.state;

public class Main {
    public static void main(String[] args) {
        Contexto c = new Contexto();

        Sinal verde = new Verde();
        verde.acao(c);
        System.out.println(c.getSinal().toString());

        Sinal amarelo = new Amarelo();
        amarelo.acao(c);
        System.out.println(c.getSinal().toString());

        Sinal vermelho = new Vermelho();
        vermelho.acao(c);
        System.out.println(c.getSinal().toString());

    }
}
