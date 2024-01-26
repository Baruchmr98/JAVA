package funciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 


public class funciones {
	static class Producto {
		
		String nombre;
		double precio;
		
		Producto(String nombre, double precio) {
			
			this.nombre = nombre;
			this.precio = precio;
			
		}//función
	}//class
		
	static class CarritoCompra {
		List<Producto> productos = new ArrayList<>();
			
		void agregarProducto(Producto barbie) { //función void: No tiene un valor de retorno, no se le puede asignar un return
				productos.add(barbie);
		}
			
		double calcularTotal() { 
			double total = 0;
			for(Producto barbie : productos) {
			total += barbie.precio; 
			}
			return total;
		}	
	}

	public static void main(String[] args) {
		
		Producto munieca1 = new Producto ("Chelsa", 98.70);
		Producto munieca2 = new Producto ("Skipper", 85.40);
		
		
		CarritoCompra carrito = new CarritoCompra(); //instancia
		
		carrito.agregarProducto(munieca1);
		carrito.agregarProducto(munieca2);
		
		double totalCarrito = carrito.calcularTotal();
		
		System.out.println("Total del carrito: $"+ totalCarrito);
	
	//-------------------------------------------------------------------
		
		Scanner scanner = new Scanner (System.in); //System.in : ingreso de datos
		
		System.out.println("Ingrese el costo del producto"); //Obtener el precio de nuestro producto
		double precioProducto = scanner.nextDouble();
		
		//Calculo del descuento
		double porcentajeDescuento = 15; //Obtener el porcentaje de descuento
		double descuento = calcularDescuento(precioProducto, porcentajeDescuento);
		
		double porcentajeImpuesto = 3;//Obtener el impuesto
		double impuesto = calcularImpuesto(precioProducto, porcentajeDescuento);
		
		double total = calcularTotal(precioProducto, descuento, impuesto);//Calcular el total
		
		total = redondear(total,2);
		
		System.out.println(precioProducto);
		System.out.println(descuento);
		System.out.println(impuesto);
		System.out.println(total);
	}
	
	static double calcularDescuento (double precioProducto, double porcentajeDescuento) { //función / método para calcular el descuento
		return(precioProducto * porcentajeDescuento) / 100; //return: se hace la operación 
	}//static double calcularDescuento
	
	static double calcularImpuesto (double precioProducto, double porcentajeImpuesto) { //función / método
		return(precioProducto * porcentajeImpuesto) / 100;
	}//static double calcularImpuesto
	
	static double calcularTotal (double precioProducto, double descuento, double impuesto) {
		return (precioProducto - descuento) + impuesto;
	}
	
	static double redondear (double valor, int decimales) {
		double factor = Math.pow(10, decimales);
		return Math.round(valor*factor)/ factor;
	}
	
}
