package co.edu.sena.proyectospoo.asociacion.ejemplo03;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Carro c1 = new Carro(new Motor(), new CajaCambios());
        c1.setPlaca("abc123");
        c1.getCajaCambios().setCambios(4);
        c1.getMotor().setNumeroMotor("1231231231");

        System.out.println(c1.getPlaca());
        System.out.println(c1.getMotor());
        System.out.println(c1.getMotor().getNumeroMotor());
        System.out.println(c1.getCajaCambios().getCambios());

        Motor nuevoMotor = new Motor();
        nuevoMotor.setNumeroMotor("2452354254");

        c1.setMotor(nuevoMotor);

        System.out.println(c1.getPlaca());
        System.out.println(c1.getMotor());
        System.out.println(c1.getMotor().getNumeroMotor());
        System.out.println(c1.getCajaCambios().getCambios());


    }
}
