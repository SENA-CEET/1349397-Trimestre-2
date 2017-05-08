package co.edu.sena.proyectospoo.sobrecargametodos;

/**
 * Created by Enrique on 8/05/2017.
 */
public class OperacionesMatematicas {
    //sobrecarga de metodos
    public int suma(int numeroUno, int numeroDos){
        return numeroUno+numeroDos;
    }

    public float suma(float numeroUno, float numeroDos){
        return numeroUno+numeroDos;
    }

    public long suma(long numeroUno, long numeroDos){
        return numeroUno+numeroDos;
    }

    public short suma(short numeroUno, short numeroDos){
        return (short)(numeroUno+numeroDos);
    }

    public byte suma(byte numeroUno, byte numeroDos){
        return (byte)(numeroUno+numeroDos);
    }

    public double suma(double numeroUno, double numeroDos){
        return numeroUno+numeroDos;
    }


}
