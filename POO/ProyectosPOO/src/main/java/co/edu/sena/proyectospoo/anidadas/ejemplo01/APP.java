package co.edu.sena.proyectospoo.anidadas.ejemplo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Enrique on 22/05/2017.
 */
public class APP {

    public static void main(String[] args) {

        // cuando es interna estatica no se debe crear el objeto de la clase externa
        ClaseUno.ClaseSeis a = new ClaseUno.ClaseSeis();
        System.out.println(a);

        ClaseUno ab = new ClaseUno();
        //este codigo es muy raro verlo
        ClaseUno.ClaseDos b = ab.new ClaseDos();// alto acoplamiento
        System.out.println(ab);
        System.out.println(b);

        ab.crearClase();

        InterfacePollo ip = new Pollo(){
            private String a;
             @Override
             public void ejecutar(){

                 System.out.println("soy una gallina");
             }
        };

        ip.ejecutar();




        List lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        lista.stream().forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("asdfads");
            }
        });

        InterfacePerro as = new InterfacePerro() {
            @Override
            public void ladrar() {
                System.out.println("wau wau");
            }
        };

        as.ladrar();



    }




}
