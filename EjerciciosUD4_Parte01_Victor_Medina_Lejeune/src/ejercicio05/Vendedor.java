package ejercicio05;

public class Vendedor extends Empleado {

	private double cantidadVentas;
	private double incentivo;

	public Vendedor(String nombre, String apellido, double sueldoBase, int numero_empleado, double cantidadVentas,
			double incentivo) {
		super(nombre, apellido, sueldoBase, numero_empleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public double getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "" + super.toString() + ", cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "";
	}

	public void felicitar(double objetivoVentas) {
		if (cantidadVentas > objetivoVentas) {
			System.out.println("Felicidades has superado el objetivo del mes");
		}
	}

	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo() + cantidadVentas * incentivo / cien;
	}

}
