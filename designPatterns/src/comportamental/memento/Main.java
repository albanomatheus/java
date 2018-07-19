package comportamental.memento;

// Design Pattern usado para registrar estados de um determado objeto
public class Main {
    public static void main(String[] args) {
        Estado e = new Estado();
        Registrador r = new Registrador();

        e.setEstado("Estado 1");
        e.setEstado("Estado 2");
        r.add(e.salvarMomento());

        e.setEstado("Estado 3");
        r.add(e.salvarMomento());
        System.out.println("Estado atual: " + e.getEstado());

        e.getEstadoMemento(r.get(0));
        System.out.println("Primeiro estado: " + e.getEstado());

        e.getEstadoMemento(r.get(1));
        System.out.println("Segundo estado: " + e.getEstado());
    }
}
