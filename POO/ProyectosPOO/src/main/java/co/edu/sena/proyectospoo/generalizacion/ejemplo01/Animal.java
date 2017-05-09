package co.edu.sena.proyectospoo.generalizacion.ejemplo01;

/**
 * Created by Enrique on 9/05/2017.
 */
public abstract class Animal {
    private float peso;
    private int edad;
    //metdo abstracto
    public abstract void morir();

    public void defecar(){
        System.out.println("estoy haciendo algo que nadie puede hacer por mi");
    }

    public void comer(){
        System.out.println("estoy comiendo mmm mmmm mm mmmmm");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
