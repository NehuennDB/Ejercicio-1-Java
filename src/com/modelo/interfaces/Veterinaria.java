package com.modelo.interfaces;

import java.util.GregorianCalendar;
import java.util.List;

import com.modelo.Doctor;
import com.modelo.Revision;
import com.modelo.clase.abstracta.Animal;

public interface Veterinaria<A extends Animal, D extends Doctor, R extends Revision>  {
	
	public void altaAnimal(A animal);
	
	public void altaDoctor(D doctor);
	
	public void altaRevision(R revision);
	
	public List<R> traerListaDeRevisionesXDoctor(D doctor);
	
	public List<R> traerListaDeRevisionesXFecha(GregorianCalendar fecha);
	
	public List<R> traerListaDeRevisionesXDoctorYFecha(D doctor, GregorianCalendar fecha);
	
	public List<A> traerListaAnimales();
	
	public List<D> traerListaDoctor();
	
	public List<R> traerListaRevision();
	
	public boolean doctorEnLaLista(D doctor);
	
	public boolean sonFechasIguales(GregorianCalendar a, GregorianCalendar b);
	
	
	
	
	
	
	
	
	
	

}
