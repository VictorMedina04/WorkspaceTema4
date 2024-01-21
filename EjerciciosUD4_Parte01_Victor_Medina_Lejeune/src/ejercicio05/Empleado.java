package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellido;
	private double sueldoBase;
	private int numero_empleado;

	public Empleado(String nombre, String apellido, double sueldoBase, int numero_empleado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBase = sueldoBase;
		this.numero_empleado = numero_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumero_empleado() {
		return numero_empleado;
	}

	public void setNumero_empleado(int numero_empleado) {
		this.numero_empleado = numero_empleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", sueldoBase=" + sueldoBase
				+ ", numero_empleado=" + numero_empleado + "]";
	}

	public double calcularSueldo() {

		return sueldoBase;
	}

}
