package co.edu.sena.proyectospoo.asociacion.ejemplo01;

/**
 * Created by Enrique on 25/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Caballo c1 = new Caballo();
        System.out.println(c1.getCerebro());
        c1.getPatas()[0]= new Pata();
        c1.getPatas()[1]= new Pata();
        c1.getPatas()[2]= new Pata();
        c1.getPatas()[3]= new Pata();

        for(int i=0; i<c1.getPatas().length;i++){
            System.out.println(c1.getPatas()[i]);
        }
        System.out.println(c1.getPatas());
        System.out.println(c1.getDientes());
    }
}
