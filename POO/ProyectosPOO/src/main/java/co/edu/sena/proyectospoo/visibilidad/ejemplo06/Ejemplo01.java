package co.edu.sena.proyectospoo.visibilidad.ejemplo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Enrique on 3/05/2017.
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int [] vector= {1,2,3,4,5,6,7,8,9};
        imprimirArreglo(vector);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        imprimirCollecion(lista);
    }

    public static void  imprimirArreglo(int [] a){
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void imprimirCollecion(List<Integer> lista){
        for (Integer lis: lista
             ) {
            System.out.println(lis);
        }

    }

    public static List<Integer> trasformarListaArreglo(int [] a){
        List<Integer> lt= new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            lt.add(a[i]);
        }
        return lt;
    }


}
