package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Casa3 extends Casas {

	public Casa3(int posx, int posy, int tamx, int tamy, PImage casa3Image, PImage casa3Image2, PImage casa3Image3, PApplet app) {
		super(posx, posy, tamx, tamy, casa3Image, casa3Image2, casa3Image3, app);
	}

	public void draw() {
		app2.image(getImagen1(),getPosx(),getPosy());
		
		
	}
}
