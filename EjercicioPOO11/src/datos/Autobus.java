package datos;

public abstract class Autobus {
//Cada autobús se caracteriza por un 
//número de identificación, un conductor y un precio base del viaje.
	private int num_Iden;
	private Conductor conductor;
	private double precio_Base;

	
	public Autobus(int num_Iden, Conductor conductor, double precio_Base) {
		super();
		this.num_Iden = num_Iden;
		this.conductor = conductor;
		this.precio_Base = precio_Base;

	}
//	En todos los casos 
//	debe incrementarse el precio base en una cantidad que se calcula de diferente forma en cada tipo de autobús. 
//	En el caso de los autobuses urbanos el precio está en función de la ruta. Si la ruta es A, 
//	el precio del billete es el precio base+10% de dicho precio. El precio de cualquier otra ruta 
//	es el precio base+20%. En el caso de los autobuses interurbanos, el precio se calcula en función del 
//	número de kilómetros, multiplicando éste por el precio base. Se considera que la ruta y el número de 
//	kilómetros son variables que caracterizan al tipo de autobús correspondiente. Se pide:
//	Implementar un programa principal que muestre:
//	El precio de un viaje en el autobús urbano número 1 que sigue la ruta B, sabiendo que el precio base 
//	es de 0,4 euros.
//	o El precio del viaje en el autobús interurbano número 2, que recorre 1000 Km., y cuyo precio base 
//	es de 0,05 euros.
//	En ambos casos se debe imprimir el precio del billete de cada autobús, su número de identificación 
//	y el nombre del conductor, que es el mismo en ambos autobuses. Utilice una matriz para almacenar 
//	los dos objetos autobús haciendo uso del polimorfismo.
//	Nota: NO considere el precio total del billete como un atributo de autobús.
	
	public abstract double calcularPrecio();

	public int getNum_Iden() {
		return num_Iden;
	}

	public void setNum_Iden(int num_Iden) {
		this.num_Iden = num_Iden;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public double getPrecio_Base() {
		return precio_Base;
	}

	public void setPrecio_Base(double precio_Base) {
		this.precio_Base = precio_Base;
	}

	
	
	
}
