package comportamental.Iterator;

public class NomeRepo implements Container {
    private String nomes[] = {"Marcos", "Maria", "Julia", "Joao"};

    @Override
    public Iterator getIterator() {
        return new NomeIterator();
    }

    // Iterator que percorrera nomes[] modificado de acordo com o contexto
    private class NomeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < nomes.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return nomes[index++];
            }

            return null;
        }
    }
}
