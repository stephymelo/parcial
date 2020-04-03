package model;

import java.util.Comparator;

public class ContenidoNombre implements Comparator<Contenido> {

	
	public int compare(Contenido o1, Contenido o2) {
		return (o1.getNombre().compareTo(o2.getNombre()));
		
	} 
	

}
