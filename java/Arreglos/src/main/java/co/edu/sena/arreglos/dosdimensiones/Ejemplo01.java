/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.arreglos.dosdimensiones;

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
        int [][] matriz = new int[3][3];
        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("digite el numero para la posicion ["+i+","+j+"]");
                matriz[i][j]= teclado.nextInt();
            }
        }
        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("el numero en la posicion ["+i+","+j+"] es: "+matriz[i][j]);
               
            }
        }
        
        for (int i=0;i<matriz.length;i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
               
            }
            
        }
        
        
    }
    
}
