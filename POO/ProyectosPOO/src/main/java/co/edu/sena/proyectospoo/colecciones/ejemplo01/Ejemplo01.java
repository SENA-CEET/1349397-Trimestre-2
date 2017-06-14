package co.edu.sena.proyectospoo.colecciones.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add(new Balon("adidas", "futbol"));
        lista.add(new Reloj("gucci", "negro"));
        lista.add("hola mundo");

        for(int i=0; i<lista.size();i++){
           if(lista.get(i) instanceof Balon){
               Balon bt = (Balon)lista.get(i);
               System.out.println(bt.getClase());
               System.out.println(bt.getMarca());
           }else if(lista.get(i) instanceof Reloj){
               Reloj rt = (Reloj)lista.get(i);
               System.out.println(rt.getColor());
               System.out.println(rt.getMarca());

           }

        }



    }
}
