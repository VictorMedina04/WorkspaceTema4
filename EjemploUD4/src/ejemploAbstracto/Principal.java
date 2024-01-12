package ejemploAbstracto;

public class Principal {

	public static void main(String[] args) {

		Cuadrado cuadra2 = new Cuadrado(3, 2, 435253);
		Figura cuadrado = new Cuadrado(1, 2, 60000);
		Rectangulo rectangulo2 = new Rectangulo(3, 2, 42, 325);
		Figura rectangulo = new Rectangulo(3, 2, 60000, 60000);

		System.out.println(rectangulo.calcularArea());
		System.out.println(cuadrado.calcularArea());

	}
}
