package ejercicio04;

public class Principal {

	public static void main(String[] args) {

		double precioUnitario, impuestoLujo;
		String nombre;
		int id, diasParaCaducar, cantidadProducto, tam = 6;
		boolean caducacion;
		Linea[] listado = new Linea[tam];
		Venta venta = new Venta(listado);

		Producto p1 = new Alimentacion(2.3, "Papa bravas", 1, false);
		Producto p2 = new Alimentacion(1.7, "Cruzcampo", 2, false);
		Producto p3 = new Alimentacion(0.99, "Aceitunas", 3, true);
		Producto p4 = new Electronica(6.99, "iPhone 1", 4, 8.99);
		Producto p5 = new Electronica(150, "Oppo MA7", 5, 20.99);
		Producto p6 = new Electronica(1000.50, "iPadPlus 15", 6, 140.99);

		Linea linea = new Linea(p1, 2);
		Linea linea2 = new Linea(p2, 16);
		Linea linea3 = new Linea(p3, 1);
		Linea linea4 = new Linea(p4, 4);
		Linea linea5 = new Linea(p5, 2);
		Linea linea6 = new Linea(p6, 1);

		listado[0] = linea;
		listado[1] = linea2;
		listado[2] = linea3;
		listado[3] = linea4;
		listado[4] = linea5;
		listado[5] = linea6;

		venta.imprimirTicket();

	}
}
