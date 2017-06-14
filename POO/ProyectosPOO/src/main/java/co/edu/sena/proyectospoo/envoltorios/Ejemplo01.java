package co.edu.sena.proyectospoo.envoltorios;

import java.util.*;
import java.util.List;




/**
 * Created by Enrique on 17/05/2017.
 */
public class Ejemplo01 {



    public static void main(String[] args) {
        System.out.println(Integer.BYTES);
        int a =Integer.parseInt("45");

        Integer c = 5;
        System.out.println(c);

        System.out.println(Integer.TYPE);

        Integer asd = new Integer(2);
        Integer asd3 = new Integer("2");
        System.out.println(asd);
        System.out.println(asd3);

        Integer.compare(3,3);


        //Boxing

        int au = (int)new Integer(5);

        Integer auu = (Integer)5;


        String valor = "5";

        int convertido = Integer.parseInt(valor);
        short convertido1 = Short.parseShort(valor);
        long convertido2 = Long.parseLong(valor);


        int canvertido5 = (int)new Integer(valor);










    }

}
