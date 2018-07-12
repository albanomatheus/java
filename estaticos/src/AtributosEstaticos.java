public class AtributosEstaticos {
    // Atributos estaticos são como variaveis globais, todos objetos instaciados iram acessar e alterar a mesma posição na memória

    public static void main(String[] args) {
        Fala f1 = new Fala(), f2 = new Fala();

        f1.x = 10; // tambem alterará o valor de f2, pois o atributo x é o mesmo para ambos

        System.out.println("f1.x: " + f1.x);
        System.out.println("f2.x: " + f2.x);

        System.out.println("Fala.x: " + Fala.x); // Tambem é possivel acesssar o atributo sem instaciar um objeto
    }
}
