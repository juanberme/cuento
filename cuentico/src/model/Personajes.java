package model;

public abstract class Personajes {
	
	protected int posx, posy, tamx, tamy;
	
	public Personajes(int posx, int posy, int tamx, int tamy) {
		this.posx = posx;
		this.posy = posy;
		this.tamx = tamx;
		this.tamx = tamx;
		this.tamy = tamy;
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
	
	
}
