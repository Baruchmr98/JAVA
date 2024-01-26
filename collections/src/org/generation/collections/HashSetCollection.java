package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {
	
	public static void main(String[] args) {
		
		//Es una clase que muestra siempre los mismos elementos, aunque estén repetidos.
		HashSet<String> animals = new HashSet<String>();
		
		animals.add("Búho");
		animals.add("Caballo");
		animals.add("Perro");
		animals.add("Gato");
		animals.add("Ornitorrinco");
		animals.add("Cebra");
		animals.add("Ornitorrinco");
		animals.add("Mapache");
		animals.add("Capibara");
		
		//Imprimir el HashSet
		System.out.println(animals);
		
		//Conocer si un elemento se encuentre dentro del Set: contains();
		boolean ejemploContains = animals.contains("Capibara");
		System.out.println(ejemploContains);
		
		//Eliminar un elemento: remove();
		animals.remove("Cebra");
		System.out.println(animals);
		
		//Agregando elementos en una sola línea
		animals.addAll(Arrays.asList(""));
		System.out.println(animals);
		
		//Limpiar el HasSet (también aplica para Arrays
		animals.clear();
		System.out.println(animals);
		
		/*
		 * La clase HashSet no va a garantizar que los elementos se muestren según el orden establecido ya que busca eficientar la búsqueda y recuperación de los elementos.
		 * Utiliza tablas hash para almacenar los elementos y mostrarlos al usuario
		 */
		
		
	}

}
