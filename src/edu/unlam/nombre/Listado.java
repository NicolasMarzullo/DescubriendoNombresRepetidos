package edu.unlam.nombre;

import java.util.ArrayList;
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

	
	public Salida resolver(){
		Set<Nombre> nombresRepetidos = new TreeSet<>();
		String nombreActual, nombreSiguiente;
		int contRepeticiones=0;
		int j=0;
		
		Collections.sort(this.nombres);
		
		nombreActual = this.nombres.get(j);
		nombreSiguiente = this.nombres.get(j);
		
		while(j<this.cantDeNombres){
			
			nombreSiguiente = this.nombres.get(j);
			if(nombreActual.equals(nombreSiguiente))
				contRepeticiones++;
			else{
				
				if(contRepeticiones>1)
					nombresRepetidos.add(new Nombre(nombreActual, contRepeticiones));
				
				contRepeticiones=0;
				
				nombreActual = nombreSiguiente;
			}
			
			j++;
		}
		
		if(contRepeticiones>1)
			nombresRepetidos.add(new Nombre(nombreActual, contRepeticiones));
		
		return new Salida(nombresRepetidos, this.nRepetidos);
	}
	
	
	
	
	
	
	

}
