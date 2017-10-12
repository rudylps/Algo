/**
 * 
 */
package co.simplon;

/**
 * @author Utilisateur
 *
 */
public class Algodemanu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eval=78;
}

	public static void evalNote(int eval) {
		if (eval<0||eval>20) {
			System.out.println("Erreur!!!");
		}
		if (eval<5) {
			System.out.println("Null!!!");
		}
		if (eval<10) {
			System.out.println("A refaire");
		}
		if (eval<13) {
			System.out.println("passable");
		}
		if (eval<15) {
			System.out.println("Bien");
		}
		else {
			System.out.println("Parfait");
		}
	}
}