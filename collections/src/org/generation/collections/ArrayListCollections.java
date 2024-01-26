package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {
	
	public static void main(String[] args) {
		
		//------------------ ARRAYS ----------------------
		String[] names = {
				"Eunice", "Maara", "Abigail", "Daniel", "Jonathan", "Rey", "David", "Braulio"
		};
		
		//Impresión de Arrays mediante métodos
		System.out.println(names); //No funciona cuando no está inicializado como una clase
		
		//To String
		System.out.println(Arrays.toString(names)); //Fue necesario asignar este método para mostrar el Array
		
		int[] edades = {
				12, 3, 25, 55, 69, 41, 29, 37, 18
		};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array 'names' y 'edades'
		String name1 = names[0];
		System.out.println(name1);
		int edad1 = edades[0];
		System.out.println(edad1);
		
		//Obtener la longitud del Array
		int longitudNames = names.length;
		System.out.println(longitudNames);
		
		//Mostrar cada elemento utilizando un bucle
		//ForEach
		for (String name : names) System.out.println(name);
		
		//-------------------------- ARRAY LIST ----------------------------
		//Todos los datos primitivos tienen una clase que los envuelven. Esas clases superiores, wrappers, son las manejadas por el ArrayList, que las identifica como objetos
		ArrayList<String> films = new ArrayList<String>();
		
		//Agregar elementos con el método '.add(name)'
		films.add("Inception");
		films.add("Se7en");
		films.add("The shinning");
		films.add("Pulp fiction");
		films.add("Mr Nobody");
		films.add("The shutter island");
		films.add("Ready Player One");
		
		System.out.println(films);
		
		//Obtener un elemento con el método '.get(index);'
		String film1 = films.get(0);
		System.out.println(film1);
		
		//Modificar un elemento con el método '.set(index, newValue)'
		films.set(2,  "Memento");
		String film2Get = films.get(2);
		System.out.println(film2Get);
		
		//Eliminar un elemento con el método '.remove(index)'
		films.remove(6);
		System.out.println(films);
		
		//Mostrando elementos del ArrayList en lista
		System.out.println("**** Films en lista*****");
		
		for (String film : films) System.out.println(film);
				
//		matricula.add(25253);
//		characters.add('A');
//				
//		System.out.println(matricula);
//		System.out.println(characters);
//
		
		
		
	}
}
