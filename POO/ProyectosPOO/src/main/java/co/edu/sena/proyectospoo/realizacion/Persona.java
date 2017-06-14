package co.edu.sena.proyectospoo.realizacion;

/**
 * Created by Enrique on 19/05/2017.
 */
public class Persona extends Object implements Sordo, Ciego, Cojo, Mudo, Insomnio, SordoMudo {

    @Override
    public void ver(){
        System.out.println("veo");
    }

    @Override
    public void comer(){
        System.out.println("como");
    }


    public void escuchar(){
        System.out.println("escucho");
    }

    public void respirar(){
        System.out.println("respiro");
    }

    public void caminar(){
        System.out.println("camino");
    }

    public void dormir(){
        System.out.println("duermo");
    }

    public void hablar(){
        System.out.println("hablo");
    }
}
