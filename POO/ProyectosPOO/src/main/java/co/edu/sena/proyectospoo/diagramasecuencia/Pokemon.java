package co.edu.sena.proyectospoo.diagramasecuencia;

/**
 * Created by Enrique on 18/05/2017.
 */
public class Pokemon {
    private int ataque;
    private int defensa;
    private String elemento;
    private int velocidad;
    private float ivs;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getIvs() {
        return ivs;
    }

    public void setIvs(float ivs) {
        this.ivs = ivs;
    }
}
