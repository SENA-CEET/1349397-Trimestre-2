/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.paradigmas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class EjemploParadigmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>lista = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        
        //paradigma imperativo estructurado
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //paradigma imperativo oientado a objetos
        Iterator i = lista.iterator();
        while(i.hasNext()){
         Integer a = (Integer)i.next();
            System.out.println(a);
        }
        
        // imperativo orientado a objetos foreach
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        
        //declarativo funcional
        lista.stream().forEach((Integer x)->System.out.println(x));
        
        
        
        
        
        
        
    }
    
}
