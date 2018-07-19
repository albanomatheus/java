package comportamental.command;

// Classe que serve como service para os objetos que implementao ordem irao utilizar
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
