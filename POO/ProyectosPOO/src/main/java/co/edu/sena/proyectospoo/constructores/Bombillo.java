package co.edu.sena.proyectospoo.constructores;

/**
 * Created by Enrique on 5/05/2017.
 */
public class Bombillo {
    private String marca;
    private float vatios;
    private float precio;

    public Bombillo(String marca, float vatios, float precio){
        this.marca= marca;
        this.vatios=vatios;
        this.precio=precio;
    }

    public Bombillo() {
    }

    public Bombillo (String marca){
        this.marca= marca;
    }

    public Bombillo (float vatios){
        this.vatios=vatios;
    }

    public Bombillo (float precio, float vatios){
        this.precio=precio;
        this.vatios=vatios;
    }



    public String getMarca() {
        return marca;
    }

    public float getVatios() {
        return vatios;
    }

    public float getPrecio() {
        return precio;
    }
}
