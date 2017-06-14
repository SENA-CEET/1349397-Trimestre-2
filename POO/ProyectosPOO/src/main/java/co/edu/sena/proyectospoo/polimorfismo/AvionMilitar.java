package co.edu.sena.proyectospoo.polimorfismo;

public class AvionMilitar extends Avion {
	
	private int balas;

	public AvionMilitar(int alas, int turbinas, int sillas, int llantas, int balas) {
		super(alas, turbinas, sillas, llantas);
		this.balas = balas;
	}

	public int getBalas() {
		return balas;
	}

	public void setBalas(int balas) {
		this.balas = balas;
	}
	
	
	
	

}
