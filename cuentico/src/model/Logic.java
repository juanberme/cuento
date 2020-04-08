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
	private String word;
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
		String[] recorrerTexto = info1[0].split(" ");
		for(int i = 0; i < recorrerTexto.length; i++) {
			if(recorrerTexto[i].contentEquals("cerdito")) {
				if(recorrerTexto[i+1].contentEquals("juan")) {
					
				}else if(recorrerTexto[i+1].contentEquals("oscar")) {
					
				}else if(recorrerTexto[i+1].contentEquals("julian")) {
					
				}
			}
			if(recorrerTexto[i].contentEquals("casa")) {
				if(recorrerTexto[i+1].contentEquals("de")) {
					if(recorrerTexto[i+2].contentEquals("paja")) {
						
					}else if(recorrerTexto[i+2].contentEquals("madera")) {
						
					}else if(recorrerTexto[i+2].contentEquals("ladrillos")) {
						
					}
			}
		}
		
	}
	
}
}
		
	
	
	
	
	
	
	


