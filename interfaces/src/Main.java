import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movel> moveis = new ArrayList<>();

        MovelRepository<Cadeira> repository = new CadeiraRepositoryImpl();
        Cadeira m1 = repository.getMovel();
        m1.mover(10, 15);
        moveis.add(m1);
        System.out.println("ID > " +m1.toString());

        Movel m2 = repository.fazMovel();
        moveis.add(m2);
        System.out.println("ID > " +m2.toString());


        MovelRepository<Mesa> repository2 = new MesaRepositoryImpl();
        Movel mm1 = repository2.getMovel();
        moveis.add(mm1);
        System.out.println("ID > " +mm1.toString());

        Mesa mm2 = repository2.fazMovel();
        moveis.add(mm2);
        mm2.mover(32, 52);
        System.out.println("ID > "+ mm2.toString());

    }
}
