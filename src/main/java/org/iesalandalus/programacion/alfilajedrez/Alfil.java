package org.iesalandalus.programacion.alfilajedrez;

import java.util.Objects;

import javax.naming.OperationNotSupportedException;

public class Alfil {

	private Color color;
	private Posicion posicion;
	private static final String ERROR_MOVIMIENTO = "Movimiento no permitido: ";

	public Alfil() {
		setColor(Color.NEGRO);
		posicion = new Posicion(8, 'f');
	}

	public Alfil(Color color) {
		setColor(color);
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'f');
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'f');
		}
	}

	public Color getColor(Color color) {
		return color;
	}

	private Color setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
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

	public Color getColor() {
		return color;
	}

	public Alfil(Color color, char columnaInicial) {
		setColor(color);
		if (columnaInicial != 'c' || columnaInicial != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, columnaInicial);
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, columnaInicial);
		}
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		if (pasos <= 0) {
			throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
		}
		switch (direccion) {
		case ARRIBA_DERECHA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ABAJO_DERECHA:
			try {
				posicion.setFila(posicion.getColumna() - pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ARRIBA_IZQUIERDA:
			try {
				posicion.setFila(posicion.getColumna() + pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		case ABAJO_IZQUIERDA:
			try {
				posicion.setFila(posicion.getColumna() - pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
			}
			break;
		default:
			break;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, posicion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Alfil)) {
			return false;
		}
		Alfil other = (Alfil) obj;
		return color == other.color && Objects.equals(posicion, other.posicion);
	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=%s", color, posicion);
	}

	


	

}
