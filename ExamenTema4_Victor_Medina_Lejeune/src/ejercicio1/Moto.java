package ejercicio1;

public class Moto extends Vehiculo {

	private int centimetrosCubicos;

	public Moto(String matricula, int tiempoEstacionado, int centimetrosCubicos) {
		super(matricula, tiempoEstacionado);
		this.centimetrosCubicos = centimetrosCubicos;
	}

	public int getCentimetrosCubicos() {
		return centimetrosCubicos;
	}

	public void setCentimetrosCubicos(int centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}

	@Override
	public String toString() {
		return "" + super.toString() + " centimetrosCubicos=" + centimetrosCubicos + "";
	}

	public double calcularPrecio(double precioMinutos) {
		int doscincuenta = 250, dos = 2;
		double pagar = super.calcularPrecio(precioMinutos);
		if (centimetrosCubicos < doscincuenta) {
			pagar = pagar / dos;
		}
		return pagar;
	}
}
