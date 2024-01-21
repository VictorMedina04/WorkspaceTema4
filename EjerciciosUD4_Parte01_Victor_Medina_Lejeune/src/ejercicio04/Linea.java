package ejercicio04;

public class Linea {

	private Producto producto;
	private int cantidadProducto;

	public Linea(Producto producto, int cantidadProducto) {
		super();
		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	@Override
	public String toString() {
		return "" + producto + "\t cantidad  " + cantidadProducto + "";
	}

	public double calcularTotal(double impuesto, double impuestoAlimentacion) {
		double total = 0;

		return producto.calcularTotal(impuesto, impuestoAlimentacion) * cantidadProducto;
	}
}