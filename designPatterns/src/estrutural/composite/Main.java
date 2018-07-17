package estrutural.composite;

public class Main {
    public static void main(String[] args) {
        Empregado CEO = new Empregado("John","CEO", 30000);

        Empregado headSales = new Empregado("Robert","Head Sales", 20000);

        Empregado headMarketing = new Empregado("Michel","Head Marketing", 20000);

        Empregado clerk1 = new Empregado("Laura","Marketing", 10000);
        Empregado clerk2 = new Empregado("Bob","Marketing", 10000);

        Empregado salesExecutive1 = new Empregado("Richard","Sales", 10000);
        Empregado salesExecutive2 = new Empregado("Rob","Sales", 10000);

        CEO.addSubordinado(headSales);
        CEO.addSubordinado(headMarketing);

        headSales.addSubordinado(salesExecutive1);
        headSales.addSubordinado(salesExecutive2);

        headMarketing.addSubordinado(clerk1);
        headMarketing.addSubordinado(clerk2);


        for (Empregado x: CEO.getSubordinados()) {
            System.out.println(x);

            for (Empregado y: x.getSubordinados()) {
                System.out.println(y);
            }
        }

    }
}
