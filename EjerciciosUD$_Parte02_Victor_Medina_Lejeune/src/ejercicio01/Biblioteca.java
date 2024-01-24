package ejercicio01;

public class Biblioteca {

	public void imprimirDatos(Publicaciones[] lista, int numRevista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i] instanceof Revista) {
					((Revista) lista[i]).avisoRevista(numRevista);
				}
			}
		}
	}

}
