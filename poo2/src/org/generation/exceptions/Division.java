package org.generation.exceptions;

public class Division {
	
	//Método para dividir
		public static int dividir(int num1, int num2) {
			return num1 / num2;
		}
		
	public static void main(String[] args) {
		
		/*
		 * La clase exception nos permite manejar cualquier caso excepcional con nuestro código (es el equivalente a los errores.
		 * Utiliza una estructura de control try-catch que permite manejar las excepciones
		 *   -Try, envuelve el código que puede generar una excepción y lo evalúa
		 *   -Catch, contiene el código que se ejecuta cuando se lanza la excepción
		 *      Sintaxis
		 *          try {
		 *               //Código protegido
		 *          } catch (ExceptionName e) {
		 *               //Bloque de excepción
		 *          }
		 *   -Finally, siempre se ejecuta, y se utiliza para mostrar un mensaje en caso de ser invocado. Podemos prescindir de finally.
		 */
		
		//Excepción que se arroja si un número se divide entre 0
		try {
			int resultado = dividir(10, 1);
			System.out.println("El resultado de la división es " + resultado);
		} catch (ArithmeticException e){
			System.out.println("\u001B[31mError: no puedes dividir entre 0\u001B[31m");
		} finally {
			System.out.println("\u001B[32mPrograma finalizado\u001B[0m");
		}
	}
}