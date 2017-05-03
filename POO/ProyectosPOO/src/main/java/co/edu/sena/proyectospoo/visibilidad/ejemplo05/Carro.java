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
public class Carro {

    private int velocidad;
    private int cambio;

    public void encender() {
        this.cambio = 0;
        this.velocidad = 0;
    }

    public void acelerar() {
        this.cambio += 1;
        this.velocidad += 10;
    }

    public void frenar() {
        if (this.cambio > 0 && this.velocidad > 0) {
            this.cambio -= 1;
            this.velocidad -= 10;
        }else{
            System.out.println("no puedo frenar mas estoy quieto");
        }
    }

    public int mostrarCambio() {
        return this.cambio;
    }

    public int mostarVelocidad() {
        return this.velocidad;
    }

}
