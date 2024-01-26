package org.generation.banco;

/*
 * En cajero se instancia el objeto de tipo CuentaBancaria y se invocan los métodos definidos
 * Aquí si se pueden establecer los try-catch de la excepción que se definió en el método retirar
 * Los resultados se muestran en consola
 */

public class Cajero {
	
	public static void main(String[] args) {
		CuentaBancaria cuentaDaniel = new CuentaBancaria(41556573);
		
		//Simulamos que tenemos un Scanner y el cliente introduce dinero
		System.out.println("Depositando $500");
		cuentaDaniel.depositar(500);
		
		System.out.println("El nuevo saldo es de " + cuentaDaniel.getSaldo());
		
		//Retirar dinerito
		try {
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
			
			System.out.println("Retirando $200");
			cuentaDaniel.retirar(200);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
			
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
		}catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mLo siento, te faltan $\u001B[31m" + e.getMonto());
			e.printStackTrace(); //Método de excepciones que imprime el seguimiento del flujo de la excepción
		}
		
	}

}
