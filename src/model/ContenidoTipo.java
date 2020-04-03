package model;

import java.util.Comparator;

public class ContenidoTipo implements Comparator<Contenido> {

	
	public int compare(Contenido o1, Contenido o2) {
		return (o1.getTipo().compareTo(o2.getTipo()));
		
	} 
	

}
