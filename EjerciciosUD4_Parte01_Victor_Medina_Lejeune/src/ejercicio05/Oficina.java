package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado[] lista;

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularSueldoEmpleado(Empleado empleado) {
		return empleado.calcularSueldo();
	}

	public double calcularGastosOficina() {

		double total = 0;

		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularSueldo();
		}
		return total;
	}
}
