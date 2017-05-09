package co.edu.sena.proyectospoo.generalizacion.ejemplo01;

/**
 * Created by Enrique on 9/05/2017.
 */
public class Perro extends Animal {
    private String raza;
    private String color;

    @Override
    public void morir(){
        System.out.println("atropellado");
    }

    @Override
    public void defecar(){
        System.out.println(" en cuatro y hago mis cositas");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
