package ejercicio1;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		String matricula, direccion;
		int tiempoEstacionado, longitud, centimetrosCubicos, opcion, opcion2, tam = 5, numVehiculos = 0;
		double precioMinutos = 5, precioNavidad = 10;

		Vehiculo vehiculo = new Vehiculo("4683 TGF", 20);
		Vehiculo vehiculo2 = new Furgoneta("8523 CKP", 30, 7);
		Vehiculo vehiculo3 = new Moto("7439 QHV", 18, 120);
		Vehiculo vehiculo4 = new Moto("4593 IRN", 4, 50);

		Vehiculo[] lista = new Vehiculo[tam];
		Parking parking;

		lista[numVehiculos++] = vehiculo;
		lista[numVehiculos++] = vehiculo2;
		lista[numVehiculos++] = vehiculo3;
		lista[numVehiculos++] = vehiculo4;

		parking = new Parking("Lope de Gomara", lista, numVehiculos);

		do {
			System.out.println("""
					1-Calcular precio de un vehiculo
					2-Mostrar todos los vehiculos
					3-Calcular recaudado de motos
					4-Calcular navidad
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca una matricula valida");
				matricula = Leer.dato();
				System.out.printf("El precio a pagar por usar el parking es: %.2f",
						parking.calcularPrecioVehiculoBuscando(vehiculo, matricula, precioMinutos));
				System.out.println();
				break;
			case 2:
				parking.mostrarTodosLosVehiculos();
				System.out.println();
				break;
			case 3:
				System.out.printf("Entre todas las motos se ha recaudado: %.2f€",
						parking.calcularRecaudadoMotos(vehiculo, precioMinutos));
				System.out.println();
				break;
			case 4:
				System.out.println("Estamos en Navidad y para pagar los reyes vamos a cobrar un poco más");
				System.out.println("Introduzca la matricula");
				matricula = Leer.dato();
				System.out.printf("Lo que debe pagar es: %.2f",
						parking.calcularNavidad(precioNavidad, precioMinutos, vehiculo, matricula));
				System.out.println();
				break;
			default:
				System.out.println("Introduzca una opción correcta");

				break;
			case 0:
				System.out.println("Ha salido");
				break;

			}
		} while (opcion != 0);
	}
}
