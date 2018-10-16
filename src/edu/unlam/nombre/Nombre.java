package edu.unlam.nombre;

public class Nombre implements Comparable<Nombre>{
	private String nombre;
	private int cantDeVecesRepetido;
	

	public Nombre(String nombre, int cantDeVecesRepetido) {
		this.nombre = nombre;
		this.cantDeVecesRepetido = cantDeVecesRepetido;
	}

	@Override
	public int compareTo(Nombre o) {
		return o.cantDeVecesRepetido-  this.cantDeVecesRepetido;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return this.nombre + " " + this.cantDeVecesRepetido;
	}
	
	
	
	
	

}
