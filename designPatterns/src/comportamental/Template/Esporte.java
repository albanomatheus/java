package comportamental.Template;

public abstract class Esporte {
    public abstract void iniciar();
    public abstract void intervalo();
    public abstract void terminar();

    public final void play() {
        iniciar();
        intervalo();
        terminar();
    }
}
