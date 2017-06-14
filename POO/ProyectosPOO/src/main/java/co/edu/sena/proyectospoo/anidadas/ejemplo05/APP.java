package co.edu.sena.proyectospoo.anidadas.ejemplo05;


import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;

/**
 * Created by Enrique on 24/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        InterfaceUno c1 = new ClaseUno();
        System.out.println(c1);

        InterfaceClaseDos c2 = c1.getClaseDos();
        System.out.println(c2);

        InterfaceClaseTres c3 = c2.getClaseTres();
        System.out.println(c3);

        InterfaceClaseCuatro c4 = c3.getClaseCuatro();
        System.out.println(c4);

    }
}
