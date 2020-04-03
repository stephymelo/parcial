package controller;

import java.util.LinkedList;

import model.Contenido;
import model.Logic;
import processing.core.PApplet;
import processing.core.PImage;

public class ControllerMain {
	private Logic logic;
	
	
	public ControllerMain(PApplet app){
		logic = new Logic(app);
	}
	
	
	public PImage breakingbad() {
		return logic.getBreakingbad();
	}
	


	public LinkedList<Contenido> listNetflix() {
		return logic.getListNetflix();
	} 
	
	
	
	public void mouseClicks() {
		logic.ordenarList();
		
		logic.nuevosTxt();
	}
	
	

}
