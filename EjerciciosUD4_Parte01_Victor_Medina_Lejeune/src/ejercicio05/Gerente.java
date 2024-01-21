package ejercicio05;

public class Gerente extends Empleado {

	private double impuestoGerente;

	public Gerente(String nombre, String apellido, double sueldoBase, int numero_empleado, double impuestoGerente) {
		super(nombre, apellido, sueldoBase, numero_empleado);
		this.impuestoGerente = impuestoGerente;
	}

	public double getImpuestoGerente() {
		return impuestoGerente;
	}

	public void setImpuestoGerente(double impuestoGerente) {
		this.impuestoGerente = impuestoGerente;
	}

	@Override
	public String toString() {
		return "Gerente [impuestoGerente=" + impuestoGerente + "]";
	}

	public double calcularSueldo() {
		int cien = 100;
		return super.calcularSueldo() - super.calcularSueldo() * impuestoGerente / cien;
	}
}
