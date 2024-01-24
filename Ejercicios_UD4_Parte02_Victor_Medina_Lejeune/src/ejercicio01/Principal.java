package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		Publicaciones libro = new Libro(2000, true, "Mi libro luna de Plutón");
		Publicaciones libro2 = new Libro(1990, false, "El cuarto de atras");
		Publicaciones revista = new Revista(2020, true, "Corazón");
		Publicaciones revista2 = new Revista(2004, false, "Salvame de Limón");

		int tam = 4;
		int anyo_comprobar = 1999;
		Publicaciones[] publicaciones = new Publicaciones[tam];

		publicaciones[0] = libro;
		publicaciones[1] = libro2;
		publicaciones[2] = revista;
		publicaciones[3] = revista2;

		System.out.println(libro.cuentaPrestados(publicaciones));
		System.out.println(libro2.cuentaPrestados(publicaciones));
		System.out.println(revista.cuentaPrestados(publicaciones));
		System.out.println(revista2.cuentaPrestados(publicaciones));
		System.out.println(libro.publicacionesAnteriores(publicaciones, anyo_comprobar));
		System.out.println(libro2.publicacionesAnteriores(publicaciones, anyo_comprobar));
		System.out.println(revista.publicacionesAnteriores(publicaciones, anyo_comprobar));
		System.out.println(revista2.publicacionesAnteriores(publicaciones, anyo_comprobar));
	}
}
