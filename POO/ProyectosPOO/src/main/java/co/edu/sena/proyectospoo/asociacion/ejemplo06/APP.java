package co.edu.sena.proyectospoo.asociacion.ejemplo06;

/**
 * Created by Enrique on 30/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Balon b1= new Balon();
        Balon b2= new Balon();
        Balon b3= new Balon();
        Balon b4= new Balon();
        Balon b5= new Balon();
        Balon b6= new Balon();
        Balon b7= new Balon();
        Balon b8= new Balon();
        Balon b9= new Balon();
        Balon b10= new Balon();

        Canasta c1 = new Canasta();
        c1.agregarBalon(b1);
        c1.agregarBalon(b2);
        c1.agregarBalon(b3);
        c1.agregarBalon(b4);
        c1.agregarBalon(b5);
        c1.agregarBalon(b6);

        System.out.println("eliminar es "+b3);
        c1.sacarBalon(b3);
        c1.sacarBalon(b4);


        for(int i = 0;i<c1.getOcupadoActual();i++){

            System.out.println(c1.getBalones()[i]);

        }
        System.out.println(c1.getOcupadoActual());



    }
}
