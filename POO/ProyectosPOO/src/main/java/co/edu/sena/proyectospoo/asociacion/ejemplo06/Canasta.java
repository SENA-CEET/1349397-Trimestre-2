package co.edu.sena.proyectospoo.asociacion.ejemplo06;

/**
 * Created by Enrique on 30/05/2017.
 */
public class Canasta {
    private int tamanioTotal=10;
    private int ocupadoActual=0;
    private Balon[] balones = new Balon[10];

    public Balon[] getBalones() {
        return balones;
    }

    public void agregarBalon(Balon balon){
        if(this.ocupadoActual<10) {
            this.balones[ocupadoActual] = balon;
            this.ocupadoActual++;
        }else{
            System.out.println("esta canasta no puede tener mas balones");
        }

    }

    public void sacarBalon(Balon balon){
        //int ocupadoActual =12;
        Balon [] balonesTempo= new Balon[10];
        int j=0;
        for (int i =0;i<this.ocupadoActual;i++){
            if(balon!=this.balones[i]){
                balonesTempo[j]= this.balones[i];
                j++;
            }
        }
        this.balones=balonesTempo;
        this.ocupadoActual=j;
    }

    public int getOcupadoActual() {
        return ocupadoActual;
    }
}
