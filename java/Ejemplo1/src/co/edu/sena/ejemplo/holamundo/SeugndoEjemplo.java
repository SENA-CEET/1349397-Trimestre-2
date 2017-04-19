/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplo.holamundo;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class SeugndoEjemplo {

   
     //tipo de datos primitivos

        //Enteros
        byte b = 1;//desde -128 hasta 127
        short s = 10;//desde -32768 hasta 32768
        int i = 100;//desde (-2 ^ 31) hasta(-2 ^ 31)-1.
        long l = 100000L;//desde (-2 ^ 63) hasta (-2 ^ 63)-1

        //reales
        float f = 3.14F;
        double d = 3.1415;//Este tipo de dato tiene el doble de precision que el float

        //logico(Verdadero, Falso)
        boolean bl = true;

        //Caracter
        char c = 'X';

    
    public static void main(String[] args) {
       
        //Ejemplo de suma
        int numero1, numero2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Primer numero");
        numero1 = teclado.nextInt();
        System.out.println("Digite Segundo numero");
        numero2 = teclado.nextInt();
        resultado = numero1 + numero2;
        System.out.print("El resultado es: ");
        System.out.println(resultado);
    }

}
