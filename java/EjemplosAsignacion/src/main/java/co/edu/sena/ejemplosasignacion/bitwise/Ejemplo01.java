/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplosasignacion.bitwise;

/**
 *
 * @author Enrique
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=40;
        int b= 122;
        int r = a&b;
        int r2 = a|b;
        int xor = a^b;
        byte aaa = (byte)a;
        byte negacion = (byte)(~aaa);
        System.out.println(xor);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(negacion));
        
        //desplazamientos binarios
        int numero =12000;
        System.out.println(Integer.toBinaryString(numero));
        int numero2 = numero>>2;
        System.out.println(Integer.toBinaryString(numero2));
        //desplazamientos binarios
        int numero3 =12000;
        System.out.println(Integer.toBinaryString(numero3));
        int numero4 = numero3>>>4;
        System.out.println(Integer.toBinaryString(numero4));
        
        
        
        
        
    }
    
}
