package model;

import processing.core.PApplet;
import processing.core.PImage;

public class CerditoA extends Personajes{
	
	public CerditoA(int posx, int posy, int tamx, int tamy, PImage juanImage, PImage juanImage2, PApplet app) {
		super(posx, posy, tamx, tamy, juanImage2, juanImage2, app);
	}
	
	public void draw(boolean pintar) {
		if (pintar==true) {
		appp.image(getImagen1(),getPosx(),getPosy());
		
		}
		
	}

}
