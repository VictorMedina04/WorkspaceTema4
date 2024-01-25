package ejercicio02;

public class Trabajador implements IImpuesto {

	private int irpf;

	public Trabajador(int irpf) {
		super();
		this.irpf = irpf;
	}

	@Override
	public double calculoIva(double precio, int iva) {
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {

		return sueldo * irpf / 100;
	}

}
