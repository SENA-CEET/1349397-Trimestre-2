/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplosoperadoreslogicos;

/**
 *
 * @author Enrique
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3, b= 5;
        //operadores relacionales
        
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        
        System.out.println(a<b && a<80);
        
        System.out.println(a<b ^ a>b);
        
        
    }
    
}
