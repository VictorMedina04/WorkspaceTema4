package ejercicio03;

public class Motocicleta extends VehiculosMotor {

	private double cilindrada;

	public Motocicleta(String matricula, String numeroBastidores, int categoriaEmisiones, double cilindrada) {
		super(matricula, numeroBastidores, categoriaEmisiones);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}

	public double calcularImpuesto() {
		double porcentaje = 60;
		int cien = 100;
		return super.calcularImpuesto() + (super.calcularImpuesto() * porcentaje / cien);
	}
}
