package co.edu.sena.proyectospoo.asociacion.ejemplo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 30/05/2017.
 */
public class Canasta {
    private List<Balon> lista = new ArrayList<>();

    public List<Balon> getLista() {
        return lista;
    }

    public void setLista(List<Balon> lista) {
        this.lista = lista;
    }
}
