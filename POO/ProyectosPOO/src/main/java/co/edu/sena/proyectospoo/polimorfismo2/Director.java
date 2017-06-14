package co.edu.sena.proyectospoo.polimorfismo2;

public class Director extends Gerente {

	@Override
	public void trabajar() {
		System.out.println("trabajo como director");
	}

	@Override
	public void mandar() {
		System.out.println("mando a los gerentes");
	}
	
	public void dirijir(){
		System.out.println("planea el futuro de la empresa");
	}

}
