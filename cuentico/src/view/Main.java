package view;

import contoller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	boolean paja,madera,ladrillos,pintar;
	private  Controller controlle;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
		

	}
	
	public void settings() {
		size(800,440);
		
		
	}

	
	public void setup() {
		controlle = new Controller(this);
		pintar=true;
		
	}
	
	public void draw() {
		
		background(0);
		
		controlle.draw();
		

		if (paja==true) {
			controlle.casotas().get(0).draw();
			controlle.animales().get(0).draw(false);
			mouseOver();
		}else {controlle.animales().get(0).draw(true);
			
		}
		if (madera==true) {
			controlle.casotas().get(1).draw();
			controlle.animales().get(1).draw(false);
			mouseOver();
		}else {controlle.animales().get(1).draw(true);
			
		}
		if (ladrillos==true) {
			controlle.casotas().get(2).draw();
			controlle.animales().get(2).draw(false);
			mouseOver();
		}else {
			controlle.animales().get(2).draw(true);
		}
		
		text("X:  "+mouseX+"   Y:   "+mouseY,mouseX,mouseY);
		
	}
	
	public void mouseOver() {
		controlle.mousencima();

		if (mouseX > 71 && mouseX < 232 && mouseY > 204 && mouseY < 406 && paja==true) {

			controlle.casotas().get(0).interior();
			
		}
		
		// casa madera

		if (mouseX > 312 && mouseX < 467 && mouseY > 147 && mouseY < 347 && madera==true) {
			controlle.casotas().get(1).interior();
		}
		
		// casa ladrillo

		if (mouseX > 574 && mouseX < 750 && mouseY > 207 && mouseY < 393 && ladrillos == true) {
			controlle.casotas().get(2).interior();
		}
		
	}
	
	public void mouseClicked() {
	
		// area paja
		if (mouseX > 85 && mouseX < 202 && mouseY > 318 && mouseY < 394) {
			paja=true;
			
		}
		// area madera
		if (mouseX > 331 && mouseX < 427 && mouseY > 286 && mouseY < 333) {
			madera = true;
			
		}
		// area ladrillo
		if (mouseX > 590 && mouseX < 739 && mouseY > 308 && mouseY < 372) {
			ladrillos = true; 
		}
		
		
		
	}
	
}
