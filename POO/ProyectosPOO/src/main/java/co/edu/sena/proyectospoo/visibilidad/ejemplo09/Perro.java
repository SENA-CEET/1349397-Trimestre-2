package co.edu.sena.proyectospoo.visibilidad.ejemplo09;

/**
 * Created by Enrique on 3/05/2017.
 */
public class Perro {
    private String raza;
    private String nombre;
    private String sexo;



    //contructor no tiene retorno, se llama igual que la clase
    public Perro(String raza, String nombre){
        this.nombre=nombre;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
