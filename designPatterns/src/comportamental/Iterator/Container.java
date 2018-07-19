package comportamental.Iterator;

// Interface que define que todos classe que a implementam, precisam ter um metodo que retorne um iterator para determinado contexto
public interface Container {
    Iterator getIterator();
}
