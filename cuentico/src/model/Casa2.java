package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Casa2  extends Casas{

	public Casa2(int posx, int posy, int tamx, int tamy, PImage casa2Image, PImage casa2Image2, PImage casa2Image3, PApplet app) {
		super(posx, posy, tamx, tamy, casa2Image, casa2Image2, casa2Image3, app);
	}

	public void draw() {
		app2.image(getImagen1(),getPosx(),getPosy());
		
		
	}
}
