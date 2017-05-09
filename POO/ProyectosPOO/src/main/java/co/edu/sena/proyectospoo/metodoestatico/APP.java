package co.edu.sena.proyectospoo.metodoestatico;

/**
 * Created by Enrique on 9/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Calculadora.suma(2,2);
        System.out.println(Calculadora.suma((short)2,5));
        short a = Calculadora.suma((short)2,5);
        System.out.println(Calculadora.suma(a,7));
        System.out.println(Calculadora.suma((short)Calculadora.suma((short)2,(short)5),7));
    }
}
