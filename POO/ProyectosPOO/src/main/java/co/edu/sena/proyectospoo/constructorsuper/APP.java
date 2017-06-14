package co.edu.sena.proyectospoo.constructorsuper;

public class APP {

	public static void main(String[] args) {
		
		AvionComercial av1 = new AvionComercial(2, 4, 2, 3, 20000000.4545F, 2);
		System.out.println(av1.getAlas());
		System.out.println(av1.getCapacidadCarga());
		av1.setAlas(5);
		System.out.println(av1.getAlas());
		System.out.println(av1.getVentanas());
		
		
		Avion av2 = new Avion(2,2,4,3);
		System.out.println(av2.getVentanas());
		

		
		

	}

}
