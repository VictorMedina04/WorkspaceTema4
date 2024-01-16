package ejemplo_polimorfismo;

public class Principal {

	public static void main(String[] args) {

		int tam = 2;
		Figura figura = new Cuadrado("Cuadrado 1", "Azul", 5);
		Figura figura2 = new Circulo("Circulo 1", "Negro", 3);

		OperacionesFiguras operaciones = new OperacionesFiguras();

		System.out.println(operaciones.calcularAreaUnaFigura(figura));
		System.out.println(operaciones.calcularAreaUnaFigura(figura2));

		// LOS ARRAY DE CLASES ABSTRACTAS SE PUEDEN INSTANCIAR PERO NO UN OBJETO
		// ABSTRACTO

		Figura[] lista = new Figura[tam];

		lista[0] = figura;
		lista[1] = figura2;

		System.out.println(operaciones.calcularAreaVariasFiguras(lista));
		System.out.println(operaciones.calcularAreaVariasFigurasV2(lista));

	}

}
