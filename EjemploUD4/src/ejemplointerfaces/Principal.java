package ejemplointerfaces;

public class Principal {

	public static void main(String[] args) {

		Animal animal = new Animal("Ornitorinco", 4);

		Persona persona = new Persona("Luismi", 49);

		Animal animal2 = new Animal("Manueh", 2);

		animal.cazar(animal);
		persona.cazar(animal);
		animal2.huir();
	}
}
