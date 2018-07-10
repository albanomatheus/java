package ControleClasse;

import controleInterfaces.Controlador;

public class Main {
    public static void main(String[] args) {
        ControleSpotify c = new ControleSpotify();
        c.ligar();
        c.play();
        c.maisVolume(5);

        abrirPainel(c);

        ControleVLC v = new ControleVLC();
        v.ligar();
        v.play();
        v.maisVolume(5);

        abrirPainel(v);

        Callback call = new Callback<Controlador>() {
            @Override
            public Controlador executa(Controlador obj) {
                obj.abrirMenu();
                return obj;
            }
        };

        call.oi();
        call.thau();
        call.executa(c);
        call.executa(v);


        Controlador a = new Controlador() {
            @Override
            public void ligar() {

            }

            @Override
            public void desligar() {

            }

            @Override
            public void abrirMenu() {

            }

            @Override
            public void fecharMenu() {

            }

            @Override
            public void maisVolume(int v) {

            }

            @Override
            public void menosVolume(int v) {

            }

            @Override
            public void ligarMudo() {

            }

            @Override
            public void desligarMudo() {

            }

            @Override
            public void play() {

            }

            @Override
            public void pause() {

            }
        };

    }

    public static void abrirPainel(Controlador controlador) {
        controlador.abrirMenu();
    }
}
