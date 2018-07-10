public abstract class MovelAbstract implements Movel {

    private int id;
    private double tamanho;
    private Integer patrimonio;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }

    @Override
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Integer getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Integer patrimonio) {
        this.patrimonio = patrimonio;
    }

    @Override
    public boolean possuiSelo() {
        return true;
    }
}
