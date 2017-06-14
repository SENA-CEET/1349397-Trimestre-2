package co.edu.sena.proyectospoo.asociacion.ejemplo05;

/**
 * Created by Enrique on 30/05/2017.
 */
public class APP2 {
    public static void main(String[] args) {
        Balon b1 = new Balon();
        Balon b2 = new Balon();
        Balon b3 = new Balon();
        Balon b4 = new Balon();
        Balon b5 = new Balon();
        Balon b6 = new Balon();
        Balon b7 = new Balon();
        Balon b8 = new Balon();
        Balon b9 = new Balon();
        Balon b10 = new Balon();

        Canasta c1 = new Canasta();
        c1.getBalones()[0] = b1;
        c1.getBalones()[1] = b2;
        c1.getBalones()[2] = b3;
        c1.getBalones()[3] = b4;
        c1.getBalones()[4] = b5;
        c1.getBalones()[5] = b6;
        c1.getBalones()[6] = b7;
        c1.getBalones()[7] = b8;
        c1.getBalones()[8] = b9;
        c1.getBalones()[9] = b10;

        System.out.println("este es el balon que voy a borrar"+c1.getBalones()[2]);

        Balon [] canastaTemporal= new Balon[10];
        int j=0;
        for(int i=0;i<c1.getBalones().length;i++){
            if(c1.getBalones()[i]!=b3){
                canastaTemporal[j]=c1.getBalones()[i];
                j++;
            }


        }

        c1.setBalones(canastaTemporal);

        for (int i=0;i<c1.getBalones().length ; i++){
            System.out.println(c1.getBalones()[i]);
        }



    }


}
