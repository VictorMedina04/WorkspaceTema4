package ejercicio02;

public class Carta extends Documento {

	private String fecha;

	public Carta(String nombreEmpresa, String nombreJefe, String direccion, String fecha) {
		super(nombreEmpresa, nombreJefe, direccion);
		this.fecha = fecha;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Fecha:" + fecha);

	}
}
