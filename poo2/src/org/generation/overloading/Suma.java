package org.generation.overloading;

import java.math.BigDecimal;

public class Suma {
	
	//Crear dos métodos llamados sumar, uno que reciba dos parámetros de tipo int y el otro recibe dos parámetros de tipo double
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	static double sumar(double num1, double num2) {//Sobrecarga de métodos
		return num1 + num2;
	}
	
	//Los decimales en JAVA
	static BigDecimal sumar(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}
	
	

}
