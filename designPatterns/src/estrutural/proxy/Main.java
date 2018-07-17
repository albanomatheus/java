package estrutural.proxy;

public class Main {
    public static void main(String[] args) {
        Dado dado = new ProxyTabela("tabela.txt");

        dado.mostrar(); // carregada do banco
        System.out.println("");
        dado.mostrar(); // carregada pelo proxy, nao consultou o banco
    }
}
