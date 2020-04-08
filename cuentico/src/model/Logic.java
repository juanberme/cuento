package model;

import java.util.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private PApplet app;
	private String[] info1;
	private LinkedList<Personajes> animales;
	private LinkedList<Casas> casitas;
	private PImage imagencita;
	private PImage imagenFondo;
	
	public Logic(PApplet app) {
		
		cargar();
		
		cargartext();
	}
	
	public void  cargar() {
		
		imagenFondo = app.loadImage("./data/imports/img/principal.png");
		animales = new LinkedList<Personajes>();
		casitas = new LinkedList <Casas>();
		info1= app.loadStrings("../data/imports/cerdosHistoria.txt");
		
		
	}
	
	public void cargartext() {
		for (int i=0; i < info1.length ; i++) {
			
			
			
		}
		
	}
	
	
	
	
	
	
	

}
