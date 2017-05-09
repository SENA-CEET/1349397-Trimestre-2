package co.edu.sena.proyectospoo.generalizacion.ejemplo01;

/**
 * Created by Enrique on 9/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.comer();
        p1.defecar();
        p1.setColor("cafe");
        System.out.println(p1.getColor());
        p1.setRaza("labrador");
        System.out.println(p1.getRaza());
        p1.setPeso(15.4F);
        System.out.println(p1.getPeso());
        p1.setEdad(5);
        System.out.println(p1.getEdad());


    }
}
