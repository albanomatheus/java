public class MetodosEstaticos {
    static int soma(int x, int y) { // Só funciona na main desde tambem seja estatico, pois ela também é
        return x+y;
    }

    public static void main(String[] args) {
        System.out.printf("%d\n", soma(2, 5));

        Fala f =  new Fala();
        f.oi(); // funciona para statico ou não

        Fala.oi(); // O metodo precisa ser estatico, pois nao foi instaciado um objeto
    }
}
