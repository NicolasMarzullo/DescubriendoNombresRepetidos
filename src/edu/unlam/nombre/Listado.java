package edu.unlam.nombre;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listado {
	private List <String> nombres;
	private int nRepetidos;
	private int cantDeNombres;
	
	
	public Listado(List<String> nombres, int nRepetidos, int cantDeNombres) {
		this.nombres = nombres;
		this.nRepetidos = nRepetidos;
		this.cantDeNombres = cantDeNombres;
	}


	public List<String> getNombres() {
		return nombres;
	}

	
	public void resolver(){
		Set<Nombre> nombresRepetidos = new TreeSet<>();
		String nombreActual, nombreSiguiente;
		int contRepeteticiones;
		int j=0;
		
		Collections.sort(this.nombres);
		 
		while(j<this.cantDeNombres){
			contRepeteticiones =1;
			nombreActual = this.nombres.get(j);
			
			nombreSiguiente = this.nombres.get(++j);
			
			while(++j<this.cantDeNombres && nombreActual.equals(nombreSiguiente = this.nombres.get(j)))
				contRepeteticiones++;
			
			nombresRepetidos.add(new Nombre(nombreActual, contRepeteticiones));
		}
		
	}
	
	
	
	
	
	
	

}
