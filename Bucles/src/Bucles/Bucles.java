package Bucles;
//import java.util.Scanner;

public class Bucles {
	public static void main(String [] args) {
		
		int cuenta = 0;
		//-------------------- Bucle do-While ---------------------
		/*
		do {
			System.out.println(cuenta); 
			cuenta++;
		} //do
		while(cuenta <= 10);
		*/
		
		//--------------------- Bucle while -----------------------
		
		while(cuenta <= 10) {
			System.out.println(cuenta); //Siempre toma el 0 porque el incremento sucede siempre a lo último, por lo que el retorno del incremento no se ejecuta en ningún lado, por lo que sólo el incremento es el que se asigna a la variable, para posteriormente entrar nuevamente en el bucle.
			cuenta++;
		}
		
		
		/*
		while(cuenta <= 10) System.out.println(++cuenta); //0-10 sufijo | 1-11 prefijo
		*/
		
		/*
		while(cuenta++ <= 10) System.out.println(cuenta); //Nunca imprime el 0 porque el System se ejecuta luego del incremento y la comparación. Pero si imprime un valor fuera de la condición porque el incremento está como sufijo, el cual compara con el valor viejo al incremento de 'cuenta', aprueba y, como el System se ejecuta después de la comparación, se imprime el valor resultado del incremento.
		*/
	}

//Scanner scr = new Scanner(System.in);
//int opcion;

//Se vieron los switchs anidados en ciclo doWhile

}
