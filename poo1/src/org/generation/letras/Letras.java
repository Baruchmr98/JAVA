package org.generation.letras;

import java.util.Scanner;

/*
 * Crear un programa que le solicite un mensaje al usuario y cuente cuántas vocales, consonantes, números y carácteres posee dicho mensaje
 * Letras: métodos para interactuar con el usuario
 * LetrasMain: Vamos a instanciar los objetos
 * Contador: Métodos para contar vocales, consonantes, número y carácteres.
 */

public class Letras {
	
	//Para que nuestro usuario interactíue, definimos un Scanner
	Scanner scanner = new Scanner(System.in);
	
	//Metemos el Scanner dentro de un método
	public String leerEntrada() {
		return scanner.nextLine();
	}
	
	//Método para proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
