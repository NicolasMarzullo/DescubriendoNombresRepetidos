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
		ArchivoNombre.imprimir(listado.resolver(), "tests/out/01_CasoEnunciado.out");	
	
	}
	
	@Test
	public void testTodosIguales() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/02_TodosIguales.in");
		ArchivoNombre.imprimir(listado.resolver(), "tests/out/02_TodosIguales.out");
	}
	
	@Test
	public void testDosChiques() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/03_DosChiques.in");
		ArchivoNombre.imprimir(listado.resolver(), "tests/out/03_DosChiques.out");
	}

	@Test
	public void testNoGanaNadie() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/04_NoGanaNadie.in");
		ArchivoNombre.imprimir(listado.resolver(), "tests/out/04_NoGanaNadie.out");
	}
	
	@Test
	public void testGananmenosDeLosPedidos() throws FileNotFoundException {
		Listado listado = ArchivoNombre.cargar("tests/in/05_GananMenosDeLosPedidos.in");
		ArchivoNombre.imprimir(listado.resolver(), "tests/out/05_GananMenosDeLosPedidos.out");
	}
	
	


}
