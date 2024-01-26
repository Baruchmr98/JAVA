package org.generation.employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martínez", 5274, 19754.20d,"Desarrolladora Front-End" );
		Employee Arturo = new Employee("Arturo", "Ávila", 4483, 17999.62d, "Desarrollador backend");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		//Invocando métodos definidos previamente (trabajar, calcularSalario, capacitarse, infoGeneral)
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		//Utilizar información específica de cada objeto mediante sus propiedades.
		System.out.println(Daniel.getNombre() + " " + Daniel.apellido + " ocupa el puesto de " + Daniel.getPuesto());
		System.out.println(Abigail.nombre + " " + Abigail.getApellido() + " gana un salario de " + Abigail.salario);
		
		//Actualizando información mediante setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
		
	}
}
