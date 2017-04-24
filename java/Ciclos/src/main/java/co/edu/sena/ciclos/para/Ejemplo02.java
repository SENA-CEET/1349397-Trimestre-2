/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ciclos.para;

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
        int numeroLeido= teclado.nextInt();
        int residuo, mayor=0;
        
        if (numeroLeido<0) {
            numeroLeido*=-1;
        }
        
        
        for(;;){
            
            if(numeroLeido==0){
                break;
            }
            residuo = numeroLeido%10;
            if(residuo>mayor){
                mayor = residuo;
            }
            numeroLeido/=10;
        
        
        
        }
        System.out.println(mayor);
        
    }
    
}
