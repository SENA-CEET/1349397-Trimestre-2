package co.edu.sena.proyectospoo.sobrecargametodos;

/**
 * Created by Enrique on 8/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        OperacionesMatematicas op = new OperacionesMatematicas();
        System.out.println(op.suma((byte)1,(byte)1));
        System.out.println(op.suma((short)1,(short)1));
        System.out.println(op.suma(1,1));
        System.out.println(op.suma((long)1,(long)1));
        System.out.println(op.suma(1.8F,1.8F));
        System.out.println(op.suma(1.8,1.8));

    }
}
