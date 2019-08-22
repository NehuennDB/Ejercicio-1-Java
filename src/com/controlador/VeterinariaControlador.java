package com.controlador;


import java.util.GregorianCalendar;
import java.util.List;

import com.modelo.Doctor;
import com.modelo.Revision;
import com.modelo.clase.abstracta.Animal;
import com.modelo.implementacion.VeterinariaImp;

public class VeterinariaControlador {
	
	private VeterinariaImp veterinaria;

	public VeterinariaControlador(VeterinariaImp veterinaria) {
		super();
		this.veterinaria = veterinaria;
	}
	
	public void altaAnimal(Animal animal) {
		this.veterinaria.altaAnimal(animal);
	}


	public void altaDoctor(Doctor doctor){
		this.veterinaria.altaDoctor(doctor);
	}


	public void altaRevision(Revision revision){
		this.veterinaria.altaRevision(revision);
	}


	public List<Revision> traerListaDeRevisionesXDoctor(Doctor doctor) {
		return this.veterinaria.traerListaDeRevisionesXDoctor(doctor);
	}
	
	
	public List<Revision> traerListaDeRevisionesXFecha(GregorianCalendar fecha){
		return this.veterinaria.traerListaDeRevisionesXFecha(fecha);
	}
	
	public List<Revision> traerListaDeRevisionesXDoctorYFecha(Doctor doctor, GregorianCalendar fecha) {
		return this.veterinaria.traerListaDeRevisionesXDoctorYFecha(doctor, fecha);
	}


	public List<Animal> traerListaAnimales() {
		return this.veterinaria.traerListaAnimales();
	}


	public List<Doctor> traerListaDoctor() {
		return this.veterinaria.traerListaDoctor();
	}


	public List<Revision> traerListaRevision() {
		return this.veterinaria.traerListaRevision();
	}


	public boolean doctorEnLaLista(Doctor doctor) {
		return this.veterinaria.doctorEnLaLista(doctor);
	}
	
	public boolean sonFechasIguales(GregorianCalendar a, GregorianCalendar b) {
		return this.veterinaria.sonFechasIguales(a, b);
	}

}
