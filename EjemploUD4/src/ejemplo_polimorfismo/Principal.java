package ejemplo_polimorfismo;

public class Principal {

	public static void main(String[] args) {

		Figura figura = new Cuadrado("Cuadrado 1", "Azul", 5);
		Figura figura2 = new Circulo("Circulo 1", "Negro", 3);

		OperacionesFiguras operaciones = new OperacionesFiguras();

		System.out.println(operaciones.calcularAreaUnaFigura(figura));
		System.out.println(operaciones.calcularAreaUnaFigura(figura2));

	}

}
