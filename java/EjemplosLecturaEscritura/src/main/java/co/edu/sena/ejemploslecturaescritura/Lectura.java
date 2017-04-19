/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploslecturaescritura;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
//        int a = teclado.nextInt();
//        
//        int b = teclado.nextInt();
//        
//        float c = teclado.nextFloat();
        System.out.println("escriba un texto: ");
        String texto = teclado.nextLine();
       
        
        
        System.out.println(texto);
        
        
        
    }
    
}
