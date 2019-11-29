package Model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private PImage bart;
	private PImage homero;
	private PImage lisa;
	private PImage maggie;
	private PImage marge;
	
	
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
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
	
	public void crear() {
		personajes.add(new Personaje(57,57,bart,app));
		System.out.println("entra");
	}
	
	public void pintar() {
		for(int i=0; i<personajes.size();i++){
			personajes.get(i).pintar();
			
		}
	}
	
	

}
