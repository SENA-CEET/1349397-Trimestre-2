package co.edu.sena.proyectospoo.asociacion.ejemplo04;

import co.edu.sena.proyectospoo.polimorfismo.*;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Avion av1 = new Avion();

        Aerolinea ae1= new Aerolinea();

        av1.setAerolinea(ae1);
        ae1.setAvion(av1);

    }
}
