package ejercicio04;

public class Producto {

	private double precioUnitario;
	private String nombre;
	private int id;

	public Producto(double precioUnitario, String nombre, int id) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.id = id;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "" + nombre + "\t" + precioUnitario + "\t";
	}

	public double calcularTotal() {

		double total = precioUnitario;

		// precioU + precioU * iva/100
		return total;
	}
}
