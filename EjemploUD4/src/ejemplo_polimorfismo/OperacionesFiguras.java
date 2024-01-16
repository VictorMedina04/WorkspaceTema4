package ejemplo_polimorfismo;

public class OperacionesFiguras {

	public double calcularAreaUnaFigura(Figura figura) {
		return figura.calcularArea();
	}

	public double calcularAreaVariasFiguras(Figura[] listaFiguras) {
		double sumaAreas = 0;

		for (int i = 0; i < listaFiguras.length; i++) {
			sumaAreas += calcularAreaUnaFigura(listaFiguras[i]);

		}
		return sumaAreas;
	}

	// ESTA HACE LO MISMO Q LA DE ARRIBA PERO LA DE ARRIBA ES MEJOR
	public double calcularAreaVariasFigurasV2(Figura[] listaFiguras) {

		double sumaAreas = 0;

		for (int i = 0; i < listaFiguras.length; i++) {
			sumaAreas += calcularAreaUnaFigura(listaFiguras[i]);
			if (listaFiguras[i] instanceof Circulo) {
				Circulo circulo = (Circulo) listaFiguras[i];
				circulo.mostrarRadianes();
				// ((Circulo) listaFiguras[i]).mostrarRadianes();
			}
		}

		return sumaAreas;
	}
}
