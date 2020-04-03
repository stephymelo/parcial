package model;

import java.util.Comparator;

public class ContenidoYear implements Comparator<Contenido> {

	
	public int compare(Contenido o1, Contenido o2) {
		return o1.getYear() - o2.getYear();
		
	} 
	
	
	
	
 

}
