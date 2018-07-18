package comportamental.command;

public class Stock {
    private String nome = "ABC";
    private int qtd = 10;

    public void comprar(){
        System.out.println("Stock [ Nome: "+nome+", Quantidade: " + qtd +" ] comprado");
    }

    public void vender(){
        System.out.println("Stock [ Nome: "+nome+", Quantidade: " + qtd +" ] vendido");
    }
}
