package view;

import contoller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	
	private  Controller controlle;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
		

	}
	
	public void settings() {
		size(800,440);
		
		
	}

	
	public void setup() {
		controlle = new Controller(this);
		
		
	}
	
	public void draw() {
		
		background(0);
		
		text("X:  "+mouseX+"   Y:   "+mouseY,mouseX,mouseY);
		controlle.draw();
		for(int i=0;i<controlle.animales().size();i++) {
			controlle.animales().get(i).draw();
			controlle.casotas().get(i).draw();
			
			
		}
		
		
	}
	
	public void mouseOver() {
		controlle.mousencima();
		
		
	}
	
	public void mouseClicked() {
		controlle.clikeo();
		
		
		
		
	}
	
}
