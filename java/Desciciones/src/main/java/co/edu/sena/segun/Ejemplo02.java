/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.segun;

/**
 *
 * @author Enrique
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a = 'a';

        switch (a) {
            case '@':
                System.out.println("es una @");
                break;
            case 'a':
            case 'A':
                System.out.println("es una a");
                break;
                
            default:
                System.out.println("esa letra no la conozco");
             

        }
    }

}
