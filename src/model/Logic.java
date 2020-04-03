package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private PApplet app;
	private String [] netflixTxt,splitTxt;
	private LinkedList<Contenido> listNetflix ;
	private PImage breakingbad,dark,mindhunter,ozark,startrek,strangerthings,theirishman;
	
	private ContenidoNombre contenidoNombre;
	private ContenidoTipo contenidoTipo;
	private ContenidoYear contenidoYear;
	private int download;


	public Logic(PApplet app) {
		netflixTxt = app.loadStrings("./netflix/netflix.txt");
		listNetflix = new LinkedList<Contenido>();
		download=0;
		contenidoNombre = new ContenidoNombre();
		contenidoTipo = new ContenidoTipo();
		contenidoYear = new ContenidoYear();
		
		breakingbad=app.loadImage("./netflix/img/breakingbad.jpg");
		dark=app.loadImage("./netflix/img/dark.jpg");
		mindhunter=app.loadImage("./netflix/img/mindhunter.jpg");
		ozark=app.loadImage("./netflix/img/ozark.jpg");
		startrek=app.loadImage("./netflix/img/startrek.jpg");
		strangerthings=app.loadImage("./netflix/img/strangerthings.jpg");
		theirishman=app.loadImage("./netflix/img/theirishman.jpg");
       this.app=app;


		loadTxt();
	}



	private void loadTxt() {
		
		for (int i = 0; i < netflixTxt.length; i++) {
	
			splitTxt= netflixTxt[i].split(",");
            int year= Integer.parseInt(splitTxt[1]);
			int rating= Integer.parseInt(splitTxt[2]);
			String nombre = splitTxt[0];
			String tipo = splitTxt[3];
			
			
			
			if(splitTxt[0].equals(splitTxt[0])) {
				lista(nombre,year,rating,tipo,100);
				
			}
			
			
//			if(splitTxt[0].trim().equals(splitTxt[0].trim())) {
//				lista(nombre,year,rating,tipo,,100);
//			
//			}
		
		}

	}


	private void lista(String nombre,int year,int rating,String tipo,int posY) {
		listNetflix.add(new Contenido(nombre,year,rating,tipo,posY));
		
		

	}

	



	public void ordenarList() {
		
		if(app.mouseX>200&&app.mouseY>400&&app.mouseX<250&&app.mouseY<450) {
			Collections.sort(listNetflix);
			download=1;
		}

		if(app.mouseX>100&&app.mouseY>400&&app.mouseX<150&&app.mouseY<450) {
			Collections.sort(listNetflix,contenidoNombre);	
			download=2;
		}

		if(app.mouseX>300&&app.mouseY>400&&app.mouseX<350&&app.mouseY<450) {
			Collections.sort(listNetflix,contenidoYear);	
			download=3;
		}

		if(app.mouseX>400&&app.mouseY>400&&app.mouseX<850+150&&app.mouseY<450) {
			Collections.sort(listNetflix,contenidoTipo);
			download=4;
		}

	}
	
	public void nuevosTxt() {

		String[] nuevoTxt;
		nuevoTxt = new String [listNetflix.size()];


		for (int i = 0; i < listNetflix.size(); i++) {

			String rating = "rating:" + listNetflix.get(i).getRating();
			String nombre = " nombre:" + listNetflix.get(i).getNombre().toUpperCase();
			String year = " edad:" + listNetflix.get(i).getYear();
			String tipo = " raza:" + listNetflix.get(i).getTipo();
		

			nuevoTxt[i] = rating + nombre + year + tipo;
		}


		switch (download) {
		case 1:
			if(app.mouseX>200&&app.mouseY>500&&app.mouseX<250&&app.mouseY<550) 
				app.saveStrings("./netflix/exportTxt/rating.txt",nuevoTxt);
			break;

		case 2:
			if(app.mouseX>200&&app.mouseY>500&&app.mouseX<250&&app.mouseY<550) 
				app.saveStrings("./netflix/exportTxt/nombre.txt",nuevoTxt);

			break;

		case 3:
			if(app.mouseX>200&&app.mouseY>500&&app.mouseX<250&&app.mouseY<550) 
				app.saveStrings("./netflix/exportTxt/year.txt",nuevoTxt);
			break;

		case 4:
			if(app.mouseX>200&&app.mouseY>500&&app.mouseX<250&&app.mouseY<550) 
				app.saveStrings("./netflix/exportTxt/tipo.txt",nuevoTxt);
			break;
		}
		
			
		}
		
	
	
	
	
	
	
	


	public LinkedList<Contenido> getListNetflix() {
		return listNetflix;
	}



	public void setListNetflix(LinkedList<Contenido> listNetflix) {
		this.listNetflix = listNetflix;
	}



	public PImage getBreakingbad() {
		return breakingbad;
	}



	public void setBreakingbad(PImage breakingbad) {
		this.breakingbad = breakingbad;
	}



	public PImage getDark() {
		return dark;
	}



	public void setDark(PImage dark) {
		this.dark = dark;
	}



	public PImage getMindhunter() {
		return mindhunter;
	}



	public void setMindhunter(PImage mindhunter) {
		this.mindhunter = mindhunter;
	}



	public PImage getOzark() {
		return ozark;
	}



	public void setOzark(PImage ozark) {
		this.ozark = ozark;
	}



	public PImage getStrangerthings() {
		return strangerthings;
	}



	public void setStrangerthings(PImage strangerthings) {
		this.strangerthings = strangerthings;
	}



	public PImage getTheirishman() {
		return theirishman;
	}



	public void setTheirishman(PImage theirishman) {
		this.theirishman = theirishman;
	}












	
	
	
	
	

}
