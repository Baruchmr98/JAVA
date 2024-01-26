// Baruch Moreno Romero, compañero 6/6.

package com.baruch.livecoding;

/*
 * 1.- Construye un programa que imprima números del 1 al 100.

2.- Cuando el número sea múltiplo de 3 imprimir Fizz en lugar del número.

3.- Cuando el número sea un múltiplo de 5 imprimir Buzz en lugar del número.

4.- Cuando el número sea múltiplo de 3 y de 5 imprimir FizzBuzz en lugar del número.

5.- El programa no recibira inputs y cada número debe ir impreso en una línea.

6.- Debes escribir el código en una clase llamada FizzBuzz que contenga por lo menos un método, imprimir.

7.- En una clase Main, debes crear un objeto de dicha clase para imprimir el resultado.
 */

public class FizzBuzz {
	
	public static void main(String[] args) {
		
	        int[] n = new int[100];

	        for (int i = 0; i < 100; i++) {
	            n[i] = i + 1; 
	        }

        for (int e : n) {
            if ((e % 5 == 0) && (e % 3 == 0)) {
            	System.out.println("FizzBuzz");
            } else if (e % 5 == 0){ 
                System.out.println("Buzz");
            }else if (e % 3 == 0) {
            	System.out.println("Fizz");
            } else {
            	System.out.println(e);
            }
        }
    }
}
