package comportamental.chainOfResponsibility;

public class Grande extends Copo {

    public Grande() {
        this.volume = 800;
    }

    @Override
    protected void encherCopo(String bebida) {
        System.out.println("Enchendo o copo grande: " + bebida);
    }
}
