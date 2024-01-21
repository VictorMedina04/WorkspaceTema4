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

	public double calcularTotal(double impuesto, double impuestoAlimentacion) {
		double total = 0;
		for (int i = 0; i < listado.length; i++) {
			total += listado[i].calcularTotal(impuesto, impuestoAlimentacion);
		}
		return total;
	}

	public void listarProductos() {
		System.out.println("\t\tListado de productos");
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null) {
				System.out.println("--------------------------------------------------------------");
				System.out.println(listado[i]);
			}
		}
	}

	public void imprimirTicket(double impuesto, double impuestoAlimentacion) {
		System.out.println("La Locomotora de Triana");
		System.out.println("C/Trabajo 6");
		System.out.println("Operario: Victor \t\t\t\t\t\t Fecha:17/01/2024");
		System.out.println("Comensales: 2 \t\t\t\t\t\t\t Hora:14:38");

		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < listado.length; i++) {

			System.out.println(listado[i]);
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.printf("\t\t\t\t\t\t  TOTAL: %.2f", calcularTotal(impuesto, impuestoAlimentacion));
		System.out.println();
		System.out.println("\t\t\t\t\t\t  IVA BASE VAL");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\t\t\t GRACIAS POR SU VISITA");
	}
}
