package ejemplointerfaces;

public class Persona implements IDepredador {

	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public void localizar(Animal presa) {
		System.out.println("Localizando..");
	}

	@Override
	public void cazar(Animal presa) {
		System.out.println("¡Por la Republica!");
	}

}
