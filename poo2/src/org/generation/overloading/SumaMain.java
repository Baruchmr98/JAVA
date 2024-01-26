package org.generation.overloading;

import java.math.BigDecimal;

public class SumaMain {
	public static void main(String[] args) {
		
		//Llamamos los métodos de Sumar en SumarMain
		int suma1 = Suma.sumar(8, 5);
		double suma2 = Suma.sumar(4.3, 6.26);
		
		//Para imprimir 'BigDecimal' debemos guardar los valores de los parámetros en objetos de tipo 'BigDecimal' y asignarla como argumentos de String de otra nueva instancia
		BigDecimal num1 = new BigDecimal("4.3");
		BigDecimal num2 = new BigDecimal("6.26");
		
		BigDecimal suma3 = Suma.sumar(num1, num2);
		
		System.out.println("La suma de enteros me da " + suma1);
		System.out.println("La suma de decimales me da " + suma2);
		System.out.println("La suma de BigDecimal me da " + suma3);
		
		
	}

}
