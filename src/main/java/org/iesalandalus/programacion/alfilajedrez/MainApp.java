package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public MainApp() {
		
	}
	
	private static void mostrarAlfil() {
		Alfil alfil=new Alfil();
		System.out.println("El alfil mostrado por defecto es:" +alfil);
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
		return opcion;
	}
	
	private static Color elegirColor() {
		char opcion;
		Color B=Color.BLANCO;
		Color N=Color.NEGRO;
		
			do {
				System.out.println("Elija un color entre BLANCO y NEGRO. Introduzca letras B o N por teclado");
				opcion = Entrada.caracter();
			} while (opcion !='B' && opcion != 'N');
			switch (opcion) {
			case Color.BLANCO:
				System.out.println("Ha elegido el color BLANCO.");
				break;
				
			case Color.NEGRO:
				System.out.println("Has elegido el color NEGRO.");
				break;
				
				if (opcion=='B') {
					System.out.println("Has elegido el color Blanco.");
				}else {
					System.out.println("Has elegido el color Negro.");
				}
				
			}
			 return opcion;
		
	}
	
	private static char elegirColumnaInicial() {
		char opcion;
		
			do {
				System.out.println("Elija la columna inicial entre c o f");
				opcion = Entrada.caracter();
			} while (opcion !='c' && opcion != 'f');
			switch (opcion) {
			case 'c':
				System.out.println("La columna inicial elegida es la C.");
				break;
				
			case 'f':
				System.out.println("La columna inicial elegida es la F.");
				break;
				
			}
			 return opcion;
		
	}
	
	private static void mostrarMenuDirecciones() {
		
		System.out.println("Dirección 1: ARRIBA_DERECHA.");
		System.out.println("Dirección 2: ABAJO_DERECHA.");
		System.out.println("Dirección 3: ARRIBA_IZQUIERDA.");
		System.out.println("Dirección 4: ABAJO_IZQUIERDA.");
		
	}




	
	
public static void main(String[] args) {
	
//	MainApp.mostrarAlfil();
	
//	MainApp.mostrarMenu();
	
//	MainApp.elegirOpcion();
	
//	MainApp.elegirColumnaInicial();
	
	MainApp.mostrarMenuDirecciones();
	
	
	
	
	
	
	
	
	
	
	

	}
}