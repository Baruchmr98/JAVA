package org.generation.excercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Programa que permite que un usuario agregue nombre completo de estudiantes matriculados en una universidad. 
 * Posteriomente, muestra la lista de los estudiantes agregados.
 * --- Requerimientos:
 *        >Utilizar ArrayList para guardar a los estudiantes
 *        >Scanner para interactuar con el usuario y permitir que agregue estudiantes
 *        >Loop para permitir que se agreguen varios estudiantes (do-while)
 *        >Opción para salir del loop con la palabra 'Salir' (if-else, try-catch, switch)
 *        >Mostrar Lista de estudiantes (for-each)
 */

public class SistemaEscolar {
	
	public static void main(String[] args) {
		
		//1. Inicializar un ArrayList para guardar a nuestros estudiantes
		ArrayList<String> estudiantes = new ArrayList<String>();
		
		//2. Inicializar el Scanner para que el usuario comience a agregar a los estudiantes
		Scanner scanner = new Scanner(System.in);
		
		//3.Loop para agregar los nombres completos
		String nombreEstudiante;
		System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' o 'salir' para finalizar.");
		do {
			nombreEstudiante = scanner.nextLine();
			estudiantes.add(nombreEstudiante); //Se agregan los nombres puestos en el scanner
		} while(!nombreEstudiante.equals("Salir")  && !nombreEstudiante.equals("salir")); //Mientras los nombres escritos sean distintos a 'Salir' o 'salir' continúa ejecutando el bucle.
		
		//4.Mostrar lista de estudiantes (for-each)
		System.out.println("** Lista de estudiantes **");
		for (String estudiante : estudiantes) {
			if(!estudiante.equals("Salir")); //No sé por qué no lo está eliminando !!!!!!!!!!!
			System.out.println(estudiante);
		}
		
		/*
		 * 5. Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
		 * 6. Agreguar la opción que permite que el usuario elimine un estudiante 
		 * después de haberlo agregado y muestre la lista actualizada después de la 
		 * eliminación (.remove();).
		 */
		
		//5.Eliminar estudiantes
		System.out.println("Ingresa el nombre del estudiante que quieres eliminar. Escribe 'Salir' o 'salir' para finalizar.");
		do {
			nombreEstudiante = scanner.nextLine();
			estudiantes.remove(nombreEstudiante); 
		} while(!nombreEstudiante.equals("Salir")  && !nombreEstudiante.equals("salir")); //En cuanto se escribe 'Salir' se para el Loop
		
		//6.Mostrar lista de estudiantes ACTUALIZADA 
		System.out.println("** Lista de estudiantes actualizada **");
		for (String estudiante : estudiantes) {
			if(!estudiante.equals("Salir"))
			System.out.println(estudiante);
		}

		scanner.close();
	}
}
