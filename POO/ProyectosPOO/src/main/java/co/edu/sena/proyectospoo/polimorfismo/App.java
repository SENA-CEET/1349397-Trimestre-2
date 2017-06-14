package co.edu.sena.proyectospoo.polimorfismo;

public class App {

	public static void main(String[] args) {
		Avion av = new AvionComercial(1, 2, 3, 3, 13.5F, 4);
		
		System.out.println(av);	
		
		AvionComercial ac = (AvionComercial)av;
		
		System.out.println(ac.getCapacidadCarga());
		
		Avion av2 = new Avion(2, 5, 10, 3);
		System.out.println(av2);
		
		
		AvionMilitar am3 = new AvionMilitar(2, 2, 2, 2, 2);
		
		Avion av3 = am3;
		System.out.println(am3);
		
		
		

	}

}
