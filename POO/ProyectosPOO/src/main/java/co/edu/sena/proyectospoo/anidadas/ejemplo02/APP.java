package co.edu.sena.proyectospoo.anidadas.ejemplo02;

/**
 * Created by Enrique on 22/05/2017.
 */
public class APP {
    public static void main(String[] args) {

        ClaseUno a = new ClaseUno();
        InterfaceDos as = a.getClaseDos();

        System.out.println(a);
        System.out.println(as);

    }
}
