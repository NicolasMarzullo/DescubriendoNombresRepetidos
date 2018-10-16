package edu.unlam.nombre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoNombre {
	
	public static Listado cargar(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		ArrayList<String> nombres = new ArrayList<>();
		int cantDeNombres = sc.nextInt();
		int nRepetidos = sc.nextInt();

		sc.nextLine(); //corrige espacio en blanco
			
		for(int i=0;i<cantDeNombres;i++)
			nombres.add(sc.nextLine());
		
		sc.close();
		
		return new Listado(nombres, nRepetidos,cantDeNombres);
	}

}
