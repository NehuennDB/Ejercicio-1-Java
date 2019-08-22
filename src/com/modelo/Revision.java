package com.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.modelo.clase.abstracta.Animal;

public class Revision {
	
	private GregorianCalendar fecha;
	private String causas;
	private String medicamentos;
	private Animal animal;
	private Doctor doctor;
	
	public Revision(GregorianCalendar fecha, String causas, String medicamentos, Animal animal, Doctor doctor) {
		super();
		this.fecha = fecha;
		this.causas = causas;
		this.medicamentos = medicamentos;
		this.animal = animal;
		this.doctor = doctor;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public String getCausas() {
		return causas;
	}

	public void setCausas(String causas) {
		this.causas = causas;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Revision [fecha=" + this.traerFechaCorta(fecha) + ", causas=" + causas + ", medicamentos=" + medicamentos + ", animal="
				+ animal + ", doctor=" + doctor + "]";
	}
	

	public static String traerFechaCorta(GregorianCalendar f){
  		return f.get(GregorianCalendar.DAY_OF_MONTH)+"/"+f.get(GregorianCalendar.MONTH)+"/"+f.get(GregorianCalendar.YEAR);
  	}
	
	
	
	
	

}
