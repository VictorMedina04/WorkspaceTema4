package ejemplo01;

public class Principal {

	public static void main(String[] args) {

		Trabajador trabajador = new Trabajador("Miguel", "Director", "57389226A");
		Empleado empleado = new Empleado("Julio", "Informatico", "54783205Y", 1200.50, 3.50);
		Empleado empleado2 = new Empleado("34364334T", 1500.0, 12.5);
		Consultor consultor = new Consultor("Jose", "Ingeniero", "34539564R", 30, 40);

		System.out.println(trabajador);
		System.out.println(empleado);
		System.out.println(empleado2);

		System.out.println(trabajador.calcularPaga());
		System.out.println(empleado.calcularPaga());
		System.out.println(empleado2.calcularPaga());
		System.out.println(consultor.calcularPaga());
	}

}
