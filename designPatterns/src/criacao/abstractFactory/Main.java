package criacao.abstractFactory;

public class Main {
    // Metodo responsável por identificar o tipo de carro a ser instanciado
    // Depois inserir cada objeto dentro de carro, de acordo com o tipo de fabrica escolhida
    public static Carro montarCarro(String tipo) {
        CarroFactory cf = null;

        switch (tipo) {
            case "luxo":
                cf = new CarroLuxoFactory();
                break;
            case "simples":
                cf = new CarroPopularFactory();
                break;
            default:
                break;
        }

        Carro c = new Carro();

        c.setRoda(cf.montarRoda());
        c.setBanco(cf.montarBanco());
        c.setFreio(cf.montarFreio());
        c.setCombustivel(cf.tipoCombustivel());

        return c;
    }

    public static void main(String[] args) {
        Carro luxo = montarCarro("luxo");
        Carro popular = montarCarro("simples");

        System.out.println("luxo: " + luxo.toString());
        System.out.println("popular: " + popular.toString());

        System.out.println("Preço freio luxo: " + luxo.getFreio().getPreco());
        luxo.getFreio().setPreco(20);
        System.out.println("Preço freio luxo: " + luxo.getFreio().getPreco());

        System.out.println("Material banco luxo: " + luxo.getBanco().getMaterial());
    }
}