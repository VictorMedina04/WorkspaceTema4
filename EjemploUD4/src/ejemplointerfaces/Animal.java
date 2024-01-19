package ejemplointerfaces;

public class Animal implements IDepredador, IPresa {

	private String nombre;
	private int patas;

	public Animal(String nombre, int patas) {
		super();
		this.nombre = nombre;
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", patas=" + patas + "]";
	}

	@Override
	public void localizar(Animal presa) {
		System.out.println("Buscando...");
	}

	@Override
	public void cazar(Animal presa) {
		System.out.println("¡Por el Imperio!");
	}

	@Override
	public void huir() {
		System.out.println("Me las piro vampiro");
		System.out.println("Hasta luego Lucah");
	}

}
