package co.edu.sena.proyectospoo.anidadas.ejemplo05;

import co.edu.sena.proyectospoo.anidadas.ejemplo02.InterfaceDos;

/**
 * Created by Enrique on 24/05/2017.
 */
public class ClaseUno implements InterfaceUno {
    @Override
    public InterfaceClaseDos getClaseDos() {
        return this.new ClaseDos();
    }

    private class ClaseDos implements InterfaceClaseDos {

        @Override
        public InterfaceClaseTres getClaseTres() {
            return this.new ClaseTres();
        }

        private class ClaseTres implements InterfaceClaseTres {
            @Override
            public InterfaceClaseCuatro getClaseCuatro() {
                return this.new ClaseCuatro();
            }

            public class ClaseCuatro implements InterfaceClaseCuatro {

            }
        }

    }
}
