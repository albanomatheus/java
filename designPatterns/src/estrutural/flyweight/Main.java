package estrutural.flyweight;

import java.util.ArrayList;
import java.util.List;

// Flyweight é usado para criar uma interface que não deixar criar novas instancias de classes se elas ja existirem (ganho de memória)
public class Main {
    public static void main(String[] args) {
        String b[] = {"cafe", "cha", "leite"};
        List<Bebida> bebidas = new ArrayList<>();

        for (int x = 0; x < 20; x++) {
            Bebida y = MaquinaDeCafe.getInstance(b[(int) (Math.random() * b.length)], Math.random() * 4);
            bebidas.add(y);
        }

        for (Bebida x : bebidas) {
            System.out.println(x);
        }
    }
}
