package ejemplo01;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;

	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni);// Llamada al constructor de la clase madre(Trabajador)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public Empleado(String dni, double sueldo, double impuestos) {
		super(dni);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	public double calcularPaga() {
		int cien = 100;
		return sueldo - (sueldo * impuestos / cien);
	}
}
