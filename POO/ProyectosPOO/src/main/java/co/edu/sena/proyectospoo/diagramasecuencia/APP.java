package co.edu.sena.proyectospoo.diagramasecuencia;

/**
 * Created by Enrique on 18/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.setAtaque(74);
        int a = p1.getAtaque();
        p1.setDefensa(52);
        p1.setElemento("fuego");
        p1.setIvs(14.5F);
        p1.setVelocidad(72);

        Pokemon p2 = new Pokemon();
        p2.setAtaque(74);
        p2.setDefensa(52);
        p2.setElemento("fuego");
        p2.setIvs(14.5F);
        p2.setVelocidad(72);

    }
}
