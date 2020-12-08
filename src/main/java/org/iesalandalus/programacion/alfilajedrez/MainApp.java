package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public MainApp() {
		
	}
	
	public static void mostrarAlfil() {
		Alfil alfil1=new Alfil();
		System.out.println("El alfil mostrado por defecto es:" +alfil1);
	}
	
	public static void mostrarMenu() {
		System.out.println("Opción 1: Crear un alfil por defecto.");
		System.out.println("Opción 2: Crear un alfil de un color.");
		System.out.println("Opción 3: Crear un alfil de un color y columna inicial dada.");
		System.out.println("Opción 4: Mover el alfil.");
		System.out.println("Opción 5: Salir.");

	}


	
	
public static void main(String[] args) {
	
	MainApp.mostrarAlfil();
	
	MainApp.mostrarMenu();
	
	
	

	}
}