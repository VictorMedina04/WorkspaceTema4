package ejercicio04;

import java.util.Arrays;

public class Venta {

	private Linea[] listado;

	public Venta(Linea[] listado) {
		super();
		this.listado = listado;
	}

	public Linea[] getListado() {
		return listado;
	}

	public void setListado(Linea[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Venta [listado=" + Arrays.toString(listado) + "]";
	}

	// Se que esta llamando al mismo método y que deberia
	// ponerse calcularTotal(array) pero me da un error
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < listado.length; i++) {
			total += listado[i].calcularTotal();
		}
		return total;
	}

	public void imprimirTicket() {
		System.out.println("La Locomotora de Triana");
		System.out.println("C/Trabajo 6");
		System.out.println("Operario: Victor \t\t\t\t\t\t Fecha:17/01/2024");
		System.out.println("Comensales: 2 \t\t\t\t\t\t\t Hora:14:38");

		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < listado.length; i++) {

			System.out.println(listado[i]);
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t  TOTAL:" + calcularTotal());
		System.out.println("\t\t\t\t\t\t  IVA BASE VAL");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\t\t\t GRACIAS POR SU VISITA");
	}
}
