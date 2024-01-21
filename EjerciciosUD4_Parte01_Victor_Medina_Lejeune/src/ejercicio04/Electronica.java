package ejercicio04;

public class Electronica extends Producto {

	private double impuestoLujo;

	public Electronica(double precioUnitario, String nombre, int id, double impuestoLujo) {
		super(precioUnitario, nombre, id);
		this.impuestoLujo = impuestoLujo;
	}

	public double getImpuestoLujo() {
		return impuestoLujo;
	}

	public void setImpuestoLujo(double impuestoLujo) {
		this.impuestoLujo = impuestoLujo;
	}

	@Override
	public String toString() {
		return "" + super.toString() + " impuestoLujo  " + impuestoLujo + "";
	}

	public double calcularTotal(double impuesto, double impuestoAlimentacion) {
		double total = super.calcularTotal(impuesto, impuestoAlimentacion)
				+ super.calcularTotal(impuesto, impuestoAlimentacion) * impuestoLujo / 100;
		return total;
	}
}
