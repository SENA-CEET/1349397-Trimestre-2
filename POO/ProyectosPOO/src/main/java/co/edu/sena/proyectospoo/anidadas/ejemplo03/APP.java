package co.edu.sena.proyectospoo.anidadas.ejemplo03;

/**
 * Created by Enrique on 22/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        Elfo e1 = new Elfo() {
            @Override
            public void comer() {
                System.out.println("como");
            }
        };
        e1.comer();

        SoldadoElfo se = new SoldadoElfo() {
            @Override
            public void peleaCuerpoCuerpo() {
                System.out.println("peleo con espada");
            }

            @Override
            public void comer() {
                System.out.println("como");
            }
        };
        se.peleaCuerpoCuerpo();
        se.comer();

        ArqueroElfo ae = new ArqueroElfo() {
            @Override
            public void peleaDistancia() {
                System.out.println("mando flecha");
            }

            @Override
            public void comer() {
                System.out.println("como");
            }
        };
        ae.comer();
        ae.peleaDistancia();

        Elfo aa =(Elfo)ae;


        System.out.println(e1);
        System.out.println(ae);
        System.out.println(se);



    }

}
