package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable , Comparable<Personaje> {
	
	private PApplet app;
	private PImage img;
	private int x;
	private int y;
	private int vel;
	private boolean over;
	private int edad;
	private int suerte;
	
	public Personaje(int x, int y, PImage img, PApplet app){
		this.x=x;
		this.y=y;
		this.vel=4;
		this.img=img;
		this.app=app;
		this.edad= (int) app.random(30);
		this.suerte= (int) app.random(30);
		this.over=false;
	}
	
	public void pintar() {
		app.image(img, x, y,72,110);
		int d = (int) PApplet.dist(app.mouseX, app.mouseY, x, y);
		if(d<72){
			over=true;
		}
		
	}
	
	public int compareTo(Personaje o) {
        return this.edad-o.edad;
    }

	
	public PImage getImg() {
		return img;
	}

	public void setImg(PImage img) {
		this.img = img;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSuerte() {
		return suerte;
	}

	public void setSuerte(int suerte) {
		this.suerte = suerte;
	}

	public void run() {
		mover();
		
	}
	
	public void mover(){
		x+=vel;
		if(x>1000-72 || x<200){
			vel*=-1;
		}
		
	}
	


}
