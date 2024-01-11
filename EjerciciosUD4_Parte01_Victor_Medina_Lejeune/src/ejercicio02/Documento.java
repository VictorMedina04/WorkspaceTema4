package ejercicio02;

public class Documento {

	protected String nombreEmpresa;
	protected String nombreJefe;
	protected String direccion;

	public Documento(String nombreEmpresa, String nombreJefe, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.nombreJefe = nombreJefe;
		this.direccion = direccion;
	}

	public void imprimirDocumento() {
		System.out.println("----------------------------------------------------");
		System.out.println("Empresa:" + nombreEmpresa);
		System.out.println("Equipo directivo:" + nombreJefe);
		System.out.println("Dirección:" + direccion);
		System.out.println("----------------------------------------------------");
	}

}
