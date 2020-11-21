package org.iesalandalus.programacion.alfilajedrez;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;
	
	public int getFila() {
		return fila;
	}
	
	
	
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
 			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}	
		this.fila = fila;
	}
	
	public char getColumna() {
		return columna;
	}
	
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}	
		this.columna = columna;
	}

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion (Posicion posicion) {
		setColumna (posicion.getColumna());
		setFila (posicion.getFila());
	}



	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Posicion)) {
			return false;
		}
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}



	@Override
	public String toString() {
		return String.format("[fila=%s, columna=%s]", fila, columna);
	}
	
	

}
