package co.edu.sena.proyectospoo.colecciones.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        List<Reloj> lista= new ArrayList<>();
        lista.add(new Reloj("adidas","azul"));

        for (int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getColor());
            System.out.println(lista.get(i).getMarca());
        }

        for (Reloj r: lista) {
            System.out.println(r.getMarca());
            System.out.println(r.getColor());
        }

    }
}
