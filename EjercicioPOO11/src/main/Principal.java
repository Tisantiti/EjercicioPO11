package main;

import datos.Autobus;
import datos.Conductor;
import datos.Interurbanos;
import datos.Urbanos;

public class Principal {

	public static void main(String[] args) {
//		Implementar un programa principal que muestre:
//		El precio de un viaje en el autobús urbano número 1 que sigue la ruta B, sabiendo que el precio base 
//		es de 0,4 euros.
//		o El precio del viaje en el autobús interurbano número 2, que recorre 1000 Km., y cuyo precio base 
//		es de 0,05 euros.
//		En ambos casos se debe imprimir el precio del billete de cada autobús, su número de identificación 
//		y el nombre del conductor, que es el mismo en ambos autobuses. Utilice una matriz para almacenar 
//		los dos objetos autobús haciendo uso del polimorfismo.
//		Nota: NO considere el precio total del billete como un atributo de autobús.
		
		Conductor con1 = new Conductor("Santi", 2000);
		
		Autobus urb1 = new Urbanos(1, con1, 0.4, 'A');
		System.out.println("El conductor es "+ con1.getNombre());
		
		System.out.println("Numero de identificación: "+ urb1.getNum_Iden() +" --> Precio autobus_Urbano 1: "+ urb1.calcularPrecio() + "€");
		
		System.out.println(urb1.toString());
		
		Autobus inter1 = new Interurbanos(2, con1, 0.05, 1000);
		System.out.println("Numero de identificación: "+ inter1.getNum_Iden() +" --> Precio autobus_Interurbano 2: "+inter1.calcularPrecio() + "€");
		
		Autobus[] tabla1 = {urb1, inter1};

	}

}
