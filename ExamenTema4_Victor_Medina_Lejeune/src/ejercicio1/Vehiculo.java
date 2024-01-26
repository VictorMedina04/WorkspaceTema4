package ejercicio1;

public class Vehiculo implements IAparcamiento {

	private String matricula;
	private int tiempoEstacionado;

	public Vehiculo(String matricula, int tiempoEstacionado) {
		super();
		this.matricula = matricula;
		this.tiempoEstacionado = tiempoEstacionado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getTiempoEstacionado() {
		return tiempoEstacionado;
	}

	public void setTiempoEstacionado(int tiempoEstacionado) {
		this.tiempoEstacionado = tiempoEstacionado;
	}

	@Override
	public String toString() {
		return "Vehiculo matricula=" + matricula + ", tiempoEstacionado=" + tiempoEstacionado + "";
	}

	@Override
	public double calcularPrecio(double precioMinutos) {

		return tiempoEstacionado * precioMinutos;
	}

}
