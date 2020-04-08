package view;

import contoller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	boolean paja,madera,ladrillos,pintar;
	private  Controller controlle;
	int posxini,posyini,posxini2,posyini2;

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
		

	}
	
	public void settings() {
		size(800,440);
		
		
	}

	
	public void setup() {
		controlle = new Controller(this);
		pintar=true;
		posxini=345;
		posyini=451;
		posxini2=345+106;
		posyini2=451+90;
		
	}
	
	public void draw() {
		
		background(0);
		
		controlle.draw();
		

		if (paja==true) {
			controlle.casotas().get(0).draw();
			controlle.animales().get(1).draw(false);
			
		}else {controlle.animales().get(1).draw(true);
			
		}
		if (madera==true) {
			controlle.casotas().get(1).draw();
			controlle.animales().get(2).draw(false);
			
		}else {controlle.animales().get(2).draw(true);
			
		}
		if (ladrillos==true) {
			controlle.casotas().get(2).draw();
			controlle.animales().get(3).draw(false);
			
		}else {
			controlle.animales().get(3).draw(true);
		}
		
		text("X:  "+mouseX+"   Y:   "+mouseY,mouseX,mouseY);
		mouseOver();
		
		
	}
	
	public void mouseOver() {
		if (mouseX > 345 && mouseX < 451 && mouseY > 352 && mouseY < 439 ) {
			controlle.animales().get(0).interior();

			
		}

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
	
	public void mouseDragged() {
		
		
		/*if (mouseX > posxini && mouseX < posxini2 && mouseY >  posyini && mouseY < posyini2) {
			System.out.println("arrastrando");
			int posxlobo = controlle.animales().get(0).getPosx()+(mouseX- posxini);
			int posylobo = controlle.animales().get(0).getPosy()+(mouseY - posyini);
			controlle.animales().get(0).setPosx(posxlobo);
			controlle.animales().get(0).setPosy(posylobo);
			posxini=mouseX;
			posyini=mouseY;
			
			System.out.println("arrastrando");
			
			
		}
		
		*/
		
	}
	
}
