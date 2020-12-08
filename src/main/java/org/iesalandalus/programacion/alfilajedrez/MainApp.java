package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public MainApp() {
		
	}
	
	private static void mostrarAlfil() {
		Alfil alfil1=new Alfil();
		System.out.println("El alfil mostrado por defecto es:" +alfil1);
	}
	
	private static void mostrarMenu() {
		System.out.println("Opción 1: Crear un alfil por defecto.");
		System.out.println("Opción 2: Crear un alfil de un color.");
		System.out.println("Opción 3: Crear un alfil de un color y columna inicial dada.");
		System.out.println("Opción 4: Mover el alfil.");
		System.out.println("Opción 5: Salir.");
	}
	
	private static int elegirOpcion() {
		int opcion;
		do {
			
			do {
				System.out.print("Elija una opción valida: ");
				opcion = Entrada.entero();
			} while (opcion < 1 || opcion > 5);
			switch (opcion) {
			case 1:
				System.out.println("Ha elegido la opcion de crear alfil.");
				break;
				
			case 2:
				System.out.println("Has elegido la opción de crear un alfil de un color.");
				break;
				
			case 3:
				System.out.println("Has elegido la opción de crear un alfil de un color y columna inicial dada.");
				break;
				
			case 4:
				System.out.println("Ha elegido la opción de mover el alfil.");
				break;
			case 5:
				System.out.println("Ha elegido la opción salir.");
				break;
			}
				
		} while (opcion!=5);
		return opcion;
	}




	
	
public static void main(String[] args) {
	
	MainApp.mostrarAlfil();
	
	MainApp.mostrarMenu();
	
	MainApp.elegirOpcion();
	
	
	
	
	
	
	

	}
}