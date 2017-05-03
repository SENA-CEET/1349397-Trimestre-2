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
public class Carro2 {

    private int velocidad;
    private int cambio;

    public void encender() {
        this.cambio = 0;
        this.velocidad = 0;
    }

    public void aumentarCambio() {
        if (this.cambio < 4) {
            this.cambio += 1;
        } else {
            System.out.println("estoy en cambio maximo");
        }
    }

    public void disminiurCambio() {
        if (this.cambio > 0) {
            this.cambio -= 1;
        } else {

            System.out.println("estoy en el cambio minimo");
        }
    }

    public void acelerar() {
        switch (this.cambio) {
            case 1:
                if (this.velocidad < 190) {
                    this.velocidad += 10;
                }
                break;
            case 2:
                if (this.velocidad < 185) {
                    this.velocidad += 15;
                }
                break;
            case 3:
                if (this.velocidad < 180) {
                    this.velocidad += 20;
                }
                break;
            case 4:
                if (this.velocidad < 175) {
                    this.velocidad += 25;
                }
                break;
            case 0:
                System.out.println("no tengo un cambio no puedo aumentar velocidad");
                break;
            default:
                System.out.println("no tengo ese cambio");
        }

    }

    public void frenar() {
        switch (this.cambio) {
            case 1:
                if(this.velocidad>10)
                this.velocidad -= 10;
                break;
            case 2:
                if(this.velocidad>15)
                this.velocidad -= 15;
                break;
            case 3:
                
                if(this.velocidad>20)
                this.velocidad -= 20;
                break;
            case 4:
                if(this.velocidad>25)
                this.velocidad -= 25;
                break;
            case 0:
                System.out.println("no tengo un cambio no puedo aumentar velocidad");
                break;
            default:
                System.out.println("no tengo ese cambio");
        }

    }

    public int mostrarVelocidad() {
        return this.velocidad;
    }

    public int mostrarCambio() {
        return this.cambio;
    }

}
