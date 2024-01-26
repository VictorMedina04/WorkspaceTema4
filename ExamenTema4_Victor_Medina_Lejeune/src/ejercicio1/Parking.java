package ejercicio1;

import java.util.Arrays;

public class Parking {

	private String direccion;
	private Vehiculo[] lista;
	private int numVehiculos;

	public Parking(String direccion, Vehiculo[] lista, int numVehiculos) {
		super();
		this.direccion = direccion;
		this.lista = lista;
		this.numVehiculos = numVehiculos;
	}

	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", lista=" + Arrays.toString(lista) + ", numVehiculos="
				+ numVehiculos + "]";
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vehiculo[] getLista() {
		return lista;
	}

	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}

	public int getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}

	public double calcularPrecioVehiculoBuscando(Vehiculo vehiculo, String matricula, double precioMinutos) {
		vehiculo = buscarPorMatricula(matricula);
		return vehiculo.calcularPrecio(precioMinutos);
	}

	public double calcularPrecioVehiculo(Vehiculo vehiculo, double precioMinutos) {

		return vehiculo.calcularPrecio(precioMinutos);
	}

	public Vehiculo buscarPorMatricula(String matricula) {
		boolean encontrado = false;
		int i = 0;

		while (i < numVehiculos && !encontrado) {
			if (lista[i].getMatricula().equalsIgnoreCase(matricula)) {
				encontrado = true;
			}
			i++;
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public double calcularRecaudadoMotos(Vehiculo vehiculo, double precioMinutos) {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Moto) {
				total += calcularPrecioVehiculo(vehiculo, precioMinutos);
			}
		}
		return total;
	}

	public void mostrarTodosLosVehiculos() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Furgoneta) {
				((Furgoneta) lista[i]).avisoZonaEspecial();
			}
			System.out.println(lista[i]);

		}
	}

	public double calcularNavidad(double precioEnNavidad, double precioMinutos, Vehiculo vehiculo, String matricula) {

		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			total = calcularPrecioVehiculoBuscando(vehiculo, matricula, precioMinutos) + precioEnNavidad;
		}
		return total;
	}

}
