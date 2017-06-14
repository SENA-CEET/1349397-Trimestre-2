package co.edu.sena.proyectospoo.asociacion.ejemplo03;

/**
 * Created by Enrique on 25/05/2017.
 */
public class Carro {
    private String placa;
    private Motor motor;
    private CajaCambios cajaCambios;


    public Carro(Motor motor, CajaCambios cajaCambios){
        this.motor= motor;
        this.cajaCambios= cajaCambios;
    }

    public CajaCambios getCajaCambios() {
        return cajaCambios;
    }

    public void setCajaCambios(CajaCambios cajaCambios) {
        this.cajaCambios = cajaCambios;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
