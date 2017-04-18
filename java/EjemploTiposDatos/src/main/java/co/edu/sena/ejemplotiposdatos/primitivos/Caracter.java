/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplotiposdatos.primitivos;

/**
 *
 * @author Enrique
 */
public class Caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a;
        
        System.out.println("caraceristicar del char");
        System.out.println("Bytes: "+Character.BYTES);
        System.out.println("tamaño maximo: "+Character.MAX_VALUE);
        System.out.println("tamaño minimo: "+Character.MIN_VALUE);
        System.out.println("tamaño bit: "+Character.SIZE);
        System.out.println("tipo: "+Character.TYPE);
        
        
        char letra = '@';
        
        System.out.println(letra);
        System.out.println((int)letra);
        
        
//        for (int i = 0; i < 65535; i++) {
//            char it= (char)i;
//            System.out.println(i+" "+it);
//        }
    }
    
}
