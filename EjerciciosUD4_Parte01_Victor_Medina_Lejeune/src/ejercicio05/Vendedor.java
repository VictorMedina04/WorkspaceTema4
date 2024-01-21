package ejercicio05;

public class Vendedor extends Empleado {

	private int cantidadVentas;
	private double incentivo;

	public Vendedor(String nombre, String apellido, double sueldoBase, int numero_empleado, int cantidadVentas,
			double incentivo) {
		super(nombre, apellido, sueldoBase, numero_empleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
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
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}

	public void felicitar(int objetivoVentas) {
		if (cantidadVentas > objetivoVentas) {
			System.out.println("Felicidades has superado el objetivo del mes");
		}
	}

	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo() + cantidadVentas * incentivo / cien;
	}

}
