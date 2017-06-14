package co.edu.sena.proyectospoo.asociacion.ejemplo07;

import java.util.*;

/**
 * Created by Enrique on 30/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Balon b1 = new Balon();
        Balon b2 = new Balon();
        Balon b3 = new Balon();
        Balon b4 = new Balon();
        Balon b5 = new Balon();
        Balon b6 = new Balon();
        Balon b7 = new Balon();
        Balon b8 = new Balon();
        Balon b9 = new Balon();
        Balon b10 = new Balon();

        Canasta c1 = new Canasta();
        c1.getLista().add(b1);
        c1.getLista().add(b2);
        c1.getLista().add(b3);
        c1.getLista().add(b4);
        c1.getLista().add(b5);
        c1.getLista().add(b6);
        c1.getLista().add(b7);
        c1.getLista().add(b8);
        c1.getLista().add(b9);
        c1.getLista().add(b10);

        System.out.println(c1.getLista().get(3));
        System.out.println(c1.getLista().get(4));
        c1.getLista().remove(3);
        System.out.println(c1.getLista().get(3));







    }

}
