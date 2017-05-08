package co.edu.sena.proyectospoo.constructores;

/**
 * Created by Enrique on 5/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Bombillo b1 = new Bombillo("phillips",12.5F,1500F);

        System.out.println(b1.getMarca());
        System.out.println(b1.getPrecio());
        System.out.println(b1.getVatios());

        Bombillo b2 = new Bombillo(35.6F);
        System.out.println(b2.getMarca());
        System.out.println(b2.getPrecio());
        System.out.println(b2.getVatios());

        System.out.println(new Bombillo(67.5F).getVatios());


    }

}
