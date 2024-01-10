package ejercicio01;

public class Portatil extends Ordenador {

	private boolean seguroPantalla;
	private double precioSeguro;

	public Portatil(int capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String marca, int id,
			boolean seguroPantalla, double precioSeguro) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase, marca, id);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

}
