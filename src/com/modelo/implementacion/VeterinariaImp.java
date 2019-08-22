package com.modelo.implementacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.modelo.Doctor;
import com.modelo.Revision;
import com.modelo.clase.abstracta.Animal;
import com.modelo.interfaces.Veterinaria;

public class VeterinariaImp implements Veterinaria<Animal, Doctor, Revision>{
	
	private List<Animal> listaAnimales;
	
	private List<Doctor> listaDoctores;
	
	private List<Revision> listaRevisiones;
	
	public VeterinariaImp(List<Animal> listaAnimales, List<Doctor> listaDoctores, List<Revision> listaRevisiones) {
		super();
		this.listaAnimales = listaAnimales;
		this.listaDoctores = listaDoctores;
		this.listaRevisiones = listaRevisiones;
	}


	public void altaAnimal(Animal animal) {
		this.listaAnimales.add(animal);	
	}


	public void altaDoctor(Doctor doctor) {
		if(this.doctorEnLaLista(doctor)!=true) {
			this.listaDoctores.add(doctor);
		}else {
			System.out.println("El doctor ya se encuentra en la lista");
		}
		
	}


	public void altaRevision(Revision revision) {
		
		if((this.traerListaDeRevisionesXDoctorYFecha(revision.getDoctor(), revision.getFecha()).size() < 5)
				&& (this.traerListaDeRevisionesXFecha(revision.getFecha()).size() < 20)) {
			this.listaRevisiones.add(revision);
		}else {
			System.out.println("Ha superado el limite de atenciones del dia");
		}
		
		
	}

	
	public List<Revision> traerListaDeRevisionesXDoctor(Doctor doctor) {
		
		List<Revision> revisiones = new ArrayList<>();
		
		for(int i=0; i < this.listaRevisiones.size(); i++) {
			if(this.listaRevisiones.get(i).getDoctor().getDni()==doctor.getDni()) {
				revisiones.add(this.listaRevisiones.get(i));
			}
		}
		
		return revisiones;
	}
	
	
	public List<Revision> traerListaDeRevisionesXFecha(GregorianCalendar fecha){
		
		List<Revision> lista = new ArrayList<>();
		
		for(int i=0; i < this.listaRevisiones.size(); i++) {
			if(this.sonFechasIguales(this.listaRevisiones.get(i).getFecha(), fecha)) {
				lista.add(this.listaRevisiones.get(i));
			}
		}
		
		return lista;
	}
	
	
	public List<Revision> traerListaDeRevisionesXDoctorYFecha(Doctor doctor, GregorianCalendar fecha) {
		
		List<Revision> listaRevision = new ArrayList<>();
		
		for(int i=0; i < this.listaRevisiones.size(); i++) {
			if((this.listaRevisiones.get(i).getDoctor().getDni()==doctor.getDni())
					&& (this.sonFechasIguales(this.listaRevisiones.get(i).getFecha(), fecha))) {
				listaRevision.add(this.listaRevisiones.get(i));
			}
		}
		
		return listaRevision;
	}


	public List<Animal> traerListaAnimales() {
		return this.listaAnimales;
	}


	public List<Doctor> traerListaDoctor() {
		return this.listaDoctores;
	}


	public List<Revision> traerListaRevision() {
		return this.listaRevisiones;
	}


	public boolean doctorEnLaLista(Doctor doctor) {
		
		boolean bandera = false;
		
		for(int i=0; i < this.listaDoctores.size(); i++ ) {
			if(this.listaDoctores.get(i).getDni()==doctor.getDni()) {
				bandera = true;
			}
		}
		
		return bandera;
	}
	
	public boolean sonFechasIguales(GregorianCalendar a, GregorianCalendar b) {
		return ( ((a.get(Calendar.DAY_OF_MONTH)) == (b.get(Calendar.DAY_OF_MONTH))) 
				&& ((a.get(Calendar.MONTH)) == (b.get(Calendar.MONTH))) 
				&& ((a.get(Calendar.YEAR)) == (b.get(Calendar.YEAR))));
	}

}
