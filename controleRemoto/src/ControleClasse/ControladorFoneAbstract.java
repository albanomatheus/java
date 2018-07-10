package ControleClasse;

import controleInterfaces.Controlador;

public abstract class ControladorFoneAbstract implements Controlador {

    abstract  void pegaFone();

    @Override
    public void maisVolume(int v) {
        pegaFone();
    }
}
