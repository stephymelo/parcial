package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private ControllerMain controller; 
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(800,600);
	}

	public void setup() {
		controller = new ControllerMain(this);

		
	}

	public void draw() {
		background(0);
		
		for (int i = 0; i < controller.listNetflix().size(); i++) {
			controller.listNetflix().get(i).draw((i*(100))+70,this);	
			
			image(controller.breakingbad(),controller.listNetflix().get(i).getPosX(),controller.listNetflix().get(i).getPosY(),50,50);
	
		}
		
   paintButtons();
	   
   
	
	}
	
	public void paintButtons(){
		textSize(12);
		text("Ordenar peliculas por",150,400);
		noStroke();
		fill(255,0,0);
		
		rect(100,400,50,50);
		
		rect(200,400,50,50);
		
		rect(300,400,50,50);
		
		rect(400,400,50,50);
		fill(255);
		rect(200,500,100,50);
		fill(255);
		
		text("Nombre",100,420);
		
		text("Rating",200,420);
		
		text("Year",300,420);
		
		text("Tipo",400,420);
		fill(0);
		text("DescargarTXT",200,530);
		
		
			
	}

	
	
	public void mousePressed() {
		controller.mouseClicks();
	
		
		

	}
}
	