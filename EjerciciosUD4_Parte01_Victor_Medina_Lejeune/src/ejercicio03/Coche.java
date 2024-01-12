package ejercicio03;

public class Coche extends VehiculosMotor {

	private double potenciaCaballos;

	public Coche(String matricula, String numeroBastidores, int categoriaEmisiones, double potenciaCaballos) {
		super(matricula, numeroBastidores, categoriaEmisiones);
		this.potenciaCaballos = potenciaCaballos;
	}

	public double getPotenciaCaballos() {
		return potenciaCaballos;
	}

	public void setPotenciaCaballos(double potenciaCaballos) {
		this.potenciaCaballos = potenciaCaballos;
	}

	public double calcularImpuesto(double porcentajeCilindrada, double porcentajeCaballos) {
		int cien = 100;
		return super.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos)
				+ (potenciaCaballos * porcentajeCaballos / cien);
	}

}
