package co.edu.sena.proyectospoo.visibilidad.ejemplo10;

/**
 * Created by Enrique on 3/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Carro c1= new Carro();
        c1.setPlaca("ABD123");
        System.out.println(c1.getPlaca());

        Carro c2 = new Carro();
        c2.setPlaca("dfasdfasd");
        System.out.println("su numero de placa es: "+c2.getPlaca()+" kgs");


    }
}
