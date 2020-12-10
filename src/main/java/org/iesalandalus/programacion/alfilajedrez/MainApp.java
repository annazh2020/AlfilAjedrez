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
		int opcion = 0;

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
		
		
			do {
				System.out.println("Elija un color entre BLANCO y NEGRO. Introduzca letras B o N por teclado");
				opcion = Entrada.caracter();
			} while (opcion !='B' && opcion != 'N');
			
				
				if (opcion=='B') {
					System.out.println("Has elegido el color Blanco.");
				}else {
					System.out.println("Has elegido el color Negro.");
				}
				return (opcion=='B')? Color.BLANCO : Color.NEGRO;
			
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
	
	/*private static Direccion elegirDireccion() {
		int opcion=0;

		do {
			System.out.println("Elija una opción valida: de 1 a 4 ambas inclusive.");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		switch (opcion) {
		case 1:
			opcion=Direccion.ABAJO_DERECHA;
			System.out.println("Ha elegido la opcion de mover hacía ARRIBA_DERECHA.");
			break;
			
		case 2:
			
			System.out.println("Has elegido la opción de mover hacía ARRIBA_IZQUIERDA.");
			break;
			
		case 3:
			System.out.println("Has elegido la opción de mover hacía ABAJO_DERECHA.");
			break;
			
		case 4:
			System.out.println("Ha elegido la opción de mover hacía ABAJO_IZQUIERDA.");
			break;
		}
		return Direccion.;
		
	}*/
	
	private static void crearAlfilDefecto() {
		Alfil alfil=new Alfil();
		System.out.println("Has creado el alfil por defecto:" + alfil);
	}
	
	
	private static void crearAlfilColor() {
		
		Alfil alfil2=new Alfil(elegirColor());
		System.out.println("Has creado alfil:" + alfil2);
	}
	
	private static void crearAlfilColorColumna() {
		
		Alfil alfil3=new Alfil (elegirColor(),elegirColumnaInicial());
		System.out.println("Has creado alfil:" + alfil3);
	}




	
	
public static void main(String[] args) {
	
//	MainApp.mostrarAlfil();
	
//	MainApp.mostrarMenu();
	
   // MainApp.elegirOpcion();
	
//	MainApp.elegirColumnaInicial();
	
//	MainApp.mostrarMenuDirecciones();
	
	//MainApp.elegirColor();
	
	//MainApp.crearAlfilColor();
	
	MainApp.crearAlfilColorColumna();
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
}