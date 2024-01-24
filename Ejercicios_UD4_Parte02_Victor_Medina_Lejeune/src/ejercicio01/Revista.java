package ejercicio01;

public class Revista extends Publicaciones {

	private int edicion;

	public Revista(int anyo, boolean prestado, String nombre, int edicion) {
		super(anyo, prestado, nombre);
		this.edicion = edicion;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	@Override
	public String toString() {
		return "" + super.toString() + "edicion=" + edicion + "";
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

	public void avisoRevista(int num) {
		if (edicion == num) {
			System.out.println("Enhorabuena");
		}
	}
}
