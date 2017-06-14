package co.edu.sena.proyectospoo.anidadas.ejemplo04;

/**
 * Created by Enrique on 24/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno ca = new ClaseUno();
        System.out.println(ca);
        ClaseUno.ClaseDos cb = ca.new ClaseDos();
        System.out.println(cb);
        ClaseUno.ClaseDos.ClaseTres cc = cb.new ClaseTres();
        System.out.println(cc);
        ClaseUno.ClaseDos.ClaseTres.ClaseCuatro cd = cc.new ClaseCuatro();


    }
}
