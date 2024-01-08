package ejemplo01;

public class Trabajador {
	
	private String nombre;
	private String puesto;
	private String dni;
	private int numero;

	public Trabajador(String nombre, String puesto, String dni, int numero) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + ", numero=" + numero + "]";
	}	
}
