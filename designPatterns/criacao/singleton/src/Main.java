public class Main {
    public static void main(String[] args) {
        // Moto m1 = new Moto();
        Moto m1 = Moto.getInstance();
        Moto m2 = Moto.getInstance();

        m1.setNome("FAN150");
        m1.setMarca("HONDA");
        m1.setPreco(6000);

        System.out.println(m1.toString());
        System.out.println(m2.toString()); // Mesmo que m2 nao teve valores setados, a variavel pegou os valores de m1 pois é a mesma instancia
    }
}
