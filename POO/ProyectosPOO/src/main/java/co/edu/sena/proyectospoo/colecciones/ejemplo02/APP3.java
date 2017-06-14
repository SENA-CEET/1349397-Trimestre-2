package co.edu.sena.proyectospoo.colecciones.ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Enrique on 1/06/2017.
 */
public class APP3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for(int i= 0; i<10;i++){
            lista.add(teclado.nextInt());


        }

        for (Integer i :lista
             ) {
            System.out.println(i);
        }

        for(int i=0 ; i<lista.size();i++){
            if(lista.get(i)== 4){
                System.out.println("esta en la posicion "+i + "contiene "+lista.get(i));
            }

        }

    }
}
