import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String b[] = {"cafe", "cha", "leite"};
        List<Bebida> bebidas = new ArrayList<>();

        for (int x = 0; x < 20; x++) {
            Bebida y = MaquinaDeCafe.getInstance(b[(int) (Math.random() * b.length)], Math.random() * 4);
            bebidas.add(y);
        }

        for(Bebida x: bebidas) {
            System.out.println(x.toString());
        }
    }
}
