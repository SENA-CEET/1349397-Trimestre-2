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
public class Cuadro {
    private float ladoDerecho;
    private float ladoSuperior;
    private float area= this.ladoDerecho*this.ladoSuperior;

    public float getLadoDerecho() {
        return ladoDerecho;
    }

    public void setLadoDerecho(float ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
       // this.area= this.ladoDerecho*this.ladoSuperior;
    }

    public float getLadoSuperior() {
        return ladoSuperior;
    }

    public void setLadoSuperior(float ladoSuperior) {
        this.ladoSuperior = ladoSuperior;
      //  this.area= this.ladoDerecho*this.ladoSuperior;
    }

    public float getArea() {
        return area;
    }

    
    
    
}
