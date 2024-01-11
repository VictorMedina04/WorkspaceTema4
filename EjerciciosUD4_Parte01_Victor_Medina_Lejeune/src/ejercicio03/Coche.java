package ejercicio03;

public class Coche extends VehiculosMotor {

	private double potenciaCaballos;

	public Coche(String matricula, String numeroBastidores, int categoriaEmisiones, double potenciaCaballos) {
		super(matricula, numeroBastidores, categoriaEmisiones);
		this.potenciaCaballos = potenciaCaballos;
	}

	public double calcularImpuesto() {
		double porcentaje = 25;
		int cien = 100;
		return super.calcularImpuesto() + (super.calcularImpuesto() * porcentaje / cien);
	}

}
