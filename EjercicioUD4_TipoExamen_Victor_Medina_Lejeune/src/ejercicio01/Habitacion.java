package ejercicio01;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numeroDiasOcupación;
	private int numeroOcupantes;
	private int numeroHabitacion;

	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int numeroDiasOcupación,
			int numeroOcupantes, int numeroHabitacion) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numeroDiasOcupación = numeroDiasOcupación;
		this.numeroOcupantes = numeroOcupantes;
		this.numeroHabitacion = numeroHabitacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroDiasOcupación() {
		return numeroDiasOcupación;
	}

	public void setNumeroDiasOcupación(int numeroDiasOcupación) {
		this.numeroDiasOcupación = numeroDiasOcupación;
	}

	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", numeroDiasOcupación=" + numeroDiasOcupación + ", numeroOcupantes=" + numeroOcupantes
				+ ", numeroHabitacion=" + numeroHabitacion + "]";
	}

	public double calcularPrecio(double descuentoSuite) {
		return precioBase * numeroDiasOcupación;
	}
}
