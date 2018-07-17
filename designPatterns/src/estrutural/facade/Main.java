package estrutural.facade;

public class Main {
    public static void main(String[] args) {
        Ligar ligar = new Ligar();
        int numero = 2322323;

        ligar.celular(numero);
        ligar.orelhao(numero);
        ligar.fixo(numero);
    }
}
