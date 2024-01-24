package ejercicio01;

public class Libro extends Publicaciones {

	public Libro(int anyo, boolean prestado, String nombre) {
		super(anyo, prestado, nombre);
	}

	public int cuentaPrestados(Publicaciones[] lista) {

		int num_prestados = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].isPrestado()) {
					num_prestados++;
				}
			}
		}
		return num_prestados;
	}

	public int publicacionesAnteriores(Publicaciones[] lista, int anyo_comprobar) {

		int num_anteriores = 0;
		for (int i = 0; i < lista.length; i++) {
			if (anyo_comprobar > lista[i].getAnyo()) {
				num_anteriores++;
			}
		}
		return num_anteriores;
	}
}
