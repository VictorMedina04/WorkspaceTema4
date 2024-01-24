package ejercicio02;

public class Producto implements IImpuesto {

	@Override
	public double calculoIva(double precio, int iva) {
		return precio + precio * iva;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return 0;
	}

}
