package co.edu.sena.proyectospoo.asociacion.ejemplo09;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Enrique on 2/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();

        Trasmilenio t = new Trasmilenio();


        t.setPasajeros(new ArrayList<>());
        t.getPasajeros().add(p1);
        t.getPasajeros().add(p2);
        t.getPasajeros().add(p3);
        t.getPasajeros().add(p4);
        t.getPasajeros().add(p5);



    }
}
