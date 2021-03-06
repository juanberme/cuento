package contoller;

import java.util.LinkedList;

import model.Casas;
import model.Logic;
import model.Personajes;
import processing.core.PApplet;

public class Controller {
	private PApplet app2;
	private Logic logi;

	public Controller(PApplet app) {
		this.app2 = app;
		logi = new Logic(app2);
	}

	public void mousencima() {

	}

	public void clikeo() {

	}

	public void draw() {
		logi.draw();

	}

	public LinkedList<Personajes> animales() {

		return logi.getAnimales();
	}

	public LinkedList<Casas> casotas() {

		return logi.getCasitas();

	}

	public void screenini() {
		logi.screenini();
	}

	public void screenend() {
		logi.screenend();
		
	}
	
	public int scrolly() {
		
		return logi.getPosyscroll();
		
	}
	
	public int pantallita() {
		return logi.getPantallita();
	}
	
	
	public void scroly(int scroy) {
		
		logi.setPosyscroll(scroy);
	}
}
