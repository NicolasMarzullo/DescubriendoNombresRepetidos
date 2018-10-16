package edu.unlam.nombre;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

	public static void imprimir(Salida salida, String path) throws FileNotFoundException {
		Set<Nombre> nombres = salida.getNombres();
		int cantAImprimir = salida.getCantidadAImprimir();
		PrintWriter pw = new PrintWriter(new File(path));
		
		int i =0;
		
		
		for(Nombre nom: nombres) {
			pw.println(nom);
			i++;
			if(i==cantAImprimir)
				break;
		}
		
		if(i==0)
			pw.println("No gana nadie");
		
		pw.close();
	}
}
