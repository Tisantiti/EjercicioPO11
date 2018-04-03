package datos;

public class Interurbanos extends Autobus {

	private double num_Km;
	
	public Interurbanos(int num_Iden, Conductor conductor, double precio_Base, double num_Km) {
		super(num_Iden, conductor, precio_Base);
		this.num_Km = num_Km;
		// TODO Auto-generated constructor stub
	}

	
	public double getNum_Km() {
		return num_Km;
	}


	public void setNum_Km(double num_Km) {
		this.num_Km = num_Km;
	}


	@Override
	public double calcularPrecio() {
		// En el caso de los autobuses interurbanos, el precio se calcula en función del 
//		número de kilómetros, multiplicando éste por el precio base. Se considera que la ruta y el número de 
//		kilómetros son variables que caracterizan al tipo de autobús correspondiente.
		
		return getNum_Km() * getNum_Iden();
	}

	

}
