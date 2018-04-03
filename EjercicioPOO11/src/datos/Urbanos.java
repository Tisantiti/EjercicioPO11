package datos;

public class Urbanos extends Autobus {
	
	private char ruta;
	
	public Urbanos(int num_Iden, Conductor conductor, double precio_Base, char ruta) {
		super(num_Iden, conductor, precio_Base);
		this.ruta = ruta;
	}

	public char getRuta() {
		return ruta;
	}

	public void setRuta(char ruta) {
		this.ruta = ruta;
	}
	@Override
	public double calcularPrecio() {
		//  Si la ruta es A, 
//		el precio del billete es el precio base+10% de dicho precio. El precio de cualquier otra ruta 
//		es el precio base+20%. 
		if(getRuta()=='A') {
		return getPrecio_Base() + (getPrecio_Base() * 10 / 100);
		}
		
		
		return getPrecio_Base() + (getPrecio_Base() * 20 / 100);
	}

}
