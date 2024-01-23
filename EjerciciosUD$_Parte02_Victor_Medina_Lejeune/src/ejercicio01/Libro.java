package ejercicio01;

public class Libro extends Publicaciones {

	public Libro(int anyo, boolean prestado, String nombre) {
		super(anyo, prestado, nombre);
	}

	public int cuentaPrestados(Publicaciones[] publicaciones) {

		int num_prestados = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			if (publicaciones[i].isPrestado()) {
				num_prestados++;
			}
		}
		return num_prestados;
	}

	public int publicacionesAnteriores(Publicaciones[] publicaciones, int anyo_comprobar) {

		int num_anteriores = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			if (anyo_comprobar > publicaciones[i].getAnyo()) {
				num_anteriores++;
			}
		}
		return num_anteriores;
	}
}
