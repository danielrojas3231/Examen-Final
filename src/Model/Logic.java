package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private PImage bart;
	private PImage homero;
	private PImage lisa;
	private PImage maggie;
	private PImage marge;
	
	private PApplet app;
	
	public Logic(PApplet app){
		this.app=app;
	}
	
	public void cargarImagenes(){
		bart = app.loadImage("simpson/bart_simpson.png");
		homero = app.loadImage("simpson/homero_simpson.png");
		lisa = app.loadImage("simpson/lisa_simpson.png");
		//maggie = app.loadImage("simpson/maggie_simpson.webp");
       // marge = app.loadImage("simpson/marge_simpson.webp");
		
	}

}
