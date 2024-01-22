package ejercicio05;

public class Principal {
	public static void main(String[] args) {

		Empleado empleado = new Empleado("Pablo", "Perez", 2000, 1);
		Empleado empleado2 = new Vendedor("Alvaro", "Garcia", 1500, 2, 45, 5);
		Empleado empleado3 = new Gerente("Fernando", "Alvarez", 1600, 4, 10);

		double objetivoVentas = 20;
		int tam = 3;
		Empleado[] lista = new Empleado[tam];

		int numEmpleados = 0;

		Oficina oficina = new Oficina(lista, numEmpleados);

		oficina.addArray(empleado);
		oficina.addArray(empleado2);
		oficina.addArray(empleado3);

		System.out.println("Calcular gastos de la oficina:");
		System.out.println(oficina.calcularGastosOficina());
		System.out.println();

		oficina.mostrarEmpleados(objetivoVentas);
	}
}
