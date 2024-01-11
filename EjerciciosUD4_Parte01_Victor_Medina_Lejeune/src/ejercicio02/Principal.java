package ejercicio02;

public class Principal {

	public static void main(String[] args) {

		String nombreEmpresa = "Asisa", nombreJefe = "Victor Medina", direccion = "Av Don Pepe c/ Los Serranos",
				dni = "57238932E", fecha = "11/01/2024";
		int numeroContacto = 357292484;

		Documento documento = new Documento(nombreEmpresa, nombreJefe, direccion);
		TarjetaDeVisita tarjetaDeVisita = new TarjetaDeVisita(nombreEmpresa, nombreJefe, direccion, dni,
				numeroContacto);
		Carta carta = new Carta(nombreEmpresa, nombreJefe, direccion, fecha);

		System.out.println("------------------------------------");
		documento.imprimir();
		System.out.println("------------------------------------");
		tarjetaDeVisita.imprimir();
		System.out.println("------------------------------------");
		carta.imprimir();
		System.out.println("------------------------------------");

	}

}
