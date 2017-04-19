/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplosasignacion;

/**
 *
 * @author Enrique
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3, b, c;
        b=a++;
        c=--b;
        b=--a;
        a=a++;
        b=++b;
        c=c++;
        c=++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
    }
    
}
