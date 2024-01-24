package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int extra;

	public CuentaEmpresa(Cliente usuario, double saldo) {
		super(usuario, saldo, 0);
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		extra += 1;
		super.setSaldo(super.getSaldo() + cantidad);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < super.getSaldo()) {

			super.setSaldo(super.getSaldo() - (cantidad + 1));

		}
	}
}
