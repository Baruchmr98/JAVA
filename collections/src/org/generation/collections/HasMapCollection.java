package org.generation.collections;

import java.util.HashMap;
import java.util.Map;

public class HasMapCollection {
	
	public static void main(String[] args) {
		
		//HashMap
		HashMap<String, String> capitals = new HashMap<String, String>();
		
		//Agregando elementos "clave/valor" (.put)
		capitals.put("Villahermosa", "Tabasco");
		capitals.put("Monterrey", "Nuevo León");
		capitals.put("Guadalajara", "Jalisco");
		capitals.put("Mérida", "Yucatán");
		capitals.put("Puebla", "Puebla");
		capitals.put("Chetumal", "Quintana Roo");
		capitals.put("Toluca", "Estado de México");
		
		System.out.println(capitals);
		
		//Map.Entry<> es un método de la interfaz Map que representa una entrada en un Map. Toma como argumento los tipos de datos asignados al HashMap. El usuario asigna el nombre de la interfaz y recibe un método .entrySet() que devuelve el conjunto (Set) de las entrada (clave-valor) en el HashMap.
		//De esta manera ya podemos utilizar los métodos de abajo	
		for(Map.Entry<String, String> entry : capitals.entrySet()) {
			//Mostrar la clave (.getKey()) y el valor (.getValue()) de manera individual para su manipulación
			System.out.println(entry.getKey() + " es la capital de " + entry.getValue());
		}
		
		//------------------------------- SEGUNDO EJEMPLO ---------------------
		//Crearlo desde la interfaz. Sirve para poder cambiar entre las clases de Map
		Map<String, Integer> calificaciones = new HashMap<String, Integer>();
		
		//Agregando los elementos
		calificaciones.put("Rene", 9);
		calificaciones.put("Ximena", 10);
		calificaciones.put("Diego", 8);
		calificaciones.put("Eunice", 6);
		calificaciones.put("Rodri", 5);
		calificaciones.put("David", 8);
		calificaciones.put("Elizabeth", 7);
		
		System.out.println(calificaciones);
		
		for(Map.Entry<String, Integer> calificacion : calificaciones.entrySet()) {
//			System.out.println("La calificacion de " + calificacion.getKey() + " es de " + calificacion.getValue());
			System.out.println(calificacion);
		}
		
		
		
	}
}
