package comportamental.Template;

// Design Pattern que utiliza uma classe abstrada com um metodo padrao que nao pode ser sobreposto
public class Main {
    public static void main(String[] args) {
        Esporte futebol = new Futebol();
        Basquete basquete = new Basquete();

        futebol.play();
        System.out.println("--------------------------------");
        basquete.play();
    }
}
