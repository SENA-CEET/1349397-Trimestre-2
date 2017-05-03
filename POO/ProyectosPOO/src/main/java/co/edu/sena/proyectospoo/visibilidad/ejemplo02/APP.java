/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.proyectospoo.visibilidad.ejemplo02;

/**
 *
 * @author Enrique
 */
public class APP {
    public static void main(String[] args) {
        Cuadro c1 = new Cuadro();
        c1.setLadoDerecho(5);
        c1.setLadoSuperior(5);
        System.out.println(c1.getArea());
        
        Perro p1 = new Perro();
        System.out.println(p1.color);
        System.out.println(p1.patas);
        System.out.println(p1.precio);
        
    }
    
}
