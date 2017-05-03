/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.proyectospoo.visibilidad.ejemplo05;

/**
 *
 * @author Enrique
 */
public class APP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.encender();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        System.out.println(c1.mostarVelocidad());
        System.out.println(c1.mostrarCambio());
        
    }
    
}
