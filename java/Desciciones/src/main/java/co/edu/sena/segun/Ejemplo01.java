/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.segun;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = teclado.nextInt();
        
        switch(i){
            case 1:
                System.out.println("UNO");
                break;
                
            case 2:
                System.out.println("DOS");
                break;
                
            case 3:
                System.out.println("TRES");
                break;
                
            case 4:
                System.out.println("CUATRO");
                break;
            default:
                System.out.println("no conozco ese numero");
                break;
        }
        
        
        
        
        
        
        
        
    }
    
}
