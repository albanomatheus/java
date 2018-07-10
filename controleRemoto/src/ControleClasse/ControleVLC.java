package ControleClasse;

public class ControleVLC extends ControladorAbstract {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleVLC() {

    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado?" + this.ligado);
        System.out.println("Esta tocando?" + this.tocando);
        if (this.isTocando()) {
            System.out.print("Volume: ");
            for (int i=0; i < this.getVolume(); i++) {
                System.out.printf("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        System.out.printf("Fechando menu");
    }



    @Override
    public void menosVolume(int v) {
        if (this.ligado) {
            this.setVolume(this.getVolume()- v);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
