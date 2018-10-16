package edu.unlam.nombre;

import java.util.Set;

public class Salida {
	private Set<Nombre> nombres;
	private int cantidadAImprimir;
	 
	public Salida(Set<Nombre> nombres, int cantidadAImprimir) {
		this.nombres = nombres;
		this.cantidadAImprimir = cantidadAImprimir;
	}

	public Set<Nombre> getNombres() {
		return nombres;
	}

	public int getCantidadAImprimir() {
		return cantidadAImprimir;
	}
	
	
	
	 
	
	

}
