package co.edu.sena.proyectospoo.asociacion.ejemplo02;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.setColor("rojo");
        c1.setMarca("Acer");

        Computador c2 = new Computador();
        c2.setColor("negro");
        c2.setMarca("HP");

        Persona p1 = new Persona();
        p1.setNombre("hernando moreno");
        p1.setComputador(c2);
        p1.setTipoDocumento("CC");
        p1.setNumeroDocumento("43423325434");

        System.out.println(p1.getTipoDocumento());
        System.out.println(p1.getNumeroDocumento());
        System.out.println(p1.getNombre());
        System.out.println(p1.getComputador().getMarca());
        System.out.println(p1.getComputador().getColor());



    }

}
