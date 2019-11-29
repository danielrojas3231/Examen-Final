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
	private Personaje[] array;  
	private PApplet app;
	
	public Logic(PApplet app){
		this.app=app;
		this.array = new Personaje[4];
	}
	
	public void cargarImagenes(){
		bart = app.loadImage("simpson/bart_simpson.png");
		homero = app.loadImage("simpson/homero_simpson.png");
		lisa = app.loadImage("simpson/lisa_simpson.png");
		//maggie = app.loadImage("simpson/maggie_simpson.webp");
       // marge = app.loadImage("simpson/marge_simpson.webp");
		
	}
	
	public void crear() {
		if(app.mouseX>500 && app.mouseX<650 &&
			app.mouseY>700 && app.mouseY<750){
			int x= (int) app.random(200,1000-72);
			int y= (int) app.random(50,600-110);
			int img= (int) app.random(2);
			if(img==0){
				personajes.add(new Personaje(x,y,bart,app));
			}else {
				personajes.add(new Personaje(x,y,homero,app));
			}
			
		}
	}
	
	public void agregar(){
		for(int i=0; i<personajes.size();i++){
			if(personajes.get(i).isOver()){
				personajes.get(i).setX(100-34);
				personajes.get(i).setY(110);
				if(personajes.get(i).getImg() == homero){
					personajes.get(i).setImg(bart);	
				}else{
					personajes.get(i).setImg(homero);	
				}
				array[0] = personajes.get(i);
				personajes.remove(i);
				System.out.println(array.length);	
			}
		}		
	}
	
	public void iniciarHilo(){
		for(int i=0; i<personajes.size();i++){
			new Thread(personajes.get(i)).start();
		}
		
	}
	
	public void pintar() {
		app.fill(0,0,255);
		app.rect(500, 700, 150, 50,50);
		for(int i=0; i<personajes.size();i++){
			personajes.get(i).pintar();
			
		}
		try {
			for(int i=0; i<array.length;i++){
				array[i].pintar();
				
			}
			
		}catch(NullPointerException e) {
			e.getMessage();
		}
			
		
	}
	
	

}
