package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Ordenador ordenador;
		Portatil portatil;
		Sobremesa sobremesa;

		int capacidadDiscoDuro;
		int frecuenciaProcesador;
		double precioBase, porcentaje;
		String marca;
		int id, respuestaSeguro;
		boolean seguroPantalla = false;
		double precioSeguro;

		System.out.println("Introduzca los datos del portatil");
		System.out.println("Diga la capacidad del disco duro");
		capacidadDiscoDuro = Leer.datoInt();
		System.out.println("Diga la frecuencia del procesador");
		frecuenciaProcesador = Leer.datoInt();
		System.out.println("Diga el precio base del ordenador");
		precioBase = Leer.datoDouble();
		System.out.println("Diga la marca del ordenador");
		marca = Leer.dato();
		id = 1;
		ordenador = new Ordenador(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca, id);
		System.out.println("¿Cuánto porcentaje de ganancia quiere ?");
		porcentaje = Leer.datoDouble();
		System.out.printf("El PVP del ordenardor es %2f", ordenador.calcularPVP(porcentaje));
		System.out.println();
		System.out.println("*******************************************************************");
		System.out.println();
		System.out.println("Introduzca los datos del portatil");
		System.out.println("Diga la capacidad del disco duro");
		capacidadDiscoDuro = Leer.datoInt();
		System.out.println("Diga la frecuencia del procesador");
		frecuenciaProcesador = Leer.datoInt();
		System.out.println("Diga el precio base del portatil");
		precioBase = Leer.datoDouble();
		System.out.println("Diga la marca del portatil");
		marca = Leer.dato();
		id = 2;
		System.out.println("Quiere el seguro 1-Si 2-No");
		respuestaSeguro = Leer.datoInt();
		if (respuestaSeguro == 1) {
			seguroPantalla = true;
		}
		if (respuestaSeguro == 2) {
			seguroPantalla = false;
		}
		portatil = new Portatil(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca, id, seguroPantalla,
				precioBase);
		System.out.println("¿Cuánto porcentaje de ganancia quiere ?");
		porcentaje = Leer.datoDouble();
		System.out.printf("El PVP del portatil es %.2f", portatil.calcularPVP(porcentaje));
		System.out.println();
		System.out.println("*******************************************************************");
		System.out.println("Introduzca los datos del sobremesa");
		System.out.println("Diga la capacidad del disco duro");
		capacidadDiscoDuro = Leer.datoInt();
		System.out.println("Diga la frecuencia del procesador");
		frecuenciaProcesador = Leer.datoInt();
		System.out.println("Diga el precio base del sobremesa");
		precioBase = Leer.datoDouble();
		System.out.println("Diga la marca del sobremesa");
		marca = Leer.dato();
		id = 3;
		sobremesa = new Sobremesa(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca, id, precioBase);
		System.out.println("¿Cuánto porcentaje de ganancia quiere ?");
		porcentaje = Leer.datoDouble();
		System.out.printf("El PVP del sobremesa es %.2f", sobremesa.calcularPVP(porcentaje));
	}

}
