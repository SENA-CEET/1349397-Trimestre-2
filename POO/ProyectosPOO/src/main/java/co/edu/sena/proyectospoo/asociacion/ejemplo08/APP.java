package co.edu.sena.proyectospoo.asociacion.ejemplo08;

import java.util.*;

/**
 * Created by Enrique on 30/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Map<Coordenada, Ubicacion> posicionesBogota = new HashMap<>();
        Coordenada c1 = new Coordenada(4.6584732,-74.0669038);

        posicionesBogota.put(c1,new Ubicacion("agrocampo.com.co","Cl. 73 #2062, Bogotá, Colombia"));

        System.out.println(posicionesBogota.get(c1).toString());

        Set conjunto = new HashSet();
        conjunto.add("hola");

        Map o = new WeakHashMap<>();





    }
}
