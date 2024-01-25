package ejercicio01;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion[] listaHabitaciones;
	private int numHabitaciones;

	public GestionHabitaciones(Habitacion[] listaHabitaciones, int numHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
		this.numHabitaciones = numHabitaciones;
	}

	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [listaHabitaciones=" + Arrays.toString(listaHabitaciones) + ", numHabitaciones="
				+ numHabitaciones + "]";
	}

	public void anyadir(Habitacion habitacion) {
		listaHabitaciones[numHabitaciones] = habitacion;
	}

	public double calcularPrecioHabitacion(Habitacion habitacion, double descuento) {
		return habitacion.calcularPrecio(descuento);
	}

	public double calcularRecaudado(double descuento) {
		double total = 0;
		for (int i = 0; i < numHabitaciones; i++) {
			if (listaHabitaciones[i].isOcupada()) {
				total += calcularPrecioHabitacion(listaHabitaciones[i], descuento);
			}
		}

		return total;
	}

	public void mostrarListaNoOcupadas() {
		for (int i = 0; i < listaHabitaciones.length; i++) {
			if (!listaHabitaciones[i].isOcupada()) {
				System.out.println(listaHabitaciones[i]);
			}
		}
	}

}