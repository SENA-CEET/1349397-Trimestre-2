package co.edu.sena.proyectospoo.polimorfismo;

public class AvionComercial extends Avion {
	
	private float capacidadCarga;
	private float ventanas= 2;
	

	public AvionComercial(int alas, int turbinas, int sillas, int llantas, float capacidadCarga, int ventanas) {
		super(alas, turbinas, sillas, llantas);
		super.setVentanas(ventanas);
		this.capacidadCarga= capacidadCarga;
	}


	public float getCapacidadCarga() {
		return capacidadCarga;
	}


	public void setCapacidadCarga(float capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	
	

}
