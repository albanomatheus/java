package comportamental.Template;

public class Basquete extends Esporte {
    @Override
    public void iniciar() {
        System.out.println("SOBE A BOLA");
    }

    @Override
    public void intervalo() {
        System.out.println("HORA DE ARRUMAR A CASA");
    }

    @Override
    public void terminar() {
        System.out.println("ESTOURA O CRONOMETRO, FIM DE PAPO");
    }
}
