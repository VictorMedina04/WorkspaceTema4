package ejercicio06;

public class CuentaJoven extends Cuenta {

	private int regalo;

	public CuentaJoven(Cliente usuario, double saldo) {
		super(usuario, saldo, 0);
	}

	public int getRegalo() {
		return regalo;
	}

	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		double uno = 1;

		regalo += uno;

		setSaldo(getSaldo() + cantidad + uno);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < getSaldo()) {

			setSaldo(getSaldo() - cantidad);

		}
	}
}
