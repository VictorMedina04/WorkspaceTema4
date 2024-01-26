package ejercicio1;

public class Furgoneta extends Vehiculo {

	private int longitud;

	public Furgoneta(String matricula, int tiempoEstacionado, int longitud) {
		super(matricula, tiempoEstacionado);
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "" + super.toString() + " longitud=" + longitud + "";
	}

	public double calcularPrecio(double precioMinutos) {
		double pagar = super.calcularPrecio(precioMinutos);
		int cuatro = 4;
		if (longitud > cuatro) {
			pagar = longitud - cuatro;
		}
		return pagar;
	}

	public void avisoZonaEspecial() {
		int ocho = 8;
		if (longitud > ocho) {
			System.out.println("Zona especial");
		}
	}
}
