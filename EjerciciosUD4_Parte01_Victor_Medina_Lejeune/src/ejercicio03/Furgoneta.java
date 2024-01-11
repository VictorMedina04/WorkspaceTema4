package ejercicio03;

public class Furgoneta extends VehiculosMotor {

	private boolean transporteMercancia;

	public Furgoneta(String matricula, String numeroBastidores, int categoriaEmisiones, boolean transporteMercancia) {
		super(matricula, numeroBastidores, categoriaEmisiones);
		this.transporteMercancia = transporteMercancia;
	}

	public double calcularImpuesto() {
		double impuestoPotencia = 0;
		if (transporteMercancia) {
			impuestoPotencia = 150;
		}
		return super.calcularImpuesto() + impuestoPotencia;
	}

}
