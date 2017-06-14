package co.edu.sena.proyectospoo.asociacion.ejemplo01;

import java.util.List;

/**
 * Created by Enrique on 25/05/2017.
 */
public class Caballo {

    private Cerebro cerebro;
    private Silla silla;
    private Pata [] patas = new Pata[4];
    private List<Diente> dientes;

    public Cerebro getCerebro() {
        return cerebro;
    }

    public void setCerebro(Cerebro cerebro) {
        this.cerebro = cerebro;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    public Pata[] getPatas() {
        return patas;
    }

    public void setPatas(Pata[] patas) {
        this.patas = patas;
    }

    public List<Diente> getDientes() {
        return dientes;
    }

    public void setDientes(List<Diente> dientes) {
        this.dientes = dientes;
    }
}
