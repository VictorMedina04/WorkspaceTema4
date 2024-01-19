package ejercicio04;

public class Alimentacion extends Producto {

	private boolean caducacion;
	private int diasParaCaducar;

	public Alimentacion(double precioUnitario, String nombre, int id, boolean caducacion) {
		super(precioUnitario, nombre, id);
		this.caducacion = caducacion;
	}

	public boolean isCaducacion() {
		return caducacion;
	}

	public void setCaducacion(boolean caducacion) {
		this.caducacion = caducacion;
	}

	@Override
	public String toString() {
		return "" + super.toString() + " caducacion    " + caducacion + "";
	}

	public void saberCaducadoConAviso() {

		if (diasParaCaducar > 2) {
			caducacion = true;
			System.out.println("Su producto esta caducado");
		} else {
			caducacion = false;
			System.out.println("Su producto no esta caducado");
		}
	}

	// metodo q meta un impuesto si esta caducado

	public double calcularTotal() {
		double total = 0;
		return total;
	}

}
