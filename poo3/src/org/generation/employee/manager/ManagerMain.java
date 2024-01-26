package org.generation.employee.manager;

public class ManagerMain {
	public static void main(String[] args) {

		Manager Fernanda = new Manager("Fernanda Ramos", 136, 45365.20d, "Manager", 2);
		System.out.println(Fernanda);
		
		//Método calcular salario
		double salarioFernanda = Fernanda.getSalarioBase();
		System.out.println("El salario base de " + Fernanda.getNombreCompleto() + " con posición de " + Fernanda.getPuesto());
	}
 }