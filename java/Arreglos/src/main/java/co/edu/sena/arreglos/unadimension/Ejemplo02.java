/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.arreglos.unadimension;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numeroLeido = new int[10];
        
        for (int i = 0; i < numeroLeido.length; i++) {
            System.out.println("digite el numero en la posicion "+i);
            numeroLeido[i]= teclado.nextInt();
        }
        
        for (int i = 0; i < numeroLeido.length; i++) {
            System.out.println("el arreglo en la posicion "+i+" tiene: "+numeroLeido[i]);
        }
        
        
    }
    
}
