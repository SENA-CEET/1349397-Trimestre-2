package co.edu.sena.proyectospoo.anidadas.ejemplo07;

/**
 * Created by Enrique on 24/05/2017.
 */
public class ClaseUno {

    public static InterfaceClaseDos getClaseDos(){
        return new ClaseDos();
    }

    public static class ClaseDos implements InterfaceClaseDos{

        public static InterfaceClaseTres getClaseTres(){
            return new ClaseTres();
        }

        public static class ClaseTres implements InterfaceClaseTres{

            public static InterfaceClaseCuatro getClaseCuatro(){
                return new ClaseCuatro();
            }

            public static class ClaseCuatro implements InterfaceClaseCuatro{



            }


        }



    }

}
