package co.edu.sena.proyectospoo.generalizacion.ejemplo01;

/**
 * Created by Enrique on 9/05/2017.
 */
public class Pez extends Animal {
    private int agallas;
    private int aletas;
    private int escamas;

    @Override
    public void morir(){
        System.out.println("aburrimiento");
    }

    @Override
    public void defecar(){
        System.out.println("lo suelto en el mar");
    }

    public int getAgallas() {
        return agallas;
    }

    public void setAgallas(int agallas) {
        this.agallas = agallas;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getEscamas() {
        return escamas;
    }

    public void setEscamas(int escamas) {
        this.escamas = escamas;
    }
}
