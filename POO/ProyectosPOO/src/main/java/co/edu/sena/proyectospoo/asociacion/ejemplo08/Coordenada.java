package co.edu.sena.proyectospoo.asociacion.ejemplo08;

/**
 * Created by Enrique on 30/05/2017.
 */
public class Coordenada {
    private double longitud;
    private double latitiud;

    public Coordenada(double longitud, double latitiud) {
        this.longitud = longitud;
        this.latitiud = latitiud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitiud() {
        return latitiud;
    }

    public void setLatitiud(double latitiud) {
        this.latitiud = latitiud;
    }
}
