package ejercicio03;

public class VehiculosMotor {

	private String matricula;
	private String numeroBastidores;
	private int categoriaEmisiones;

	public VehiculosMotor(String matricula, String numeroBastidores, int categoriaEmisiones) {
		super();
		this.matricula = matricula;
		this.numeroBastidores = numeroBastidores;
		this.categoriaEmisiones = categoriaEmisiones;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroBastidores() {
		return numeroBastidores;
	}

	public void setNumeroBastidores(String numeroBastidores) {
		this.numeroBastidores = numeroBastidores;
	}

	public int getCategoriaEmisiones() {
		return categoriaEmisiones;
	}

	public void setCategoriaEmisiones(int categoriaEmisiones) {
		this.categoriaEmisiones = categoriaEmisiones;
	}

	@Override
	public String toString() {
		return "VehiculosMotor [matricula=" + matricula + ", numeroBastidores=" + numeroBastidores
				+ ", categoriaEmisiones=" + categoriaEmisiones + "]";
	}

	public double calcularImpuesto(double porcentajeCilindrada, double porcentajeCaballos) {
		double impuesto = 0;
		switch (categoriaEmisiones) {
		case 1:
			impuesto = 50;
			break;
		case 2:
			impuesto = 100;
			break;
		case 3:
			impuesto = 150;
			break;
		case 4:
			impuesto = 200;
			break;
		default:
			System.out.println("Introduzca una categoria posible");
			break;
		}
		return impuesto;
	}

}
