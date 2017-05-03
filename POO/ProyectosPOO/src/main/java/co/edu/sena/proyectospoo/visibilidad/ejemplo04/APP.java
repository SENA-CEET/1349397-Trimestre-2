/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.proyectospoo.visibilidad.ejemplo04;

/**
 *
 * @author Enrique
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro();
        System.out.println(p1);
        p1.ladrar();
        p1.comer("dog show");
        p1.comer("salchicha");
        System.out.println(p1.jugar("hueso"));
       
        String a =p1.jugar("balon");
        System.out.println(a);
        
    }
    
}
