package ejercicio01;

public class Apartamento extends Habitacion {

	private boolean serviciosLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numeroDiasOcupación,
			int numeroOcupantes, int numeroHabitacion, boolean serviciosLimpieza) {
		super(precioBase, ocupada, nombreCliente, numeroDiasOcupación, numeroOcupantes, numeroHabitacion);
		this.serviciosLimpieza = serviciosLimpieza;
	}

	public boolean isServiciosLimpieza() {
		return serviciosLimpieza;
	}

	public void setServiciosLimpieza(boolean serviciosLimpieza) {
		this.serviciosLimpieza = serviciosLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [serviciosLimpieza=" + serviciosLimpieza + "]";
	}

	public double calcularServiciosLimpieza() {
		double precioServiciosLimpieza = 0;
		if (serviciosLimpieza) {
			precioServiciosLimpieza = 40;
		}
		return precioServiciosLimpieza;
	}

	public double calcularPrecio(double descuento) {

		return super.calcularPrecio(descuento) + calcularPrecio(descuento);
	}

}
