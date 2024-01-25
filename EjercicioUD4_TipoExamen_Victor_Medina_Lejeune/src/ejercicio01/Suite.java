package ejercicio01;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double precioServicioHabitaciones;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numeroDiasOcupación, int numeroOcupantes,
			int numeroHabitacion, double metrosCuadrados, double precioServicioHabitaciones) {
		super(precioBase, ocupada, nombreCliente, numeroDiasOcupación, numeroOcupantes, numeroHabitacion);
		this.metrosCuadrados = metrosCuadrados;
		this.precioServicioHabitaciones = precioServicioHabitaciones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecioServicioHabitaciones() {
		return precioServicioHabitaciones;
	}

	public void setPrecioServicioHabitaciones(double precioServicioHabitaciones) {
		this.precioServicioHabitaciones = precioServicioHabitaciones;
	}

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", precioServicioHabitaciones="
				+ precioServicioHabitaciones + "]";
	}

	public double calcularPrecio(double descuentoSuite) {

		int cien = 100;

		return super.calcularPrecio(descuentoSuite) + precioServicioHabitaciones * descuentoSuite / cien;
	}
}
