package ejercicio03;

public class Principal {

	public static void main(String[] args) {

		String matricula;
		String numeroBastidores;
		int categoriaEmisiones;
		double cilindrada;
		double potenciaCaballos = 0;
		boolean transporteMercancia;
		int opcion = 1;
		double porcentajeCaballos = 25, porcentajeCilindrada = 60;

		VehiculosMotor vehiculosMotor = new VehiculosMotor("3562 AJR", "29P975328T70527F5", 1);
		Motocicleta motocicleta = new Motocicleta("1265 GFD", "29L975328H70527R5", 2, 45.0);
		Coche coche = new Coche("4554 DGT", "29V975328K70527P5", 3, 564);
		Furgoneta furgoneta = new Furgoneta("0101 DCK", "29Q975328E70527S5", 4, true);

		System.out.println("---------------------------------------------------");
		System.out.println(
				"Impuestos del vehiculo:" + vehiculosMotor.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println("---------------------------------------------------");
		System.out.println("Impuestos de la motocicleta:"
				+ motocicleta.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println("---------------------------------------------------");
		System.out.println("Impuestos del coche:" + coche.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println("---------------------------------------------------");
		System.out.println(
				"Impuestos de la furgoneta:" + furgoneta.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println("---------------------------------------------------");
	}
}
