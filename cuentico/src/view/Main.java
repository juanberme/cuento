package view;

import contoller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	boolean paja,madera,ladrillos,pintar;
	private  Controller controlle;
	int posxini,posyini,posxini2,posyini2,pantalla,scroy;

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
		pantalla=0;
	}
	
	public void draw() {
		switch (pantalla) {
		case 0:
			background(0);
			controlle.screenini();
			
			break;
		case 1:
			background(0);
			
			controlle.draw();
			
			if(controlle.pantallita()==2) {
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
			}
			
			mouseOver();
			
			break;
		case 2:
			
			controlle.screenend();
			
			break;
		case 3:
			
			break;

		}
		
		
	}
	
	public void mouseOver() {
		if (mouseX > 345 && mouseX < 451 && mouseY > 352 && mouseY < 439 && controlle.pantallita()==2  ) {
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
		
		if (mouseX >0 && mouseX <800 && mouseY>250 && mouseY < 440 ) {
			
			scroy= controlle.scrolly();
			scroy =scroy-5;
			controlle.scroly(scroy);
		}
		

		
	}
	
	public void mouseClicked() {
	
		if (mouseX>343 &&  mouseX<486 && mouseY>233 && mouseY<298 && pantalla==0) {
			pantalla=1;
			
		}
		
		// area paja
		if (mouseX > 85 && mouseX < 202 && mouseY > 318 && mouseY < 394 && controlle.pantallita()==2) {
			paja=true;
			
		}
		// area madera
		if (mouseX > 331 && mouseX < 427 && mouseY > 286 && mouseY < 333 && controlle.pantallita()==2) {
			madera = true;
			
		}
		// area ladrillo
		if (mouseX > 590 && mouseX < 739 && mouseY > 308 && mouseY < 372 && controlle.pantallita()==2) {
			ladrillos = true; 
		}
		
		if (mouseX > 660 && mouseX< 780 && mouseY >390 && mouseY<422 && controlle.pantallita()==2) {
			
			pantalla=2;
			
		}
		
		
	}
	

	
}
