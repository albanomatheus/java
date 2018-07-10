public class MesaRepositoryImpl implements MovelRepository<Mesa> {
    @Override
    public Mesa getMovel() {
        //foi no banco
        Mesa c = new Mesa();
        c.setDePedra(false);
        c.setId(5);
        return c;
    }

    @Override
    public Mesa fazMovel() {
        Mesa c = new Mesa();
        c.setDePedra(true);
        return c;
    }
}
