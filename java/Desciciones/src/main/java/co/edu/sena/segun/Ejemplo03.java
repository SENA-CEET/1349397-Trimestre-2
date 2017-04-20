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
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "hola mundo2";
        
        switch(texto){
            case "hola mundo":
            case "hola mundo2":
                System.out.println("es una hola mundo");
                break;
            case "mama":
                System.out.println("es una mama");
                break;
                
            default:
                System.out.println("eso no lo conozco");
                
        }
    }
    
}
