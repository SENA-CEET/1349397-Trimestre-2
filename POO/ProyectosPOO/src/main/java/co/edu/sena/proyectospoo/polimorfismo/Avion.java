package co.edu.sena.proyectospoo.polimorfismo;

public class Avion {
	
	private int alas;
	private int turbinas;
	private int sillas;
	private int llantas;
	private int ventanas=5;
	

	
	
	public Avion(int alas, int turbinas, int sillas, int llantas) {
		super();
		this.alas = alas;
		this.turbinas = turbinas;
		this.sillas = sillas;
		this.llantas = llantas;
	}
	
	
	
	public int getVentanas() {
		return ventanas;
	}



	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}



	public int getAlas() {
		return alas;
	}
	public void setAlas(int alas) {
		this.alas = alas;
	}
	public int getTurbinas() {
		return turbinas;
	}
	public void setTurbinas(int turbinas) {
		this.turbinas = turbinas;
	}
	public int getSillas() {
		return sillas;
	}
	public void setSillas(int sillas) {
		this.sillas = sillas;
	}
	public int getLlantas() {
		return llantas;
	}
	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}
	
	
	
	

}
