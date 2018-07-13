public class Main {
    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryPessoa();
        Pessoa p1 = factory.getPessoa("Joao", "m");
        Pessoa p2 = factory.getPessoa("Maria", "f");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
