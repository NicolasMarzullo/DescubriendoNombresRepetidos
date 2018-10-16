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
		return this.cantDeVecesRepetido - o.cantDeVecesRepetido;
	}

	public void setCantDeVecesRepetido(int cantDeVecesRepetido) {
		this.cantDeVecesRepetido = cantDeVecesRepetido;
	}
	
	
	

}
