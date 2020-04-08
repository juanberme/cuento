package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Lobo extends Personajes{

	public Lobo(int posx, int posy, int tamx, int tamy, PImage lobito, PImage lobito2, PApplet app) {
		super(posx, posy, tamx, tamy, lobito, lobito2, app);
	}
	
	public void draw(boolean pintar) {
		if (pintar ==true) {
			
		appp.image(getImagen1(), getPosx(), getPosy());
		
		}
	}
	
	public void interior() {
		appp.image(getImagen2(), getPosx(), getPosy());
		
	}
	
	

}
