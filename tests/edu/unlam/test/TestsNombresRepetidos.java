package edu.unlam.test;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import edu.unlam.nombre.ArchivoNombre;
import edu.unlam.nombre.Listado;

public class TestsNombresRepetidos {
	
	@Test
	public void testDeCarga() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/01_CasoEnunciado.in");
		int i=0;
		List<String> nombres = listado.getNombres();
		Collections.sort(nombres);
		for(String nom: nombres)
			System.out.println( i++ + " " + nom);
	}
	
	@Test
	public void testCasoEnunciado() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/01_CasoEnunciado.in");
		
		listado.resolver();
	}


}
