package View;

import Model.*;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Logic logica;
	
	public void settings() {
		size(1000,800);
	}
	
	public void setup() {
		logica = new Logic(this);
		logica.cargarImagenes();
	}
	
	public void draw() {
		background(255);
		logica.pintar();
	}
	
	public void mousePressed() {
		logica.crear();
	}



}
