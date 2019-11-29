package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable{
	
	private PApplet app;
	private PImage img;
	private int x;
	private int y;
	private int vel;
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
	}
	
	public void pintar() {
		app.image(img, x, y,72,110);
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
