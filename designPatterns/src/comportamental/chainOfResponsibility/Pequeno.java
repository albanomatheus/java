package comportamental.chainOfResponsibility;

public class Pequeno extends Copo {

    public Pequeno() {
        this.volume = 300;
    }

    @Override
    protected void encherCopo(String bebida) {
        System.out.println("Enchendo o copo pequeno: " + bebida);
    }
}
