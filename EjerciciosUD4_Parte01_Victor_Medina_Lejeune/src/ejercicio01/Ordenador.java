package ejercicio01;

public class Ordenador {

	private int capacidadDiscoDuro;
	private int frecuenciaProcesador;
	private double precioBase;
	private String marca;
	private int id;

	public Ordenador(int capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca, int id) {
		super();
		this.capacidadDiscoDuro = capacidadDiscoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public int getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(int frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDiscoDuro=" + capacidadDiscoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}

	public double calcularPVP(double porcentaje) {

		double precioVentaPublico;
		int cien = 100;
		precioVentaPublico = precioBase + (precioBase * porcentaje / cien);
		return precioVentaPublico;
	}

}
