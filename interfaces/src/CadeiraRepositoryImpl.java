public class CadeiraRepositoryImpl implements MovelRepository<Cadeira> {
    @Override
    public Cadeira getMovel() {
        //foi no banco
        Cadeira c = new Cadeira();
        c.setId(2);
        c.setQtdPernas(2);
        c.setPossuiRodinhas(true);
        return c;
    }

    @Override
    public Cadeira fazMovel() {
        Cadeira c = new Cadeira();
        c.setQtdPernas(1);
        c.setPossuiRodinhas(false);

        return c;
    }
}
