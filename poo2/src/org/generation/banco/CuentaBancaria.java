package org.generation.banco;

/*
 * En esta clase se definen los métodos para disparar las excepciones, es decir, el try-catch. Sin embargo, aquí no se ejecuta el try-catch
 * Se definen otros métodos como depositar dinero, retirar dinero.
 * Requerimientos:
 *    1. Trabajar bajo POO
 *    2. Encapsular (modificadores, getters y setters)
 *    3. Crear variables y métodos para instanciar objetos
 */

public class CuentaBancaria {
	private double saldo;
	private int idCuenta;
	
	
	//Constructor que recibe el atributo numero
	public CuentaBancaria(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	//Método para depositar dinero
	public void depositar(double monto) {
		saldo += monto; 
	}
	
	//Método para retirar dinerito
	    /* 1. Verificar si el monto a retirar es menor o igual al saldo actual.
	     * 2. Se puede retirar el monto solicitado
	     * 3. No se puede retirar. Calcular cuánto dinero falta para completar la operación
	     */
	
	public void retirar(double monto) throws FondosInsuficientesException {
		if(monto <= saldo) {
			saldo -= monto;
		}
		else {
			double faltante = monto-saldo;
			//Crear la instancia de la clase FondosInsuficientesException con las palabras reservadas throw new e y le pasamos el parámetro correspondiente a la variable que dispara la excepción
			throw new FondosInsuficientesException(faltante); //Nos da error en un principio porque queremos instanciar de manera local y no lo encuentra. Entonces, se va a "heredar" como parte del método con la palabra reservada throws y el nombre de la excepción
		}
	}
	
	//Se definen los getters y setters
	public double getSaldo() {
		return saldo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
}
