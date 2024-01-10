package ejercicio01;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(int capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca, int id,
			double precioMontaje) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca, id);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	public double calcularPVP(double porcentaje) {
		double pvp;
		pvp = super.calcularPVP(porcentaje) + precioMontaje;

		return pvp;
	}
}
