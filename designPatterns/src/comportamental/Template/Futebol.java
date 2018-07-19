package comportamental.Template;

public class Futebol extends Esporte {
    @Override
    public void iniciar() {
        System.out.println("COMEÇAAAAAAAA O JOGO");
    }

    @Override
    public void intervalo() {
        System.out.println("HORA DA ÁGUA");
    }

    @Override
    public void terminar() {
        System.out.println("APITA O JUIZ, TERMINA O JOGO");
    }
}
