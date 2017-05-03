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
public class APP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro2 c2 = new Carro2();
        c2.encender();
        c2.aumentarCambio();
        c2.acelerar();
        c2.aumentarCambio();
        c2.acelerar();
        c2.aumentarCambio();
        c2.acelerar();
        c2.acelerar();
        c2.aumentarCambio();
        c2.aumentarCambio();
        c2.acelerar();
        c2.acelerar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.disminiurCambio();
        c2.disminiurCambio();
        c2.frenar();
        System.out.println(c2.mostrarVelocidad());
        System.out.println(c2.mostrarCambio());
    }

}
