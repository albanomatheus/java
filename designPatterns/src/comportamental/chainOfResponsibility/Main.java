package comportamental.chainOfResponsibility;

public class Main {
    private static Copo encadearCopos() {
        Copo p = new Pequeno();
        Copo m = new Medio();
        Copo g = new Grande();

        p.setProxCop(m);
        m.setProxCop(g);

        return p;
    }


    public static void main(String[] args) {
        Copo c = encadearCopos();

        c.escolherCopo(250, "Agua");
        c.escolherCopo(400, "Cafe");
        c.escolherCopo(700, "Cerveja");
    }
}
