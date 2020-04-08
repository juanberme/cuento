package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Personajes {
	
	protected int posx, posy, tamx, tamy;
	protected PApplet appp;
	protected PImage imagen1,imagen2;
	
	public Personajes(int posx, int posy, int tamx, int tamy,PImage imagen1, PImage imagen2, PApplet app) {
		this.appp=app;
		this.posx = posx;
		this.posy = posy;
		this.tamx = tamx;
		this.tamx = tamx;
		this.tamy = tamy;
		this.imagen1 = imagen1;
		this.imagen2=imagen2;
		
	}

	public PImage getImagen1() {
		return imagen1;
	}

	public void setImagen1(PImage imagen1) {
		this.imagen1 = imagen1;
	}

	public PImage getImagen2() {
		return imagen2;
	}

	public void setImagen2(PImage imagen2) {
		this.imagen2 = imagen2;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getTamx() {
		return tamx;
	}

	public void setTamx(int tamx) {
		this.tamx = tamx;
	}

	public int getTamy() {
		return tamy;
	}

	public void setTamy(int tamy) {
		this.tamy = tamy;
	}

	public void draw() {
		
		
	}
	
	
}
