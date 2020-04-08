package model;


import processing.core.PApplet;
import processing.core.PImage;

public class Casa1 extends Casas{
	

	public Casa1(int posx, int posy, int tamx, int tamy, PImage casa1Image, PImage casa1Image2, PImage casa1Image3, PApplet app) {
		super(posx, posy, tamx, tamy, casa1Image, casa1Image2, casa1Image3, app);
		
	}

	public void draw() {
		
		app2.image(getImagen1(),getPosx(),getPosy());
		
		
	}
	
	public void interior() {
		
		app2.image(getImagen2(),getPosx(),getPosy());
		
	}
}
