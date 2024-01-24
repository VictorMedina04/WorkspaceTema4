package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double puntos;

	public CuentaCorriente(Cliente usuario, double saldo, double mantenimiento) {
		super(usuario, saldo, mantenimiento);
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		double cien = 100.0;

		puntos = cantidad * cien;
		super.setSaldo(getSaldo() + cantidad);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < getSaldo()) {

			setSaldo(getSaldo() - cantidad);

		}
	}
}
