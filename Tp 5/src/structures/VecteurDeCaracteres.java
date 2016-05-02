package structures;

import java.util.*;

import exceptions.ConstructeurException;

/**
 * Classe qui permet de produire une liste de caractères selon une constante ou
 * selon un tableau de caractères reçu.
 *
 * @author Jocelyn
 *
 */

public class VecteurDeCaracteres {

	private static final char[] TAB_CHAR = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '-' };

	private List<Character> tableCaracteres = null;

	/**
	 * Constructeur sans paramètre. Permet de remplir un tableau indexé de
	 * caractères avec les caractères de A à Z, l'espace et le "-". Met tous les
	 * caractères en majuscule.
	 *
	 * Utilise le constructeur avec paramètres
	 *
	 * @throws ArrayIndexOutOfBoundsException
	 */
	// TODO VecteurDeCaracteres - Compléter le code de la méthode
	public VecteurDeCaracteres() throws ConstructeurException {
	}

	/**
	 * Constructeur avec paramètre. Permet de remplir un tableau indexé de
	 * caractères à partir du tableau de "char" reçu. Met tous les caractères en
	 * majuscule.
	 */
	// TODO VecteurDeCaracteres - Compléter le code de la méthode
	public VecteurDeCaracteres(char[] tabChar) throws ConstructeurException {
	}

	/**
	 * Retourne le caractère selon l'index
	 *
	 * @param index
	 *            l'index du caractère
	 *
	 * @return le caractère selon l'index
	 *
	 * @throws ArrayIndexOutOfBoundsException
	 */
	// TODO getCaractere - Compléter le code de la méthode
	public char getCaractere(int index) throws ArrayIndexOutOfBoundsException {
		return ' ';
	}

	/**
	 * Retourne l'indice du caractère reçu selon le vecteur de caractères
	 *
	 * @param car
	 *            le caractère à trouver
	 *
	 * @return l'indice du caractère ou -1 si le caractères n'est pas trouvé
	 */
	// TODO getIndice - Compléter le code de la méthode
	public int getIndice(char car) {
		return 0;
	}

	/**
	 * La taille du vecteur de caractères
	 *
	 * @return la taille
	 */
	// TODO getTaille - Compléter le code de la méthode
	public int getTaille() {
		return 0;
	}

	/**
	 * Permet de construire une chaîne de caractère structurée pour afficher les
	 * infos d'un objet VecteurDeCaracteres
	 *
	 * <pre>
	 * Exemple de sortie voulue:
	 *
	 * TableDeCorrespondance = [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z,  , -]
	 * </pre>
	 */
	// TODO toString - Compléter le code de la méthode
	@Override
	public String toString() {
		return "Table de correspondance = " + this.tableCaracteres;
	}
}