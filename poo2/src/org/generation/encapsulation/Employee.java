package org.generation.encapsulation;


//El método main lo ocupamos cuando instanciamos nuestros objetos
/*
  La estructura básica para crear objetos es la siguiente:
  1. Atributos o propiedades
  2. Método constructor (1 - n métodos)
  3. Métodos del objeto (comportamiento)
  4. Métodos Getters y Setters
  5. Método String
 */

public class Employee {
	//1. Atributos o propiedades.
	//1.1. Encapsulamiento mediante la modificación del acceso 'private'
	private String nombre;
	private String apellido;
	private String puesto;
	private int id;
	private double salario;
	
	//2. Método constructor. Tiene el mismo nombre que la clase. No retorna nada, recibe parámetros (atributos) y los asigna a variables del constructor (this).
	Employee(String nombre, String apellido, int id, double salario, String puesto){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}

	
	//3. Métodos del objeto (comportamiento)
	//3.1. Modificación del acceso a 'public'
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
	public void calcularSalario() {
		System.out.println("El salario del empleado " + this.nombre + " " + this.apellido + " es de $" + this.salario + " pesos");
	}
	public void capacitarse() {
		System.out.println("El trabajador del puesto "+ this.puesto + " se capacita");
	}
	public void infoGeneral() {
		System.out.println("Id: " +this.id + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido);
	}
	
	//4. Getters y Setters. Son métodos que nos permiten obtener o enviar información que está protegida por modificadores de acceso y, de esta manera, interactúa con nuestros objetos. 
	/*Los getters nos permiten obtener la info 
	 *Los setters nos permiten enviar la info.
	*/
	
	/*
	 * Estructura de Getter:
	 * 		public tipoDato getNombreVariable () {
	 * 			return nombreVariable;
	 * 		}
	 * 		p.e.
	 * 			public String getNombre () {
	 * 				return nombre;	
	 * 			}
	 * Estructura de Setter:
	 * 		public void setNombreVariable (variable) {
	 * 			this.variable = variable;
	 * 		}
	 * 		p.e.
	 * 			public void setNombre (String nombre) {
	 * 				this.nombre = nombre;	
	 * 			}
	 * 
	 * Podemos inicalizar getters y setters dando click derecho > source > generate getters y setters
	 */
	
	//----------------GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalario() {
		return salario;
	}
	
	//----------------SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//5. Método toString. Es un "Override" que se refiere a la capacidad de proporcionar información específica de una clase en forma de cadena de caracteres. Nos permite imprimir nuestros objetos en formato 'String'.
	//Podemos inicalizar toString dando click derecho > source > generate toString > Fields > Generate

	@Override 
	public String toString() {
		return "Employee ["
				+ "nombre=" + nombre + 
				", apellido=" + apellido + 
				", puesto=" + puesto + 
				", id=" + id
				+ ", salario=" + salario + 
				"]";
	}
	
	
	
	
	
	
	
}
