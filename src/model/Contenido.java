package model;

import processing.core.PApplet;

public class Contenido implements Comparable<Contenido>{
	private PApplet app;
	private String nombre,tipo;
	private int posX,posY;
	private int rating,year;

	

	
	public Contenido(String nombre,int rating,int year,String tipo,int posY) {
		this.nombre=nombre;
		this.rating=rating;
		this.tipo=tipo;
		this.year=year;
		this.posY=posY;


		
	}
	

	public Contenido(PApplet app){
		this.app = app;
	}
	
	public void draw(int posX,PApplet app) {
		app.textSize(13);
		app.fill(255);
		app.text(nombre,posX,posY);
		app.text(rating,posX,posY+20);
		app.text(tipo,posX,posY+40);
		app.text(year,posX,posY+55);
	
		
	
	}


	public int compareTo(Contenido rating) {
		return  this.rating-rating.getRating();
	
	}
	
	
	
	
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	
}
