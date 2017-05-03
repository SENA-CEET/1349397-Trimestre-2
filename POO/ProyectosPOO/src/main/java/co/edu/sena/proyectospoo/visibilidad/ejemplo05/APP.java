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
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto motico = new Moto();
        motico.encender();
        motico.acelerar();
        motico.frenar();
        motico.acelerar();
        motico.frenar();
        motico.apagar();
        
        Calculadora c1 = new Calculadora();
        int resultado=c1.suma(2, 2);
        System.out.println("la suma es: "+resultado);
        System.out.println("la resta es: "+ c1.resta(3, 7));
        System.out.println("la multiplicacion es: "+c1.multipicacion(3, 7));
        System.out.println("la division es: "+c1.division(3, 0));
        
    }
    
}
