package com.modelo.clase.abstracta;

public abstract class Animal {
	
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String causaDeAtencion;
	
	public Animal(String nombre, String tipo, String raza, int edad, String causaDeAtencion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
		this.causaDeAtencion = causaDeAtencion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCausaDeAtencion() {
		return causaDeAtencion;
	}

	public void setCausaDeAtencion(String causaDeAtencion) {
		this.causaDeAtencion = causaDeAtencion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", raza=" + raza + ", edad=" + edad
				+ ", causaDeAtencion=" + causaDeAtencion + "]";
	}
	
	
	
	
	
	
	
	

}
