package operadoresLogicos;

public class ejerciciosOperadores {
	public static void main(String[] args) {
		/* && (operador And):  devuelve true si ambas expresiones son verdaderas.
		 || (operador or): devuelve true si almenos una de las dos condiciones se cumple.
		 ! (operador not:) si la expresion booleana es false devuelve true y viceversa */
		
        int anios = 5;
		boolean esInfante = true; 
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);
		
		//---------------------------------------------------------
		
		int costoBoleto = 350;
		int totalAsientos = 62;
		int asientoAM = 4;
		int asientoEst = 6;
		int asientoNorm = 52;
		float DescInapam = 227.5f;
		float DescEst  = 245f;
		
		float costoAsientoAM = asientoAM * DescInapam;
		System.out.println(costoAsientoAM);
		float costoAsientoEst = asientoEst * DescEst;
		System.out.println(costoAsientoEst);
		float costoAsientoNorm = asientoNorm * costoBoleto;
		System.out.println(costoAsientoNorm);
		
		//--------------------------------------------------------
		int contenedor = 1;
		
		int contenedorIncrementoSufijo = contenedor++;
		System.out.println(contenedorIncrementoSufijo); //1 sufijo / 2 prefijo 
		
		int contenedorIncrementoPrefijo = ++contenedor; 
		System.out.println(contenedorIncrementoPrefijo); //3 prefijo / 2 sufijo
		
		contenedor *= 2;
		System.out.println(contenedor); //6
		
		contenedorIncrementoSufijo *= 2;
		System.out.println(contenedorIncrementoSufijo);
		
		contenedorIncrementoPrefijo *= 2;
		System.out.println(contenedorIncrementoPrefijo);
		
		int operadoresMultiples = 2 + 3 * 2 / 2;
		System.out.println(operadoresMultiples);
		
		//Concatenación de cadenas
		
		String cadena1 = "Hello";
		String cadena2 = ", ¿cómo estas?";
		String cadena1y2 = cadena1 + cadena2;
		System.out.println(cadena1y2);
		
		String apples = "2";
		String oranges = "3";
		System.out.println(apples + oranges);
		
		System.out.println("1" + apples + 2 * 4 + oranges + operadoresMultiples + "4" + 5 * 3 + 5 + 5 / 5);
		
		//Crear relaciones (asignaciones)
		
		
		
		
		
	}

}
