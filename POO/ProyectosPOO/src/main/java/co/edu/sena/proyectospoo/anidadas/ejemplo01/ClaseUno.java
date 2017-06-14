package co.edu.sena.proyectospoo.anidadas.ejemplo01;

/**
 * Created by Enrique on 22/05/2017.
 */
public class ClaseUno {

    private String nombre = "Jose";

    public void crearClase() {

        String texto = "hola";
        final String a = "texo";

        class ClaseDentroMetodo extends Object {

            public void metodoDentroClase() {
                System.out.println("esto dentro de una clase dentro de un metodo " + texto + " " + a + "" + nombre);

            }

        }

        abstract class ClaseDentroMeodo2 {

            public abstract void imprimir();

        }

        class ClaseDentroMetodo3 extends ClaseDentroMeodo2 {
            @Override
            public void imprimir() {
                System.out.println("hola");
            }
        }


        ClaseDentroMetodo bd = new ClaseDentroMetodo();
        bd.metodoDentroClase();
        ClaseDentroMeodo2 asd = new ClaseDentroMetodo3();
        asd.imprimir();
    }


    public class ClaseDos {

    }

    private class ClaseTres {

    }

    protected class ClaseCuatro {

    }

    class ClaseCinco {

    }

    public static class ClaseSeis {
        public ClaseSeis() {
        }
    }


}
