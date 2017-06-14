package co.edu.sena.proyectospoo.realizacion;

/**
 * Created by Enrique on 19/05/2017.
 */
public class APP {
    public static void main(String[] args) {

        // uno no debe programar para las instancias si no para las interfaces
        Mudo sordo = new Persona();

        Sordo p1 = new Perro();

        System.out.println(p1);

        Ciego p2 = (Ciego)p1;

        System.out.println(p2);



    }
}
