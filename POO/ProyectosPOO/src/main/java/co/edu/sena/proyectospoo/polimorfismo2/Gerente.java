package co.edu.sena.proyectospoo.polimorfismo2;

public class Gerente extends Empleado {
	
	@Override
	public void trabajar(){
		System.out.println("yo trabajo como gerente");
	}
	
	public void mandar(){
		System.out.println("mando a los empleados");
	}

}
