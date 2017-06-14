package co.edu.sena.proyectospoo.anidadas.ejemplo02;

/**
 * Created by Enrique on 22/05/2017.
 */
public class ClaseUno {

    private class ClaseDos implements InterfaceDos{

    }

    public InterfaceDos getClaseDos(){
        return new ClaseDos();
    }
}
