package View;

import Model.*;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Logic logica;
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		logica = new Logic(this);
		logica.cargarImagenes();
	}
	
	public void draw() {
		background(255);
	}



}
