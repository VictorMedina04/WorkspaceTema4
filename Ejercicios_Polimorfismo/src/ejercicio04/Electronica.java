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

	// ta bien
	public double calcularTotal() {
		double total = 0;
		int cien = 100;
		return total + total * impuestoLujo / cien;
	}
}
