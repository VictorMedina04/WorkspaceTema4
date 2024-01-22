package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado[] lista;
	private int numEmpleado;

	public Oficina(Empleado[] lista, int numEmpleado) {
		super();
		this.lista = lista;
		this.numEmpleado = numEmpleado;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + ", numEmpleado=" + numEmpleado + "]";
	}

	public void addArray(Empleado empleado) {
		lista[numEmpleado++] = empleado;
	}

	public double calcularSueldoEmpleado(Empleado empleado) {
		return empleado.calcularSueldo();
	}

	public double calcularGastosOficina() {

		double total = 0;

		for (int i = 0; i < lista.length; i++) {
			total += calcularSueldoEmpleado(lista[i]);
		}
		return total;
	}

	public void mostrarEmpleados(double objetivoVentas) {
		for (int i = 0; i < numEmpleado; i++) {

			System.out.println(lista[i]);

			if (lista[i] instanceof Vendedor) {
				((Vendedor) lista[i]).felicitar(objetivoVentas);
			}
		}
	}
}
