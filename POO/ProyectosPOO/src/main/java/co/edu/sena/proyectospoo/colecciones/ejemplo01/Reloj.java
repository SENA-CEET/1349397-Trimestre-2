package co.edu.sena.proyectospoo.colecciones.ejemplo01;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Reloj {
    private String marca;
    private String color;

    public Reloj(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
