package co.edu.sena.proyectospoo.anidadas.ejemplo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno c1 = new ClaseUno();
        System.out.println(c1);
        InterfaceClaseDos c2 = ClaseUno.getClaseDos();
        System.out.println(c2);
        InterfaceClaseTres c3 = ClaseUno.ClaseDos.getClaseTres();
        System.out.println(c3);
        InterfaceClaseCuatro c4 = ClaseUno.ClaseDos.ClaseTres.getClaseCuatro();
        System.out.println(c4);







    }
}
