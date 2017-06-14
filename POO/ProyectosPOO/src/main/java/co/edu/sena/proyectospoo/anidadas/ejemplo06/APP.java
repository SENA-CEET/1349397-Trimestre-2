package co.edu.sena.proyectospoo.anidadas.ejemplo06;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno c1 = new ClaseUno();
        System.out.println(c1);
        ClaseUno.ClaseDos c2 = new ClaseUno.ClaseDos();
        System.out.println(c2);
        ClaseUno.ClaseDos.ClaseTres c3 = new ClaseUno.ClaseDos.ClaseTres();
        System.out.println(c3);
        ClaseUno.ClaseDos.ClaseTres.ClaseCuatro c4 = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro();
        System.out.println(c4);
    }
}
