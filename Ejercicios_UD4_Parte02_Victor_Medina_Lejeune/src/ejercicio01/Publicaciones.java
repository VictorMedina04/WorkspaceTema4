package ejercicio01;

public abstract class Publicaciones implements IImplementacion {

	private int anyo;
	private boolean prestado;
	private String nombre;

	public Publicaciones(int anyo, boolean prestado, String nombre) {
		super();
		this.anyo = anyo;
		this.prestado = prestado;
		this.nombre = nombre;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Publicaciones [anyo=" + anyo + ", prestado=" + prestado + ", nombre=" + nombre + "]";
	}

	// METODOS
	public abstract int cuentaPrestados(Publicaciones[] lista);

	public abstract int publicacionesAnteriores(Publicaciones[] lista, int anyo_comprobar);
}
