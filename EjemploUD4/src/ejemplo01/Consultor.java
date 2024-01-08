package ejemplo01;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;

	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString() + "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}

	public double calcularPaga() {

		return horas * tarifa;
	}
}