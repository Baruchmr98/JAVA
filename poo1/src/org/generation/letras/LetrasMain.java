package org.generation.letras;

public class LetrasMain{
	public static void main(String[] args) {
		
		//Instanciar objetos (Letras y Contador)
		Letras letras = new Letras();
		Contador contador = new Contador();
		
		//Se comienzan a aplicar los métodos a las intancias de las clases 'Letras' y 'Contador'
		//Métodos para Letras
		
		//Se aplica el método '.mostrarMensaje' sobre la instancia de Letras para comenzar la interacción con el usuario
		letras.mostrarMensaje("Escribe un texto y te mostraré elnúmero de vocales, consonantes, símbolos y números");
		// Se guarda dentro de una variable de tipo String el método '.leerEntrada' a la instancia de letras para iniciar el Scanner que le permite al usuario ingresar el texto.
		String palabra = letras.leerEntrada();
		
		//Métodos para Contador
		
		//Se guardan dentro de variables de tipo 'int' los métodos para contar aplicados sobre la instancia de Contador y que reciben como parámetro el Scanner guardado dentro de la variable 'palabra'.
		int totalVocales = contador.contarVocales(palabra);
		System.out.println("Hay " + totalVocales + " vocales");
		
		int totalNumeros = contador.contarNumeros(palabra);
		System.out.println("Hay "+ totalNumeros + " numeros");
		
		int totalConsonantes = contador.contarConsonantes(palabra);
		System.out.println("Hay " + totalConsonantes + " consonantes");
		
		int totalSimbolos = contador.contarSimbolos(palabra);
		System.out.println("Hay " + totalSimbolos + " simbolos");
		
	}
}