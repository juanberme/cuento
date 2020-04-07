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
	
	public Logic(PApplet app) {
		
		cargar();
		
		
	}
	
	public void  cargar() {
		info1= app.loadStrings("");
		
		
		
	}
	
	
	
	
	

}
