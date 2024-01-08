package ejemplo01;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;

	public Empleado(String nombre, String puesto, String dni, int numero, double sueldo, double impuestos) {
		super(nombre, puesto, dni, numero);// Llamada al constructor de la clase madre(Trabajador)
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

}
