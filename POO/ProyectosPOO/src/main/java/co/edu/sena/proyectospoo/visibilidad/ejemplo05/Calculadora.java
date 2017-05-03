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
public class Calculadora {
    
    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return a-b;
    }
    public int multipicacion(int a, int b){
        return a*b;
    }
    public float division(int a, int b){
        if(b == 0){
            System.out.println("error no se puede dividir por cero");
        }
        return (float)a/b;
    }
    
}
