package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	private String nombreJefe;
	private String direccion;

	public Documento(String nombreEmpresa, String nombreJefe, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.nombreJefe = nombreJefe;
		this.direccion = direccion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreJefe() {
		return nombreJefe;
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		System.out.println("Empresa:" + nombreEmpresa);
		System.out.println("Equipo directivo:" + nombreJefe);
		System.out.println("Dirección:" + direccion);
	}

}
