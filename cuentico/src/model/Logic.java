package model;

import java.util.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private PApplet app;
	private String[] info1;
	private LinkedList<Personajes> animales;
	private LinkedList<Casas> casitas;
	private PImage imagenFondo,imageninicio,imagenfinal,boton,inicio,scroll;
	private int pantallita,posyscroll;

	public Logic(PApplet app) {
		this.app = app;
		imagenFondo = app.loadImage("../data/imports/img/principal.png");
		imageninicio = app.loadImage("../data/imports/img/inicio2.png");
		imagenfinal = app.loadImage("../data/imports/img/final.png");
		boton=app.loadImage("../data/imports/img/boton1.png");
		inicio=app.loadImage("../data/imports/img/scroll1.png");
		scroll=app.loadImage("../data/imports/img/scroll2.png");
		posyscroll = 440;
		pantallita=0;
		cargar();
		cargartext();
	}

	public void cargar() {

		animales = new LinkedList<Personajes>();
		casitas = new LinkedList<Casas>();
		info1 = app.loadStrings("../data/imports/cerdosHistoria.txt");

	}

	public void cargartext() {
		String[] recorrerTexto = info1[0].split(" ");
		
		for (int i = 0; i < recorrerTexto.length; i++) {
			if (recorrerTexto[i].contentEquals("cerdito")) {
				if (recorrerTexto[i + 1].contentEquals("juan")) {
					PImage juanImage = app.loadImage("../data/imports/img/cerditojuan1.png");
					PImage juanImage2 = app.loadImage("../data/imports/img/cerditojuan2.png");
					animales.add(new CerditoA(0, 0, 0, 0, juanImage, juanImage2, app));
					
					String palabra1 = recorrerTexto[i];
					palabra1.toUpperCase();
					String palabra2 = recorrerTexto[i+1];
					palabra2.toUpperCase();
					recorrerTexto[i] = palabra1;
					recorrerTexto[i+1] = palabra2;
					
					
				} else if (recorrerTexto[i + 1].contentEquals("oscar")) {
					PImage oscarImage = app.loadImage("../data/imports/img/cerditooscar1.png");
					PImage oscarImage2 = app.loadImage("../data/imports/img/cerditooscar2.png");
					animales.add(new CerditoB(0, 0, 0, 0, oscarImage, oscarImage2, app));

				} else if (recorrerTexto[i + 1].contentEquals("julian")) {
					PImage julianImage = app.loadImage("../data/imports/img/cerditojulian1.png");
					PImage julianImage2 = app.loadImage("../data/imports/img/cerditojulian2.png");
					animales.add(new CerditoC(0, 0, 0, 0, julianImage, julianImage2, app));

				}
			}
			if (recorrerTexto[i].contentEquals("casa")) {
				if (recorrerTexto[i + 1].contentEquals("de")) {
					if (recorrerTexto[i + 2].contentEquals("paja")) {
						PImage casa1Image = app.loadImage("../data/imports/img/casadepaja1.png");
						PImage casa1Image2 = app.loadImage("../data/imports/img/casadepaja2.png");
						PImage casa1Image3 = app.loadImage("../data/imports/img/casadepaja3.png");
						System.out.println("casa de paja");
						casitas.add(new Casa1(0, 0, 0, 0, casa1Image, casa1Image2, casa1Image3, app));

					} else if (recorrerTexto[i + 2].contentEquals("madera")) {
						PImage casa2Image = app.loadImage("../data/imports/img/casademadera1.png");
						PImage casa2Image2 = app.loadImage("../data/imports/img/casademadera2.png");
						PImage casa2Image3 = app.loadImage("../data/imports/img/casademadera3.png");
						System.out.println("casa de madera");
						casitas.add(new Casa2(0, 0, 0, 0, casa2Image, casa2Image2, casa2Image3, app));

					} else if (recorrerTexto[i + 2].contentEquals("ladrillos")) {
						PImage casa3Image = app.loadImage("../data/imports/img/casadeladrillos1.png");
						PImage casa3Image2 = app.loadImage("../data/imports/img/casadeladrillos2.png");
						PImage casa3Image3 = app.loadImage("../data/imports/img/casadeladrillos3.png");
						System.out.println("casa de ladrillos");
						casitas.add(new Casa3(0, 0, 0, 0, casa3Image, casa3Image2, casa3Image3, app));
					}
				}
			}
			
			if(recorrerTexto[i].contentEquals("lobo")){
				PImage lobito = app.loadImage("./data/imports/img/lobo.png");
				PImage lobito2 = app.loadImage("./data/imports/img/lobo2.png");
				animales.add(new Lobo(0,90,0,0,lobito,lobito2,app));
				
			}
			
			
			
		}
		System.out.println(casitas.size());
		
		String[] juntador;
		juntador = new String[1];
		
		for(int o = 0; o < recorrerTexto.length; o++) {
			
			juntador[0] = juntador[0] +" "+ recorrerTexto[o];
			
			
		}
		
		app.saveStrings("./data/exports/cuentoFinal.txt", juntador);
		
		
	}

	public void draw() {
		
	    switch (pantallita) {
	    
	    case 0:
	    	app.image(inicio, 0, 0);
	    	app.image(scroll, 0, getPosyscroll());
	    	System.out.println("entra");
	    	break;
	    case 1:
	    	app.image(imagenFondo, 0, 0);
	    	app.image(scroll, 0, getPosyscroll());
	    	break;
	    case 2:
	    	app.image(imagenFondo, 0, 0);
	    	getAnimales().get(0).draw(true);
	    	app.image(boton,0,0);
	    	break;
	    }
		if (getPosyscroll()==0) {
			pantallita=1;
		}
		if (getPosyscroll()==-440) {
			pantallita=2;
		}
	
		
		
		
	}

	public int getPantallita() {
		return pantallita;
	}

	public void setPantallita(int pantallita) {
		this.pantallita = pantallita;
	}

	public LinkedList<Personajes> getAnimales() {
		return animales;
	}

	public void setAnimales(LinkedList<Personajes> animales) {
		this.animales = animales;
	}

	public LinkedList<Casas> getCasitas() {
		return casitas;
	}

	public void setCasitas(LinkedList<Casas> casitas) {
		this.casitas = casitas;
	}

	public void screenini() {
		app.image(imageninicio, 0, 0);
		
	}

	public void screenend() {
		app.image(imagenfinal, 0, 0);
		
	}

	public int getPosyscroll() {
		return posyscroll;
	}

	public void setPosyscroll(int posyscroll) {
		this.posyscroll = posyscroll;
	}

}
