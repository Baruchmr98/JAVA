package org.generation.letras;

/*
 * Contador: Métodos para contar vocales
 * Necesitamos establecer dos grupos de métodos:
 *     Grupo 1: métodos booleanos para determinar a qué tipo de carácteres corresponde
 *     Grupo 2: métodos que van a devolver el conteo de dichos carácteres
 */

public class Contador {
	
	//Grupo 1
	public boolean esVocal(char caracter) {
		return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');
	}
	
	public boolean esNumero(char caracter) {
		//casteo para poder utilizar la tabla ASCII (48-57)
		short codigoAscii = (short)caracter;
		return codigoAscii >= 48 && codigoAscii <= 57;
	}
	public boolean esConsonante(char caracter) {
		//casteo para poder utilizar la tabla ASCII (65-90 o 97-122 y excepción de vocales)
		short codigoAscii = (short)caracter;
		return (codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >= 97 && codigoAscii <= 122) && !esVocal(caracter);
	}
	public boolean esSimbolo(char caracter) {
		return !(esVocal(caracter) || esNumero(caracter) || esConsonante(caracter));
	}
	
	//Grupo2 (Devolver el conteo de caracteres)
	
	//Método para contar vocales
	public int contarVocales(String palabra) {
		int vocales = 0;
		for(char caracter : palabra.toCharArray()) {
			if(esVocal(caracter)) {
				vocales++;
			}
		}
		return vocales;
	}
		
		//Método para contar números
		public int contarNumeros(String palabra) {
			int numeros = 0;
			for (char caracter : palabra.toCharArray() ) {
				if(esNumero(caracter)) {
					numeros++;
				}
			}
			return numeros;
		}
		
		//Método para contar consonantes
		public int contarConsonantes(String palabra) {
			int consonantes = 0;
			for (char caracter : palabra.toCharArray() ) {
				if(esConsonante(caracter)) {
					consonantes++;
				}
			}
			return consonantes;
		}
		
		//Método para contar símbolos
		public int contarSimbolos(String palabra) {
			int simbolos = 0;
			for (char caracter : palabra.toCharArray() ) {
				if(esSimbolo(caracter)) {
					simbolos++;
				}
			}
			return simbolos;
		}	
	
	
	
	
	
	
	
	
	
}
