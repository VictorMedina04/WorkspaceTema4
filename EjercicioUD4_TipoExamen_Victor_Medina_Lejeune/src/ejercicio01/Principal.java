package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double precioBase = 500, metrosCuadrados, precioServicioHabitaciones, descuentoSuite;
		boolean ocupada, serviciosLimpieza;
		String nombreCliente;
		int numeroDiasOcupación, numeroOcupantes, numeroHabitacion = 0, opcion, opcion2, tam = 10, numHabitaciones = 10;
		GestionHabitaciones gestionHabitaciones;
		Habitacion habitacion;
		Habitacion[] habitaciones = new Habitacion[tam];

		do {
			System.out.println("""
					1-Añadir a la lista

					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Escoja de que tipo quiere la habitacion");
				System.out.println("1-Habitacion 2-Suite 3-Apartamento");
				opcion2 = Leer.datoInt();
				switch (opcion2) {
				case 1:
					System.out.println("El precio base es de 500€");
					ocupada = true;
					System.out.println("Introduzca el nombre del cliente");
					nombreCliente = Leer.dato();
					System.out.println("Introduzca el número de dias que se queda el cliente");
					numeroDiasOcupación = Leer.datoInt();
					System.out.println("Introduzca el número de cliente/s");
					numeroOcupantes = Leer.datoInt();

					numeroHabitacion++;

					habitacion = new Habitacion(precioBase, ocupada, nombreCliente, numeroDiasOcupación,
							numeroOcupantes, numeroHabitacion);

					gestionHabitaciones = new GestionHabitaciones(habitaciones, numHabitaciones);
					gestionHabitaciones.anyadir(habitacion);
					break;
				case 2:
					System.out.println("El precio base es de 500€");
					ocupada = true;
					System.out.println("Introduzca el nombre del cliente");
					nombreCliente = Leer.dato();
					System.out.println("Introduzca el número de dias que se queda el cliente");
					numeroDiasOcupación = Leer.datoInt();
					System.out.println("Introduzca el número de cliente/s");
					numeroOcupantes = Leer.datoInt();
					System.out.println("Introduzca cuantos metros cuadrados tiene la habitacion");
					metrosCuadrados = Leer.datoDouble();

					numeroHabitacion++;

					habitacion = new Suite(precioBase, ocupada, nombreCliente, numeroDiasOcupación, numeroOcupantes,
							numeroHabitacion, metrosCuadrados, precioServicioHabitaciones);

					gestionHabitaciones = new GestionHabitaciones(habitaciones, numHabitaciones);
					gestionHabitaciones.anyadir(habitacion);
					break;

				}
				break;
			}
		} while (opcion != 0);

	}
}
