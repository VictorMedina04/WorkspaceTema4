package ejercicio02;

public class TarjetaDeVisita extends Documento {

	private String dni;
	private int numeroContacto;

	public TarjetaDeVisita(String nombreEmpresa, String nombreJefe, String direccion, String dni, int numeroContacto) {
		super(nombreEmpresa, nombreJefe, direccion);
		this.dni = dni;
		this.numeroContacto = numeroContacto;
	}

	public void imprimirTarjeta() {
		System.out.println("----------------------------------------------------");
		System.out.println("Empresa:" + super.nombreEmpresa);
		System.out.println("Equipo directivo:" + super.nombreJefe);
		System.out.println("Dirección:" + super.direccion);
		System.out.println("DNI:" + dni);
		System.out.println("Número de contacto:" + numeroContacto);
		System.out.println("----------------------------------------------------");
	}

}
