package co.edu.sena.proyectospoo.polimorfismo2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class APP {

	public static void main(String[] args) {
		//Director d1 = (Director) new Empleado();


		Empleado e1 = new Director();
		System.out.println("e1"+e1);
		Gerente g1 = (Gerente)e1;
		System.out.println("g1"+g1);

		Empleado e = new Empleado();
		Gerente g = new Gerente();

		//Gerente g2 = (Gerente)e;
		//System.out.println(g2);

		//Director d = (Director)g;
		//System.out.println(d);


		//app1
		Director director = new Director();
		System.out.println(director);
		director.trabajar();
		director.dirijir();
		director.mandar();

		Gerente gerente = (Gerente)director;
		System.out.println(gerente);
		gerente.mandar();
		gerente.trabajar();


		Empleado empleado = (Empleado)gerente;
		System.out.println(empleado);
		empleado.trabajar();

		Object objeto = (Object)empleado;
		System.out.println("este es desde object"+objeto);

		//APP2
		Empleado di2 = new Director();
		System.out.println(di2);
		di2.trabajar();

		Gerente em3 = new Director();
		em3.mandar();
		em3.trabajar();
		System.out.println("--------------------------");
		Ingeniero i = new Ingeniero();

		imprimir(i);

		Empleado [] empleados = new Empleado[10];
		empleados[0]= new Director();
		empleados[1]= new Gerente();
		empleados[2]= new Ingeniero();
		empleados[3]= new Empleado();
		//empleados[4]= (Empleado) new Object();//polimorfismo desendente

		for(int j =0;j<empleados.length;j++){
			System.out.println(empleados[j]);
		}





	}

	public static void imprimir(Empleado e){
		System.out.println(e);
		if(e instanceof Director){
			System.out.println(e);
			Director dt = (Director)e;
			dt.trabajar();
			dt.dirijir();
			dt.mandar();
		}else if(e instanceof Ingeniero){
			System.out.println(e);
			Ingeniero it = (Ingeniero) e;
			it.analizar();
			it.trabajar();
		}


	}

}
