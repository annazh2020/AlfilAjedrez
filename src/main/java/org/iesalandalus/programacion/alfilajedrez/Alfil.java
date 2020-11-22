package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	
	private Color color;
	private Posicion posicion;
	
	
	
	
	public Alfil() {
		color = Color.NEGRO;
		posicion = new Posicion (8, 'f');
	}
	
	public Alfil (Color color) {
		if (color = COLOR_INICIAL) {
			char f;
			posicion = new Posicion (8,f);
		}
		
		setColor(color);
	}
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("El color no puede ser nulo.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("La posición no puede ser nula.");
		}
		this.posicion = posicion;
	}
	public Alfil(Color color, Posicion posicion) {
		super();
		this.color = color;
		this.posicion = posicion;
	}
	
	

}
