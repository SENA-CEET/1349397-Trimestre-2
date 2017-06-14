package co.edu.sena.proyectospoo.realizacion;

/**
 * Created by Enrique on 19/05/2017.
 */
public class Perro implements Sordo, Ciego, Cojo, Mudo, SordoMudo {
    @Override
    public void ver() {
        System.out.println("veo pero en blanco y negro");
    }

    @Override
    public void comer() {
        System.out.println("como dog show");
    }

    @Override
    public void respirar() {
        System.out.println("respiro");
    }

    @Override
    public void caminar() {
        System.out.println("camino en cuatro");
    }

    @Override
    public void dormir() {
        System.out.println("duermo");
    }

    @Override
    public void hablar() {
        System.out.println("ladro wau wau");
    }

    @Override
    public void escuchar() {
        System.out.println("escucho");
    }
}
