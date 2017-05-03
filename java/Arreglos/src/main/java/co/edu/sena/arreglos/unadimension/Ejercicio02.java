/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.arreglos.unadimension;

/**
 *
 * @author Enrique
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        int arreglo[] = new int[10];

        for (int i = 100; i <= 300; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (indice == 10) {
                break;
            } else if (cont == 2) {
                arreglo[indice] = i;
                indice++;
            }
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i+": " + arreglo[i]);
        }
    }

}
