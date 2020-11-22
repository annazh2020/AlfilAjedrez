package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	
	private Color color;
	private Posicion posicion;
	
	
	
	
	public Alfil() {
		setColor(Color.NEGRO);
		posicion = new Posicion (8, 'f');
	}
	
	public Alfil (Color color) {
		setColor(color);
		if (color == Color.NEGRO) {
			posicion = new Posicion (8,'f');
		}
		else if (color ==Color.BLANCO) {
			posicion = new Posicion (1,'f');
		}
	}
	
	public Color getColor(Color color) {
		return color;
	}
	private Color setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("El color no puede ser nulo.");
		}
		return this.color = color;
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
		this.setColor(color);
		this.posicion = posicion;
	}

	public Color getColor() {
		return color;
	}
	
	

}
