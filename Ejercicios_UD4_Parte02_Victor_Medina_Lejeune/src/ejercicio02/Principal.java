package ejercicio02;

public class Principal {
	public static void main(String[] args) {

		Producto producto = new Producto();
		Trabajador trabajador = new Trabajador(35);

		double precio = 5.70;
		int iva = 21;
		double sueldo = 2100;

		System.out.println(trabajador.calculoIrpf(sueldo));
		System.out.println(trabajador.calculoIva(precio, iva));
		System.out.println(producto.calculoIrpf(sueldo));
		System.out.println(producto.calculoIva(precio, iva));
	}
}
