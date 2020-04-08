package model;

import processing.core.PApplet;
import processing.core.PImage;

public class CerditoC extends Personajes {

	public CerditoC(int posx, int posy, int tamx, int tamy, PImage julianImage, PImage julianImage2, PApplet app) {
		super(posx, posy, tamx, tamy, julianImage2, julianImage2, app);
	}
	public void draw(boolean pintar) {
		if (pintar==true) {
		appp.image(getImagen1(),getPosx(),getPosy());
		
		}
		
	}
}
