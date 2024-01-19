package ejemplointerfaces;

public interface IDepredador {

	// No hace falta poner abstract en el metodo xq ya viene como tal

	// los metodos por defecto son publicos

	// los atributos son de tipo final(constantes) y public (no suelen tener
	// atributos)

	// las interfaces pueden tener hijas y tienen que ser interfaces no clases y
	// viceversa

	void localizar(Animal presa);

	void cazar(Animal presa);
}