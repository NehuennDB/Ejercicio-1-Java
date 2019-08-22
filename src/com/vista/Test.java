package com.vista;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.controlador.VeterinariaControlador;
import com.modelo.Conejo;
import com.modelo.Doctor;
import com.modelo.Gato;
import com.modelo.Perro;
import com.modelo.Revision;
import com.modelo.clase.abstracta.Animal;
import com.modelo.implementacion.VeterinariaImp;

public class Test {

	public static void main(String[] args) {


		VeterinariaControlador vc = new VeterinariaControlador(new VeterinariaImp(new ArrayList<Animal>(), new ArrayList<Doctor>(), new ArrayList<Revision>()));

		vc.altaAnimal(new Perro("LIla", "Grande", "Labrador", 1, "Vacunacion"));
		vc.altaAnimal(new Perro("Tomy", "Grande", "Pastor Ingles", 3, "Corte de U�as"));
		vc.altaAnimal(new Conejo("Sol", "Peque�o", "Silver Fox", 2, "Chequeo General"));
		vc.altaAnimal(new Conejo("Max", "Peque�o", "Mini Rex", 1, "Vacunacion"));
		vc.altaAnimal(new Gato("Fiona", "Peque�o",  "Persa", 5, "Chequeo General"));
		vc.altaAnimal(new Gato("Lulu", "Peque�o", "Persa", 2, "Vacunacion"));
		vc.altaAnimal(new Perro("Lucy", "Peque�o", "Beagle", 2, "Chequeo General"));
		vc.altaAnimal(new Perro("Nina", "Grande", "Dalmata", 5, "Chequeo General"));
		vc.altaAnimal(new Perro("Pancho", "Peque�o", "Chihuahua", 5, "Chequeo General"));
		vc.altaAnimal(new Perro("Juan", "Grande", "Galgo", 1, "Vacunacion"));
		vc.altaAnimal(new Gato("Silvestre", "Peque�o", "Siames", 1, "Vacunacion"));
		vc.altaAnimal(new Gato("Lola", "Peque�o", "Siames", 3, "Chequeo General"));
		vc.altaAnimal(new Conejo("Teo", "Peque�o", "Silver Fox", 1, "Chequeo General"));
		vc.altaAnimal(new Conejo("Martin", "Peque�o", "Mini Rex", 1, "Chequeo General"));
		vc.altaAnimal(new Perro("Lucho", "Grande", "Labrador", 5, "Corte de U�as"));
		vc.altaAnimal(new Perro("Juan", "Grande", "Labrador", 1, "Corte de U�as"));
		vc.altaAnimal(new Gato("Mia", "Peque�o", "Persa", 1, "Vacunacion"));
		vc.altaAnimal(new Gato("Luna", "Peque�o", "Siames", 3, "Chequeo General"));
		vc.altaAnimal(new Gato("Luca", "Peque�o", "Persa", 1, "Vacunacion"));
		vc.altaAnimal(new Gato("Lolo", "Peque�o", "Siames", 3, "Chequeo General"));
		vc.altaAnimal(new Perro("Canela", "Grande", "Doberman", 1, "Corte de U�as"));
		
		System.out.println("\n-----------------Lista de Animales----------------------");
		for(Animal a: vc.traerListaAnimales()) {
			System.out.println(a);
		}
		
		
			vc.altaDoctor(new Doctor("Dario", "Rodriguez", 30235456));
			vc.altaDoctor(new Doctor("Lucia", "Fernandez", 35951753));
			vc.altaDoctor(new Doctor("Sebastian", "Diaz", 31741258));
			vc.altaDoctor(new Doctor("Maria", "Perez", 16789654));
			vc.altaDoctor(new Doctor("Lucas", "Lopez", 18123654));
	
		
		
		System.out.println("\n-----------------Lista de Doctores----------------------");
		for(Doctor d: vc.traerListaDoctor()){
			System.out.println(d);
		}
		
		System.out.println("\n-----------------Lista de Revisiones----------------------");
		
		
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(0), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Corte de U�as", "Ninguno", vc.traerListaAnimales().get(1), vc.traerListaDoctor().get(2)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(2), vc.traerListaDoctor().get(2)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(3), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(4), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(5), vc.traerListaDoctor().get(2)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(6), vc.traerListaDoctor().get(3)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(7), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(8), vc.traerListaDoctor().get(3)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(9), vc.traerListaDoctor().get(3)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(10), vc.traerListaDoctor().get(3)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(11), vc.traerListaDoctor().get(3)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(12), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(13), vc.traerListaDoctor().get(1)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Corte de U�as", "Ninguno", vc.traerListaAnimales().get(14), vc.traerListaDoctor().get(4)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Corte de U�as", "Ninguno", vc.traerListaAnimales().get(15), vc.traerListaDoctor().get(4)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(16), vc.traerListaDoctor().get(4)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(17), vc.traerListaDoctor().get(4)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Vacunacion", "Vacuna NXNXNX", vc.traerListaAnimales().get(18), vc.traerListaDoctor().get(0)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Chequeo General", "Ninguno", vc.traerListaAnimales().get(19), vc.traerListaDoctor().get(0)));
			vc.altaRevision(new Revision(new GregorianCalendar(), "Corte de U�as", "Ninguno", vc.traerListaAnimales().get(20), vc.traerListaDoctor().get(0)));
		
		
		for(Revision r: vc.traerListaRevision()) {
			System.out.println(r);
		}
		
		System.out.println("\nTotal de Revisiones del dia:");
		System.out.println(vc.traerListaRevision().size());
		
		System.out.println("\n-----------------Lista de Revisiones X Doctor----------------------");
		System.out.println("\n-----------------Doctor Rodriguez----------------------");
		for(Revision re: vc.traerListaDeRevisionesXDoctor(vc.traerListaDoctor().get(0))) {
			System.out.println(re);
		}
		
		System.out.println("\n-----------------Doctora Fernandez----------------------");
		for(Revision rev: vc.traerListaDeRevisionesXDoctor(vc.traerListaDoctor().get(1))) {
			System.out.println(rev);
		}
		
		System.out.println("\n-----------------Doctor Diaz----------------------");
		for(Revision revi: vc.traerListaDeRevisionesXDoctor(vc.traerListaDoctor().get(2))) {
			System.out.println(revi);
		}
		
		System.out.println("\n-----------------Doctora Perez----------------------");
		for(Revision revi: vc.traerListaDeRevisionesXDoctor(vc.traerListaDoctor().get(3))) {
			System.out.println(revi);
		}
		
		System.out.println("\n-----------------Doctor Lopez----------------------");
		for(Revision revi: vc.traerListaDeRevisionesXDoctor(vc.traerListaDoctor().get(4))) {
			System.out.println(revi);
		}
	
		

		
	}

}
