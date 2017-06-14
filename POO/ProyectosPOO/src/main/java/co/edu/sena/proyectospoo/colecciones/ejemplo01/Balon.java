package co.edu.sena.proyectospoo.colecciones.ejemplo01;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Balon {
    private String marca;
    private String clase;

    public Balon(String marca, String clase) {
        this.marca = marca;
        this.clase = clase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
