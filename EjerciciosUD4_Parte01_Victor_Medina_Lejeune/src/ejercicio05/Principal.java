package ejercicio05;

public class Principal {
	public static void main(String[] args) {

		Empleado empleado = new Empleado("Pablo", "Perez", 2000, 1);
		Empleado empleado2 = new Vendedor("Alvaro", "Garcia", 1500, 2, 45, 5);
		Empleado empleado3 = new Gerente("Fernando", "Alvarez", 1600, 4, 10);

		int objetivoVentas = 20;
		int tam = 3;
		Empleado[] lista = new Empleado[tam];

		lista[0] = empleado;
		lista[1] = empleado2;
		lista[2] = empleado3;

		Oficina oficina = new Oficina(lista);

		System.out.println("Calcular gastos de la oficina:");
		System.out.println(oficina.calcularGastosOficina());
		System.out.println();

		System.out.println("Sueldo de Pablo");
		System.out.println(oficina.calcularSueldoEmpleado(empleado));
		System.out.println("Sueldo de Alvaro");
		System.out.println(oficina.calcularSueldoEmpleado(empleado2));
		System.out.println("Sueldo de Fernando");
		System.out.println(oficina.calcularSueldoEmpleado(empleado3));

	}
}
