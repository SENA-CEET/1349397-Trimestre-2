package co.edu.sena.proyectospoo.metodoestatico;

/**
 * Created by Enrique on 9/05/2017.
 */
public class Calculadora {

    public static void suma(int a, int b){
        System.out.println(a+b);
    }

    public static short suma(short a, int b){
        return (short)(a+b);
    }
    public static int suma(short a, short b){
        return (a+b);
    }
}
