package co.edu.sena.proyectospoo.asociacion.ejemplo08;

/**
 * Created by Enrique on 30/05/2017.
 */
public class Ubicacion {
    private String nombre;
    private String direccion;

    public Ubicacion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
