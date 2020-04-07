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
		
		
		
	}
	
	public void mouseOver() {
		controlle.mousencima();
		
		
	}
	
	public void mouseClicked() {
		controlle.clikeo();
		
		
		
		
	}
	
}
