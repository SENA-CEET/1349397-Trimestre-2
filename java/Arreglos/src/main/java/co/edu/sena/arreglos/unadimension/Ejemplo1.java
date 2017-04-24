/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.arreglos.unadimension;

/**
 *
 * @author Enrique
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de un arrays
        int [] a = new int[10];
        
        System.out.println(a);
        System.out.println(a.length);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("el areglo en la posicion "+i+"tiene: "+a[i]);
        }
        float [] b = new float[3];
        b[0]= 234.4F;
        b[1]= 234.4F;
        b[2]= 234.4F;
        
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
           
        }
        
        boolean [] c = new boolean[10];
        c[9]= true;
        
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        
        String [] palabras = new String[10];
        palabras[0]= "hola0";
        palabras[2]= "hola1";
        palabras[3]= "hola2";
        palabras[4]= "hola3";
        palabras[5]= "hola4";
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
        
        int [] numero = {1,2,3,4,5,6,7,8,9};
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
        
        String [] texto = {"pa","pa2"};
        for (int i = 0; i < texto.length; i++) {
            System.out.println(texto[i]);
        }
        
        char [] caracteres = {'a','b','c'};
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
        
        
        
        
    }
    
}
