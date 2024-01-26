package org.generation.encapsulation;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martínez", 5274, 19754.20d,"Desarrolladora Front-End" );
		Employee Arturo = new Employee("Arturo", "Ávila", 4403, 17999.62d, "Desarrollador backend");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		//Invocando métodos definidos previamente (trabajar, calcularSalario, capacitarse, infoGeneral)
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		//Utilizar información específica de cada objeto mediante sus propiedades.
		//. Se modificó el acceso de los atributos a 'private', por lo que es necesario, al aplicar los métodos, traerlos mediante getters
		System.out.println(Daniel.getNombre() + " " + Daniel.getApellido() + " ocupa el puesto de " + Daniel.getPuesto());
		System.out.println(Abigail.getNombre() + " " + Abigail.getApellido() + " gana un salario de " + Abigail.getSalario());
		
		//Actualizando información mediante setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
		
	}
}
