package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		Publicaciones libro = new Libro(2000, true, "Mi libro luna de Plutón");
		Publicaciones libro2 = new Libro(1990, false, "El cuarto de atras");
		Publicaciones revista = new Revista(2020, true, "Corazón", 5);
		Publicaciones revista2 = new Revista(2004, false, "Salvame de Limón", 10);

		int tam = 4, numRevista = 10;
		int anyo_comprobar = 1999;
		Publicaciones[] lista = new Publicaciones[tam];

		lista[0] = libro;
		lista[1] = libro2;
		lista[2] = revista;
		lista[3] = revista2;

		Biblioteca biblioteca = new Biblioteca();

		mostrarLista(lista);
		System.out.println(libro.cuentaPrestados(lista));
		System.out.println();
		biblioteca.imprimirDatos(lista, numRevista);
	}

	public static void mostrarLista(Publicaciones[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}