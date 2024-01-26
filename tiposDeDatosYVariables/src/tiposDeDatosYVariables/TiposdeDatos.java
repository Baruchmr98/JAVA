package tiposDeDatosYVariables;

public class TiposdeDatos {	
	public static void main(String[] args) {  
	        System.out.println("Hola Mundo");
	        
	        int usuariosTotales = 8000;
	        System.out.println(usuariosTotales);
	        
	        float numeroDecimal = 34.67f;
	        System.out.println(numeroDecimal);
	        
	        //Método para convertir numéricos en numéricos
	        int cambioDecimal = (int) numeroDecimal;
	        System.out.println(cambioDecimal);
	        
	        //------------ Inicio de ejercicios ------------
	        
	        String costoBoleto = "500";
	        System.out.println("Usuarix "+costoBoleto);
	        
	        //Conversión de strings a numéricos
	        int intCostoBoleto = Integer.parseInt(costoBoleto);
			System.out.println(intCostoBoleto);
			
			//-------------------  -------------- ---------------
	        
			String zonaBoleto = "52";
			System.out.println("Zona a la que pertenece "+zonaBoleto);
			
			//Conversión de strings a numéricos
			double cambioZonaBoleto = Double.parseDouble(zonaBoleto);
			System.out.println(cambioZonaBoleto);
			
			//------------- Ejercicio CINE --------------
	        
	        float precioEntradas = 75.5f;
	        float precioPalomitas = 89.7f;
	        float precioBebidas = 35.5f;
	        int numAsientos = 50;
	        int salas = 10;
	        
	        //Conversión entre datos numéricos
	        double cambioSalas = (double) salas;
	        System.out.println(cambioSalas);
	        
	        //------------- Operadores aritméticos / Lógicos ------------
	        
	        
	        
	        
	    }
}