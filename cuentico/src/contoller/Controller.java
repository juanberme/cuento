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

		// area paja
		if (app2.mouseX > 85 && app2.mouseX < 202 && app2.mouseY > 318 && app2.mouseY < 394) {

		}
		// area madera
		if (app2.mouseX > 331 && app2.mouseX < 427 && app2.mouseY > 286 && app2.mouseY < 333) {

		}
		// area ladrillo
		if (app2.mouseX > 590 && app2.mouseX < 739 && app2.mouseY > 308 && app2.mouseY < 372) {

		}
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
}
