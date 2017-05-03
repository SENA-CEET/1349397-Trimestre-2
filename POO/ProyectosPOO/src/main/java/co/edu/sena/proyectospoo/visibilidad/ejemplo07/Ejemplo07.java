package co.edu.sena.proyectospoo.visibilidad.ejemplo07;

/**
 * Created by Enrique on 3/05/2017.
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        Reloj r1 = new Reloj();
        r1.setId(1);

        new Reloj();

        Reloj r2 = new Reloj();
        r2.setId(2);
        Reloj r3 = r1;
        r3.setId(3);
        Reloj r4 = new Reloj();
        r4.setId(4);
        Reloj r5 = new Reloj();
        r5.setId(5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}
