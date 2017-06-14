
package co.edu.sena.proyectospoo.colecciones.ejemplo02;

/**
 * Created by Enrique on 31/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Aprendiz a1 = new Aprendiz("CC","12345", "Miguel Alberto Rosado");

        Aprendiz a2 = new Aprendiz("CC","12345", "Miguel Alberto Rosado");
        Aprendiz a3= new Aprendiz("CC","12345", "Miguel Alberto Rosado");
        Perro a4 = new Perro("CC","12345", "Miguel Alberto Rosado");

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());


        if(a1.equals(a4)){
            System.out.println("iguales");
        }else{
            System.out.println("diferentes");
        }





    }
}
