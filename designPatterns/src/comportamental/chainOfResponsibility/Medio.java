package comportamental.chainOfResponsibility;

public class Medio extends Copo {

    public Medio() {
        this.volume = 500;
    }

    @Override
    protected void encherCopo(String bebida) {
        System.out.println("Enchendo o copo medio: " + bebida);
    }
}
