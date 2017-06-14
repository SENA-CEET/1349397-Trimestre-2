package co.edu.sena.proyectospoo.polimorfismo;

public class AvionPasajeros extends Avion {
	
	private int puestos;
	private int banio;
	private int televisor;
	
	
	public AvionPasajeros(int alas, int turbinas, int sillas, int llantas, int puestos, int banio, int televisor) {
		super(alas, turbinas, sillas, llantas);
		this.puestos = puestos;
		this.banio = banio;
		this.televisor = televisor;
	}


	public int getPuestos() {
		return puestos;
	}


	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}


	public int getBanio() {
		return banio;
	}


	public void setBanio(int banio) {
		this.banio = banio;
	}


	public int getTelevisor() {
		return televisor;
	}


	public void setTelevisor(int televisor) {
		this.televisor = televisor;
	}
	
}
