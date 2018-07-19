package comportamental.Iterator;

// Design Pattern que modifica o comportamento do Iterator, usado em casos específicos de percorrimento
public class Main {
    public static void main(String[] args) {
        NomeRepo rep = new NomeRepo();

        for(Iterator iter = rep.getIterator(); iter.hasNext();) {
            System.out.println("NOME: " + iter.next());
        }
    }
}
