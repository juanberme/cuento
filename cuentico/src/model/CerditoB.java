package model;

import processing.core.PApplet;
import processing.core.PImage;

public class CerditoB extends Personajes{

	public CerditoB(int posx, int posy, int tamx, int tamy, PImage oscarImage, PImage oscarImage2, PApplet app) {
		super(posx, posy, tamx, tamy, oscarImage2, oscarImage2, app);
	}
	public void draw() {
		
		appp.image(getImagen1(),getPosx(),getPosy());
		
		
		
	}

}
